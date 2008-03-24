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

import secolaman.net.Service;

/**
 * A message object is either a yet-to-be-published resource
 * or of direct use with a {@link Service} object.
 * 
 * @author jbgiraudeau
 */
public interface Message {

	/**
	 * @return the MedaData object describing this message.
	 */
	public MetaData getMetaData();
	
	/**
	 * @return the Content object for this message. 
	 */
	public Content getContent();
	
}
