package secolaman.data;

import java.util.Iterator;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMetaEntry;
import secolaman.data.entries.StringMetaEntry;

public interface MetaData {

	public void addString(String key, String val);

	public void addComplex(String key, Complex val);

	public Iterator<StringMetaEntry> getStringEntriesIterator();

	public Iterator<ComplexMetaEntry> getComplexEntriesIterator();

	public void removeStringEntry(String key);

	public void removeComplexEntry(String key);
}
