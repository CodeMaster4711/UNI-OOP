package oop.th.rosenheim;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Klasse TestCompactDisc to test CompactDisc
 * @author  	Professoren und Tutoren der Informatikfakultät
 * @version     1.0<br>
 * Created 		19.05.2016, Muehlbauer<br>
 * Modified 	5.4.2020, Silke Lechner-Greite<br>
 * Modified		13.3.2021, Bernd Weiss
 *
 */
@DisplayName("CompactDisc Tests:")
class TestCompactDisc {
	private static CompactDisc cd1;
	private static CompactDisc cd2;
	private static CompactDisc cd3;
	private static CompactDisc cd4;
	private static CompactDisc cd5;
	private static CompactDisc cd6;
	private static CompactDisc cd6a;
	private static CompactDisc cd6b;
	private static CompactDisc cd7;
	private static CompactDisc cd8;

	private static Logger logger = Logger.getLogger(TestCompactDisc.class.getName());;

	@BeforeAll
	static void setUpBeforeClass() {
		cd1 = new CompactDisc("lena", "My Cassette Player", 2011, "Universal Music Domestic Pop");
		cd2 = new CompactDisc("Scorpions", "Crazy World", 1990, "Mercury");
		cd3 = new CompactDisc("Die Toten Hosen", "Damenwahl", 1986, "Virgin");
		cd4 = new CompactDisc("Toto", "Toto IV", 1988, "Sony Music");
		cd5 = new CompactDisc("The The", "Soul Mining", 2002, "Epic");
		cd6 = new CompactDisc("The who", "Who'S Next", 1995, "Polydor");
		cd6a = new CompactDisc("The Who", "Who'S Next", 1995, "Polydor");
		cd6b = new CompactDisc("THE who", "Who'S NEXT", 1990, "PolydorOOPS");
		cd7 = new CompactDisc("Die!", "Stigmata", 2006, "Black Bards Entertainment");
		cd8 = new CompactDisc("Die Toten Koepfe", "Herrenqual", 1876, "Gibtsimmernochnicht");
	}

	@Test
	@DisplayName("equals test")
	void testEquals() {
		assertEquals(cd1, cd1);
		assertEquals(cd4, cd4);
		assertNotEquals(cd2, cd3);
		assertNotEquals(null, cd6);
		assertNotEquals(cd1, new String("Hallo"));
		assertEquals(cd6, cd6a);
		assertEquals(cd6, cd6b);
		logger.info("testEquals erfolgreich");
	}

	// Achtung: direkt vergleichen
	@Test
	@DisplayName("toString test")
	void testToString() {
		logger.info(cd1.toString());
		logger.info(cd2.toString());
		logger.info(cd3.toString());
		logger.info(cd4.toString());
		logger.info(cd5.toString());
		logger.info(cd6.toString());
		logger.info(cd7.toString());
		logger.info("testToString erfolgreich");
	}

	@Test
	@DisplayName("hashCode test")
	void testHashCode() {
		assertEquals(cd1.hashCode(), cd1.hashCode());
		assertEquals(cd2.hashCode(), cd2.hashCode());
		assertEquals(cd3.hashCode(), cd3.hashCode());
		assertEquals(cd4.hashCode(), cd4.hashCode());
		assertEquals(cd5.hashCode(), cd5.hashCode());
		assertEquals(cd6.hashCode(), cd6.hashCode());
		assertEquals(cd6a.hashCode(), cd6a.hashCode());
		assertEquals(cd6b.hashCode(), cd6b.hashCode());

		assertEquals(cd6.hashCode(), cd6a.hashCode());
		assertEquals(cd6a.hashCode(), cd6b.hashCode());
		assertEquals(cd7.hashCode(), cd7.hashCode());
		logger.info("testHashCode erfolgreich");
	}

	@Test
	@DisplayName("compareTo test")
	void testCompareTo() {
		assertEquals(0, cd1.compareTo(cd1));
		assertEquals(0, cd2.compareTo(cd2));
		assertEquals(0, cd3.compareTo(cd3));
		assertEquals(0, cd4.compareTo(cd4));
		assertEquals(0, cd5.compareTo(cd5));
		assertEquals(0, cd6.compareTo(cd6));
		assertEquals(0, cd7.compareTo(cd7));

		assertEquals(0, cd6.compareTo(cd6a));
		assertEquals(0, cd6a.compareTo(cd6b));
		assertNotEquals(0, cd8.compareTo(cd3));

		assertTrue(cd1.compareTo(cd2)<0);
		assertTrue(cd2.compareTo(cd1)>0);
		CompactDisc[] cds = {cd6, cd5, cd4, cd3, cd2, cd1, cd7};
		Arrays.sort(cds);
		for(int i=0; i<cds.length; ++i) {
			logger.info(cds[i].toString());
		}
		assertSame(cds[0], cd7);
		assertSame(cds[1], cd1);
		assertSame(cds[2], cd2);
		assertSame(cds[3], cd5);
		assertSame(cds[4], cd3);
		assertSame(cds[5], cd4);
		assertSame(cds[6], cd6);
		logger.info("testCompareTo erfolgreich");
	}

	@Test
	@DisplayName("YearOfPublicatonComparator test")
	void testYearOfPublicationComparator() {

		// simple test
		YearOfPublicationComparator ejc = new YearOfPublicationComparator();
		assertEquals(0, ejc.compare(cd1, cd1));
		assertEquals(0, ejc.compare(cd3, cd3));
		assertTrue(ejc.compare(cd1, cd2)>0);
		assertTrue(ejc.compare(cd2, cd1)<0);

		// test with Arrays.sort
		CompactDisc[] cds = {cd1, cd2, cd3, cd4, cd5, cd6, cd7};
		Arrays.sort(cds, ejc);
		for(int i=0; i<cds.length; ++i) {
			logger.info(cds[i].toString());
		}
		assertSame(cd3, cds[0]);
		assertSame(cd4, cds[1]);
		assertSame(cd2, cds[2]);
		assertSame(cd6, cds[3]);
		assertSame(cd5, cds[4]);
		assertSame(cd7, cds[5]);
		assertSame(cd1, cds[6]);
		logger.info("testErscheinungsjahrComparator erfolgreich");
	}
}
