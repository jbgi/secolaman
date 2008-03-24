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
package secolaman.data;

import java.util.Collection;

import secolaman.net.Peer;
import secolaman.net.RessourceHandler;

/**
 * Resource object define a unique resource published within a given group.
 * 
 * @author jbgiraudeau
 */
public interface Resource {

	/**
	 * Delete a resource (MetaData AND Content).
	 */
	public void delete();
	
	/**
	 * Delete the Content but keep the resource MetaData. 
	 */
	public void deleteContent();
	
	/**
	 * Try to download the MetaData and Content of the current resource.
	 * 
	 * @param handler the handler object that may receive the signal
	 * that the resource content have been downloaded.
	 */
	public void download(RessourceHandler handler);
	
	/**
	 * Try to download the MetaData for the current resource.
	 * 
	 * @param handler the handler object that may receive the signal
	 * that the resource metadata have been downloaded.
	 */
	public void downloadMetaData(RessourceHandler handler);
	
	/**
	 * Return the metadata object of the resource if locally available.  
	 * 
	 * @return MetaData object describing the resource or null. 
	 */
	public MetaData getMetaData();
	
	/**
	 * Return the peers known to have downloaded this resource.
	 * 
	 * @return a collection of Peer object.
	 */
	public Collection<Peer> getMirrors();
	
	/**
	 * Return the Content object of the resource if locally available.
	 * 
	 * @return Content object for this resource or null.
	 */
	public Content getContent();
	
	/**
	 * @return the unique identifier for this resource.
	 */
	public String getRessourceID();

}
