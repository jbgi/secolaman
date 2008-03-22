package secolaman.data;

import java.util.Collection;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMatcherEntry;
import secolaman.data.entries.StringMatcherEntry;

public interface MetaMatcher {

	public void addComplexMatcher(String key, Complex val, double delta);

	public void addRegexMatcher(String key, String val, boolean caseSensitive);

	public void addStringMatcher(String key, String val, boolean caseSensitive);

	public Collection<ComplexMatcherEntry> getComplexMatchers();

	public Collection<StringMatcherEntry> getRegexMatchers();

	public Collection<StringMatcherEntry> getStringMatchers();

	public void removeComplexMatcher(String key);

	public void removeRegexMatcher(String key);

	public void removeStringMatcher(String key);

}
