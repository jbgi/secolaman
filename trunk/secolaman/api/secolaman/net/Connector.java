/* 
 * This file is part of Secolaman
 * (SEmantic COmmunication LAyer for Mobile Ad'hoc Networks)
 * 
 * Secolaman <http://secolaman.googlecode.com> is free software: 
 * you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * Secolaman is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Secolaman.  If not, see <http://www.gnu.org/licenses/>.
 */
package secolaman.net;

import java.util.Set;

import secolaman.net.exceptions.GroupConfigurationException;


/**
 * A connector object define the low level protocols shared by all groups.
 * 
 * @author jbgiraudeau
 */
public interface Connector {

	/**
	 * This method will delete the group and its database.
	 * Published files are not deleted to avoid unnecessary complaints. 
	 * 
	 * @param group the Group to be deleted.
	 */
	public void deleteGroup(Group group);

	/**
	 * Groups initialized from this connector
	 * 
	 * @return Set of initialized groups
	 */
	public Set<Group> getGroups();

	/**
	 * Initialize a group from a {@link GroupInfo} object.
	 * It will create the specified directories if not exist. 
	 * 
	 * @param groupInfo the GroupInfo specifying the group settings. 
	 * @return a (not connected) Group.
	 * @throws GroupConfigurationException if the given GroupInfo object contains invalid values.
	 */
	public Group initializeGroup(GroupInfo groupInfo) throws GroupConfigurationException;

	/**
	 * Create a new groupInfo object with default values.
	 * 
	 * @return a ready to use GroupInfo object.
	 */
	public GroupInfo newGroupInfo();
	
	/**
	 * Enable or disable the routing protocol.
	 * Routing protocol should be disabled when connected to a wired network or managed wireless network.
	 * Peers in MANET should enable routing unless already provided by OS. 
	 * @param enabled disable or enable routing protocol (default enabled)
	 */
	public void setRouting(boolean enabled);

}
