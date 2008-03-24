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

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMetaEntry;
import secolaman.data.entries.StringMetaEntry;

/**
 * The MetaData interface defines attribute/value couples
 * used to describe a Message or Resource. Values can either be
 * Complex numbers or a String objects. The same attribute name
 * can be use for both a Complex value or a String value. 
 * Attribute names (keys) are case-insensitive, while values are case-sensitive.
 * 
 * It's to be noticed that a MedaData object of a published Resource cannot be modified.  
 * 
 * @author jbgiraudeau
 */
public interface MetaData {

	/**
	 * Add a Complex number attribute. 
	 * 
	 * @param key attribute name (not null/empty).
	 * @param val Complex number (not null).
	 */
	public void addComplex(String key, Complex val);

	/**
	 * Add a character string attribute, insignificant spaces will be removed.
	 * 
	 * @param key attribute name (not null/empty).
	 * @param val attribute value.
	 */
	public void addString(String key, String val);
	
	/**
	 * Retrieve the complex number value of the given attribute, if it exists.
	 *  
	 * @param key attribute name.
	 * @return Complex object or null if key not found.
	 */
	public Complex getComplex(String key);

	/**
	 * @return the collection of the Complex numbers attributes of this MetaData object.
	 */
	public Collection<ComplexMetaEntry> getComplexEntries();
	
	/**
	 * Retrieve the value of the given attribute, if it exists.
	 * 
	 * @param key attribute name.
	 * @return value or null if key not found.
	 */
	public String getString(String key);

	/**
	 * @return the collection of the String attributes of this MetaData object.
	 */
	public Collection<StringMetaEntry> getStringEntries();

	/**
	 * Remove a Complex number attribute.
	 * 
	 * @param key the key of the attribute to be removed.
	 */
	public void removeComplexEntry(String key);

	/**
	 * Remove a String attribute.
	 * 
	 * @param key the key of the attribute to be removed.
	 */
	public void removeStringEntry(String key);
	
}
