package secolaman.net;

import java.util.Set;

import secolaman.data.Message;
import secolaman.data.MetaMatcher;
import secolaman.data.Ressource;

public interface Publisher {

	public void delete(Subscriber subscriber);

	public Set<Ressource> findLocally(MetaMatcher matcher);

	public Set<Ressource> findLocally(MetaMatcher matcher, boolean withRecord);
	
	public Ressource getRessource(String RessourceID);
	
	public Subscriber getSubscriber(String name);
	
	public Set<Subscriber> getSubscribers();
	
	public void publish(Message message);
	
	public void register(Subscriber subscriber);
	
}
