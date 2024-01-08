package org.example.p00028_FindTheIndexOfTheFirstOccurrenceInAString;

class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        System.out.println("haystackLength = " + haystackLength);
        int needleLength = needle.length();
        System.out.println("needleLength = " + needleLength);
        if (haystackLength < needleLength) {
            return -1;
        }
        for (int i = 0; i < haystackLength; i++) {
            System.out.printf("i=%d%n", i);
            int j;
            for (j = 0; j < needleLength; j++) {
                if (i+j >= haystackLength) {
                    return -1;
                }
                System.out.printf("  %d  %d %n", i + j, j);
                System.out.printf("  %s==%s %s %n", haystack.charAt(i + j), needle.charAt(j), haystack.charAt(i + j) == needle.charAt(j));
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
