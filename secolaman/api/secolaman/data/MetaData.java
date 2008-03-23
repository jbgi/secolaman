package secolaman.data;

import java.util.Collection;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMetaEntry;
import secolaman.data.entries.StringMetaEntry;

public interface MetaData {

	public void addComplex(String key, Complex val);

	public void addString(String key, String val);
	
	public Complex getComplex(String key);

	public Collection<ComplexMetaEntry> getComplexEntries();
	
	public String getString(String key);

	public Collection<StringMetaEntry> getStringEntries();

	public void removeComplexEntry(String key);

	public void removeStringEntry(String key);
	
}
