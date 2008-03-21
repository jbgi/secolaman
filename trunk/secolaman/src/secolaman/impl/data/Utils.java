package secolaman.impl.data;

import java.util.Iterator;
import java.util.regex.Pattern;

import org.apache.commons.math.complex.Complex;

import secolaman.data.MetaData;
import secolaman.data.MetaMatcher;
import secolaman.data.entries.ComplexMatcherEntry;
import secolaman.data.entries.StringMatcherEntry;

public abstract class Utils {

	public static void checkForNullAndThrow(Object val)
	{
		if (val == null)
			throw new IllegalArgumentException("Value must not be null");
	}
	
	public static void checkKeyAndThrow(String key)
	{
		if (key == null || key.isEmpty() || key.length()>128)
			throw new IllegalArgumentException("key must not be null and length must be <= 128 characters");
	}
	
	public static void checkValAndThrow(String val)
	{
		if (val == null || val.isEmpty() || val.length()>512)
			throw new IllegalArgumentException("Value must not be null and length must be <= 512 characters");
	}
	
	public static Pattern getPattern(StringMatcherEntry regexMatcher){
		return Pattern.compile(regexMatcher.getVal(), regexMatcher.isCaseSentive() ? 0 : 
			Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
	}
	
	public static boolean isStringMatch(MetaData metaData, MetaMatcher matcher)
	{
		boolean res = true;
		Iterator<StringMatcherEntry> it = matcher.getStringMatcherIterator();
		StringMatcherEntry sme;
		String toTest;
		String toMatch;
		while (res && it.hasNext())
		{
			sme = it.next();
			toTest = metaData.getString(sme.getKey());
			if (toTest == null)
			{
				res = false;
			}
			else
			{
				toMatch = sme.getVal();
				if (toMatch != null && !toMatch.isEmpty())
				{
					if (sme.isCaseSentive())
						res = toTest.equals(toMatch);
					else
						res = toTest.equalsIgnoreCase(toMatch);
					
				}				
			}
		}
		return res;
	}
	
	public static boolean isComplexMatch(MetaData metaData, MetaMatcher matcher)
	{
		boolean res = true;
		Iterator<ComplexMatcherEntry> it = matcher.getComplexMatcherIterator();
		ComplexMatcherEntry cme;
		while (res && it.hasNext())
		{
			cme = it.next();
			Complex toTest = metaData.getComplex(cme.getKey());
			if (toTest == null)
			{
				res = false;
			}
			else
			{
				if (cme.getVal() != null)
				{
					res = cme.getVal().subtract(toTest).abs() <= cme.getDelta(); 
				}
			}
		}
		return res;
	}
	
	
}
