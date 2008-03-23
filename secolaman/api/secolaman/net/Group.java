package secolaman.net;

import java.util.Set;

import secolaman.GroupListener;
import secolaman.data.Message;

public interface Group {

	public void addGroupListener(GroupListener listener);

	public void connect();

	public void disconnect();

	public Set<Peer> getPeers();

	public Publisher getPublisher();

	public boolean isConnected();
	
	public Message newMessage();
	
	public Subscriber newSubsciber(String name, boolean withRecords);
	
	
}
