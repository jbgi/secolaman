package secolaman.impl.data.internal.entries;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMetaEntry;

public class StdComplexMetaEntry implements ComplexMetaEntry {

	private String key;
	
	private Complex val;
	
	public StdComplexMetaEntry(String key, Complex val) {
		this.key = key;
		this.val = val;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Complex getVal() {
		return val;
	}

}
