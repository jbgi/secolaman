package secolaman.impl.data;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.math.complex.Complex;

import secolaman.data.MetaData;
import secolaman.data.entries.ComplexMetaEntry;
import secolaman.data.entries.StringMetaEntry;
import secolaman.impl.data.entries.StdComplexMetaEntry;
import secolaman.impl.data.entries.StdStringMetaEntry;

public class StdMetaData implements MetaData {

	private HashMap<String, ComplexMetaEntry> complexEntries = new HashMap<String, ComplexMetaEntry>();
	
	private HashMap<String, StringMetaEntry> stringEntries = new HashMap<String, StringMetaEntry>();

	@Override
	public void addComplex(String key, Complex val) {
		Utils.checkKeyAndThrow(key);
		Utils.checkForNullAndThrow(val);
		complexEntries.put(key, new StdComplexMetaEntry(key, val));
	}

	@Override
	public void addString(String key, String val) {
		Utils.checkKeyAndThrow(key);
		Utils.checkValAndThrow(val);
		stringEntries.put(key, new StdStringMetaEntry(key, val));
	}

	@Override
	public Complex getComplex(String key) {
		return complexEntries.get(key).getVal();
	}

	@Override
	public Iterator<ComplexMetaEntry> getComplexEntriesIterator() {
		return complexEntries.values().iterator();
	}

	@Override
	public String getString(String key) {
		return stringEntries.get(key).getVal();
	}

	@Override
	public Iterator<StringMetaEntry> getStringEntriesIterator() {
		return stringEntries.values().iterator();
	}

	@Override
	public void removeComplexEntry(String key) {
		complexEntries.remove(key);
	}

	@Override
	public void removeStringEntry(String key) {
		stringEntries.remove(key);
	}

}
