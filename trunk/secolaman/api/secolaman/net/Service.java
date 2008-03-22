package secolaman.net;

import secolaman.data.MetaMatcher;
import secolaman.data.Ressource;

public interface Service {

	public void sendAll(Ressource ressource);

	public void sendTo(String peerID, Ressource ressource);

	public void setDefaultHandler(RessourceHandler handler);

	public void subscribe(RessourceHandler handler, MetaMatcher matcher);

	public void unsubscribe(RessourceHandler handler);

}
