package main;

import java.sql.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strings = new String[] {"flower","flow","flight"};
        String [] strings2 = new String[] {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix(strings2));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i =0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return stringBuilder.toString();
            }
            stringBuilder.append(first.charAt(i));
        }
        return stringBuilder.toString();
    }
}