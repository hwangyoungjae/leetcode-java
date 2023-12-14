package org.example.p0058_LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        for (int left = right; left >= 0; left--) {
            if (s.charAt(right) == ' ') {
                right--;
            } else if (s.charAt(left) == ' ' && s.charAt(right) != ' ') {
                return right - left;
            }
        }
        return right + 1;
    }
}