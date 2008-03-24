package secolaman.net;


public class PeerEvent {

	public static final int NAME_CHANGE = 1;
	
	public static final int DISCONNECTED = 2;

	public static final int CONNECTED = 3;
	
	private Peer peer;
	
	private int eventType;
	
	public PeerEvent(Peer peer, int eventType){
		this.peer = peer;
		this.eventType = eventType;
	}
	
	public Peer peer()
	{
		return peer;
	}
	
	public int event()
	{
		return eventType;
	}
	
}
