package oop.th.rosenheim;
import java.util.*;

/**
 * Die Index Klasse zum Implementieren einer "Map"
 * @author  	Professoren der Informatikfakultät
 * @version     1.0
 * Created 		3.6.2016, Muehlbauer
 * Modified 	12.4.2020, Silke Lechner-Greite
 */
public abstract class Index {

	/**
	 * generate index (data structure "map") where key is a string that represents the keyword and
	 * value is a set (sorted by increasing page number) with all book pages on which the keyword appears.
	 * 
	 * @param keywords array of lists where each lists contains the keywords of an individual book page
	 * @return index where key is a String with the keyword, and value how often keyword occurs in book.
	 */
	public static Map<String, SortedSet<Integer>> makeIndex(List<String>[] keywords) {
		// Hint 1: Since index must be sorted alphabetically, TreeMap must be used and not HashMap!
		// Hint 2: wrapper "Integer" must be used since primitive data types not allowed in Java Collection
		// Map<String, SortedSet<Integer>> result =

		Map<String, SortedSet<Integer>> index = new TreeMap<>();

		for (int i = 0; i < keywords.length; i++) {
			List<String> pageKeywords = keywords[i];
			for (String keyword : pageKeywords) {
				index.computeIfAbsent(keyword, k -> new TreeSet<>()).add(i);
			}
		}

		return index;
	}



	/**
	 * returns a string with the content of the index (one line per keyword)
	 *
	 * @return string that displays the content of the index.
	 */
	public static String toString(Map<String, SortedSet<Integer>> idx) {

		StringBuffer result = new StringBuffer();
		for(Map.Entry<String, SortedSet<Integer>> entry : idx.entrySet()) {
			result.append(entry.getKey() + " : ");
			for(Integer i : entry.getValue()) {
				result.append(i + " ");
			}
			result.append("\n");
		}
		return null;
	}
}
