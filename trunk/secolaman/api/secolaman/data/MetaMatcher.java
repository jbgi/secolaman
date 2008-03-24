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
import java.util.regex.PatternSyntaxException;

import org.apache.commons.math.complex.Complex;

import secolaman.data.entries.ComplexMatcherEntry;
import secolaman.data.entries.StringMatcherEntry;

/**
 * MetaMatcher object define a set of attribute matcher.
 * A MetaMatcher object matches a given MetaData object
 * if all attribute matchers are satisfied.
 *   
 * @author jbgiraudeau
 */
public interface MetaMatcher {

	/**
	 * Add a complex attribute matcher.
	 * Match attributes from the interval define by the given median value and delta. (inclusive)
	 *  
	 * A null median value will match any attribute value.
	 * 
	 * @param key the name of the attribute to check for matching.
	 * @param median median value of the matching interval. 
	 * @param delta deviation allowed from the median value.
	 */
	public void addComplexMatcher(String key, Complex median, double delta);

	/**
	 * Add a regex matcher (for string attributes).
	 * Replace any string matcher previously defined for the same key.
	 * 
	 * @param key the name of the attribute to check for matching.
	 * @param regex a regular expression defining matching values.
	 * @param caseSensitive matching is case sensitive
	 * 
	 * @throws PatternSyntaxException If the regex's syntax is invalid
	 */
	public void addRegexMatcher(String key, String regex, boolean caseSensitive);

	/**
	 * Add a exact value matcher. This is for performance issues,
	 * when exact matching is wanted and regex is overkill.
	 * Replace any regex matcher previously defined for the same key.
	 * 
	 * @param key the name of the attribute to check for matching.
	 * @param value the exact value to match.
	 * @param caseSensitive matching is case sensitive.
	 */
	public void addStringMatcher(String key, String value, boolean caseSensitive);

	/**
	 * @return the collection of Complex number matchers defined.
	 */
	public Collection<ComplexMatcherEntry> getComplexMatchers();

	/**
	 * @return the collection of regex matchers defined.
	 */
	public Collection<StringMatcherEntry> getRegexMatchers();

	/**
	 * @return the collection of string matchers defined.
	 */
	public Collection<StringMatcherEntry> getStringMatchers();

	/**
	 * Remove the Complex number matcher for the given attribute key.
	 * @param key the key of the attribute for which the matcher was defined.
	 */
	public void removeComplexMatcher(String key);


	/**
	 * Remove the string or regex matcher for the given attribute key. 
	 * @param key the key of the attribute for which the matcher was defined.
	 */
	public void removeMatcher(String key);

}
