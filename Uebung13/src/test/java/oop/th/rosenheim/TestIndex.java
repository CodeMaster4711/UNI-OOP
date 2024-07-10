package oop.th.rosenheim;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.logging.Logger;

/**
 * Die TestIndex Klasse
 * @author  	Professoren der Informatikfakultät
 * @version     1.0
 * Created 		3.6.2016, Muehlbauer
 * Modified 	12.4.2020, Silke Lechner-Greite
 */
class TestIndex  {

	private static Logger logger = Logger.getLogger(Index.class.getName());

	private List<String>[] book = null;

	@BeforeEach
	void setUp() {
		// generate book with 6 pages and a few keywords

		book = new List[6];

		//	no entries on page 0
		book[0] = new ArrayList<String>();

		book[1] = new ArrayList<String>();
		book[1].add("otto");
		book[1].add("robert");
		book[1].add("hugo");

		book[2] = new ArrayList<String>();
		book[2].add("otto");
		book[2].add("ernst");
		book[2].add("rudi");

		// no entries on page 3
		book[3] = new ArrayList<String>();

		book[4] = new ArrayList<String>();
		book[4].add("otto");
		book[4].add("hugo");
		book[4].add("jack");

		book[5] = new ArrayList<String>();
		book[5].add("otto");
		book[5].add("susi");
		book[5].add("jack");

		Set<String> keywords = new HashSet<String>();
		keywords.add("otto");
		keywords.add("susi");
		keywords.add("jack");
	}

	@Test
	void testIndex() {
		Map<String, SortedSet<Integer>> idx = Index.makeIndex(book);
		assertEquals(7, idx.size(),"Size of Index");
		assertEquals(4, idx.get("otto").size(),"Pages where otto shows up");
		assertTrue(idx.get("otto").contains(1));
		assertTrue(idx.get("otto").contains(2));
		assertTrue(idx.get("otto").contains(4));
		assertTrue(idx.get("otto").contains(5));
		assertFalse(idx.get("susi").contains(3));

		logger.info("\n" + Index.toString(idx));
	}



}
