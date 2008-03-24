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

import java.io.File;

/**
 * Interface to access and store binary content of a Message or Resource object.
 * Since this content is fully loaded into memory when a message is sent or received, 
 * large contents could lead to some kind of memory exceptions.
 * 
 * @author jbgiraudeau
 */
public interface Content {
	
	/**
	 * Return the byte array stored by this content.
	 * Either directly or by reading a file on-disk.
	 * 
	 * @return an array of byte
	 */
	public byte[] getBytes();
	
	/**
	 * Return the file for this content if it exists.
	 * 
	 * @return a the file object of this content or null.
	 */
	public File getFile() ;
	
	/**
	 * Hold the given byte array in this Content object.
	 * 
	 * @param content a byte array
	 */
	public void setContent(byte[] content);
	
	/**
	 * Use the given file has content of this message.
	 * 
	 * @param file the file to use for this content.
	 */
	public void setFile(File file);
	
}
