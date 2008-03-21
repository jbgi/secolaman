package secolaman.data;

import java.util.Iterator;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMatcherEntry;
import secolaman.data.entries.StringMatcherEntry;

public interface MetaMatcher {

	public void addStringMatcher(String key, String val, boolean caseSensitive);

	public void addRegexMatcher(String key, String val, boolean caseSensitive);

	public void addComplexMatcher(String key, Complex val, double delta);

	public Iterator<StringMatcherEntry> getStringMatcherIterator();

	public Iterator<StringMatcherEntry> getRegexMatcherIterator();

	public Iterator<ComplexMatcherEntry> getComplexMatcherIterator();

	public void removeRegexMatcher(String key);

	public void removeStringMatcher(String key);

	public void removeComplexMatcher(String key);

}
