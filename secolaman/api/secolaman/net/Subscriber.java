package secolaman.net;

import secolaman.data.MetaMatcher;

public interface Subscriber {

	public void addHandler(RessourceHandler handler, boolean includeOldRessources);
	
	public MetaMatcher getMatcher();
	
	public String getName();
	
	public boolean isEnabled();
	
	public void removeHandler(RessourceHandler handler);
	
	public void setEnabled(boolean enabled);
	
}
