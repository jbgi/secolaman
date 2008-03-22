package secolaman.net;

import java.util.Set;

import secolaman.data.MetaMatcher;
import secolaman.data.Ressource;

public interface Publisher {

	public void deleteRessource(Ressource ressource, boolean keepMetaData);
	
	public void downloadRecord(Ressource ressource, RessourceHandler handler);
	
	public Set<Ressource> findLocally(MetaMatcher matcher);

	public Set<Ressource> findLocally(MetaMatcher matcher, boolean withRecord);
	
	public boolean isRessourceAvailableFromPeer(String ressourceID, String peerID);
	
	public Set<String> peersHavingRessource(String ressourceID);
	
	public void publish(Ressource ressource);
	
	public void subscribe(RessourceHandler handler, MetaMatcher matcher, boolean lookLocally);

	public void subscribe(RessourceHandler handler, MetaMatcher matcher, boolean lookLocally, boolean withRecord);
	
	public void unsubscribe(RessourceHandler handler);
	
}
