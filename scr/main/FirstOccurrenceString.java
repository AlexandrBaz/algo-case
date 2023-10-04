package main;

public class FirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
        System.out.println(secondSolution(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static int secondSolution(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLength = needle.length();
        if(hayLength<needleLength){
            return -1;
        }
        for(int i = 0; i < hayLength - needleLength + 1; i++) {
            int j = 0;
            while(j <needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if(j == needleLength) {
                    return i;
                }
            }
        }
        return -1;
    }
}