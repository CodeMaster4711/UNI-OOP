package de.th.rosenheim.oop;

import java.util.Arrays;

public class StringUtil {

    public static String[] string2StringArray(String s){
        String[] word = s.split(" ");
        Arrays.sort(word, String.CASE_INSENSITIVE_ORDER);
        return word;
    }

    public static String stringArray2String(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
            sb.append(" ");
        }
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        return sb.toString().trim();
    }

    public static boolean areAnagrams(String string1,String string2){
        if(string1.equals(string2)){
            return false;
        }
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] word1 = string1.toCharArray();
        char[] word2 = string2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }


}
