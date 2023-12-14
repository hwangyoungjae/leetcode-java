package org.example.p0009_PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int length = s.length();
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            System.out.printf("%d %d %n", i, j);
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
