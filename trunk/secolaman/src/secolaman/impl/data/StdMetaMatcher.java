package secolaman.impl.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.apache.commons.math.complex.Complex;

import secolaman.data.MetaMatcher;
import secolaman.data.entries.ComplexMatcherEntry;
import secolaman.data.entries.StringMatcherEntry;
import secolaman.impl.data.entries.StdComplexMatcherEntry;
import secolaman.impl.data.entries.StdStringMatcherEntry;

public class StdMetaMatcher implements MetaMatcher {

	private HashMap<String, ComplexMatcherEntry> complexMatcherEntries;
	
	private HashMap<String, StringMatcherEntry> regexMatcherEntries;
	
	private HashMap<String, StringMatcherEntry> stringMatcherEntries;
	
	@Override
	public void addComplexMatcher(String key, Complex val, double delta) {
		Utils.checkKeyAndThrow(key);
		Utils.checkForNullAndThrow(val);
		complexMatcherEntries.put(key, new StdComplexMatcherEntry(key, val, delta));
	}

	@Override
	public void addRegexMatcher(String key, String val, boolean caseSensitive) {
		Utils.checkKeyAndThrow(key);
		Utils.checkForNullAndThrow(val);
		if (stringMatcherEntries.containsKey(key))
			throw new IllegalArgumentException("A string matcher has already been defined for this key");
		Pattern.compile(val);
		regexMatcherEntries.put(key, new StdStringMatcherEntry(key, val, caseSensitive));
	}

	@Override
	public void addStringMatcher(String key, String val, boolean caseSensitive) {
		Utils.checkKeyAndThrow(key);
		Utils.checkValAndThrow(val);
		if (regexMatcherEntries.containsKey(key))
			throw new IllegalArgumentException("A regex matcher has already been defined for this key");
		stringMatcherEntries.put(key, new StdStringMatcherEntry(key, val, caseSensitive));
	}

	@Override
	public Iterator<ComplexMatcherEntry> getComplexMatcherIterator() {
		return complexMatcherEntries.values().iterator();
	}

	@Override
	public Iterator<StringMatcherEntry> getRegexMatcherIterator() {
		return regexMatcherEntries.values().iterator();
	}

	@Override
	public Iterator<StringMatcherEntry> getStringMatcherIterator() {
		return stringMatcherEntries.values().iterator();
	}

	@Override
	public void removeComplexMatcher(String key) {
		complexMatcherEntries.remove(key);
	}

	@Override
	public void removeRegexMatcher(String key) {
		regexMatcherEntries.remove(key);
	}

	@Override
	public void removeStringMatcher(String key) {
		stringMatcherEntries.remove(key);

	}

}
