package secolaman.data;

import java.util.Collection;

import secolaman.net.Peer;
import secolaman.net.RessourceHandler;

public interface Ressource {

	public void delete();
	
	public void deleteContent();
	
	public void download(RessourceHandler handler);
	
	public void downloadMetaData(RessourceHandler handler);
	
	public MetaData getMetaData();
	
	public Collection<Peer> getMirrors();
	
	public Content getRecord();
	
	public String getRessourceID();

}
