package secolaman.impl.data.entries;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMatcherEntry;

public class StdComplexMatcherEntry implements ComplexMatcherEntry {

	private double delta;
	
	private String key;
	
	private Complex val;
	
	public StdComplexMatcherEntry(String key, Complex val, double delta) {
		this.delta = delta;
		this.key = key;
		this.val = val;
	}

	@Override
	public double getDelta() {
		return delta;
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
