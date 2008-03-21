package secolaman.impl.data.entries;

import secolaman.data.entries.StringMatcherEntry;

public class StdStringMatcherEntry implements StringMatcherEntry {

	private boolean caseSenstive;
	
	private String key;
	
	private String val;
	
	public StdStringMatcherEntry(String key, String val, boolean caseSenstive) {
		this.caseSenstive = caseSenstive;
		this.key = key;
		this.val = val;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public String getVal() {
		return val;
	}

	@Override
	public boolean isCaseSentive() {
		return caseSenstive;
	}

}
