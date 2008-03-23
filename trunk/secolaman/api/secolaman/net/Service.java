package secolaman.net;

import secolaman.data.Message;
import secolaman.data.MetaMatcher;

public interface Service {

	public void addHandler(RessourceHandler handler, MetaMatcher matcher);

	public void removeHandler(RessourceHandler handler);

	public void sendAll(Message message);

	public void sendTo(String peerID, Message message);

	public void setDefaultHandler(MessageHandler handler);

}
