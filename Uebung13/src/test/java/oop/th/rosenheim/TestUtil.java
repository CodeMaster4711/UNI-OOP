package oop.th.rosenheim;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Junit5 Tester to test Util
 *
 * @author  	Professoren der Informatikfakultät
 * @version     1.0
 * Created 	    3.6.2016, Wolfgang Mühlbauer
 * Modified     5.4.2020,  Silke Lechner-Greite
 */
class TestUtil {

	private List<String> list1;
	private List<String> list2;

	@BeforeEach
	void setUp() {
		list1 = new ArrayList<String>();
		list1.addAll(
				Arrays.asList(
						new String[] { "wort1", "wort2", "wort3", "wort4", "wort5" }));
		list2 = new ArrayList<String>();
		list2.addAll(
				Arrays.asList(
						new String[] { "wort5", "wort4", "wort3", "wort2", "wort1" }));
	}


	@Test
	void testReverse2() {
		List<String> list3 = Util.reverse2(list1);
		assertTrue(list2.equals(list3));
	}

	@Test
	void testReverse1() {
		Util.reverse1(list2);
		assertTrue(list1.equals(list2));
	}

}
