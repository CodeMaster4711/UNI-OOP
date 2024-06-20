package de.th.rosenheim.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testString2StringArray() {
        String[] result = StringUtil.string2StringArray("Hello World");
        assertArrayEquals(new String[]{"Hello", "World"}, result);
    }

    @Test
    public void testStringArray2String() {
        String result = StringUtil.stringArray2String(new String[]{"Hello", "World"});
        assertEquals("Hello World", result);
    }

    @Test
    public void testAreAnagrams() {
        assertTrue(StringUtil.areAnagrams("Debit Card", "Bad Credit"));
        assertTrue(StringUtil.areAnagrams("derbe Hotline", "Bohlen Dieter"));
        assertFalse(StringUtil.areAnagrams("Haus", "Haus"));
        assertFalse(StringUtil.areAnagrams("joy", "enjoy"));
    }

}
