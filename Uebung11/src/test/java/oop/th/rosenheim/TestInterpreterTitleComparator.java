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
 * Created 		19.05.2016, Muehlbauer / BrM / MD<br>
 * Modified 	5.4.2020, Silke Lechner-Greite<br>
 * Modified		13.3.2021, Bernd Weiß
 */

@DisplayName("InterpreterTitleComparator Tests:")
public class TestInterpreterTitleComparator {
	private static CompactDisc cd1;
	private static CompactDisc cd2;
	private static CompactDisc cd3;
	private static CompactDisc cd4;
	private static CompactDisc cd5;

	private static Logger logger = Logger.getLogger(TestInterpreterTitleComparator.class.getName());;

	@BeforeAll
	static void setUpBeforeClass() {
		cd1 = new CompactDisc("Lena", "My Cassette Player", 2011, "Universal Music Domestic Pop");
		cd2 = new CompactDisc("Scorpions", "Crazy World", 1990, "Mercury");
		cd3 = new CompactDisc("Die Toten Hosen", "Damenwahl", 1986, "Virgin");
		cd4 = new CompactDisc("Toto", "Toto IV", 1988, "Sony Music");
		cd5 = new CompactDisc("The Who", "Who'S Next", 1995, "Polydor");
	}

	@Test
	@DisplayName("comparator tests")
	void testInterpreterTitleComparator() {
		CompactDisc cd3a = new CompactDisc("Die Toten Hosen", "Auf dem Kreuzzug ins Glueck", 1990, "Virgin");
		CompactDisc cd3b = new CompactDisc("Die Toten Hosen", "Unter Falscher Flagge", 1984, "T.O.T. Musik");
		CompactDisc cd3c = new CompactDisc("Die Toten Hosen", "Opium fuers Volk", 1996, "JKP");

		// einfa
		// che Test
		InterpreterTitleComparator itc = new InterpreterTitleComparator();
		assertEquals(0, itc.compare(cd1, cd1));
		assertEquals(0, itc.compare(cd3, cd3));
		assertTrue(itc.compare(cd1, cd2)<0);
		assertTrue(itc.compare(cd2, cd1)>0);

		assertTrue(itc.compare(cd3, cd3a)>0);
		assertTrue(itc.compare(cd3, cd3b)<0);
		assertTrue(itc.compare(cd3a, cd3b)<0);
		assertTrue(itc.compare(cd3a, cd3c)<0);
		assertTrue(itc.compare(cd3c, cd3a)>0);


		// Test mit Arrays.sort
		CompactDisc[] cds = {cd3b, cd5, cd4, cd3a, cd3, cd2, cd3c, cd1};
		Arrays.sort(cds, itc);
		for(int i=0; i<cds.length; ++i) {
			logger.info(cds[i].toString());
		}
		assertSame(cd1, cds[0]);
		assertSame(cd2, cds[1]);
		assertSame(cd3a, cds[2]);
		assertSame(cd3, cds[3]);
		assertSame(cd3c, cds[4]);
		assertSame(cd3b, cds[5]);
		assertSame(cd4, cds[6]);
		assertSame(cd5, cds[7]);
		logger.info("testInterpretTitelComparator erfolgreich");
	}
}
