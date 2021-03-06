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
package secolaman.data.entries;

import org.apache.commons.math.complex.Complex;

/**
 * Complex number matcher entry
 * 
 * @author jbgiraudeau
 */
public interface ComplexMatcherEntry {

	/**
	 * @return median value of the matching interval.
	 */
	public double getDelta();

	/**
	 * @return the name of the attribute to check for matching.
	 */
	public String getKey();

	/**
	 * @return deviation allowed from the median value.
	 */
	public Complex getMedian();

}
