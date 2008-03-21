package secolaman.impl.data.internal.entries;

import secolaman.data.entries.StringMetaEntry;

public class StdStringMetaEntry implements StringMetaEntry {

	private String key;
	
	private String val;
	
	public StdStringMetaEntry(String key, String val) {
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

}
