package secolaman;

import java.util.Set;

import secolaman.data.Ressource;
import secolaman.net.Group;
import secolaman.net.GroupInfo;

public interface Connector {
	
	public void addGroupListener(GroupListener listener);

	public Group createGroup(GroupInfo groupInfo);

	public void deleteGroup(Group group);

	public Set<Group> getGroups();

	public GroupInfo newGroupInfo();
	
	public Ressource newRessource();

}
