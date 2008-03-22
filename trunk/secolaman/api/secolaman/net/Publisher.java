package secolaman.net;

import java.util.Collection;

import secolaman.data.MetaMatcher;
import secolaman.data.Ressource;

public interface Publisher {

	public void downloadRecord(Ressource ressource, RessourceHandler handler);
	
	public Collection<Ressource> findLocally(MetaMatcher matcher);
	
	public Collection<Ressource> findLocally(MetaMatcher matcher, boolean withRecord);

	public void publish(Ressource ressource);
	
	public void register(RessourceHandler handler, MetaMatcher matcher, boolean lookLocally);
	
	public void register(RessourceHandler handler, MetaMatcher matcher, boolean lookLocally, boolean withRecord);
	
	public void unregister(RessourceHandler handler);
	
}
