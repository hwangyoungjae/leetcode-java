package org.example.p0014_LongestCommonPrefix;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while (true) {
            Character[] store = new Character[strs.length];
            for (int i = 0; i < strs.length; i++) {
                if (idx >= strs[i].length()) {
                    return sb.toString();
                }
                String word = strs[i];
                store[i] = word.charAt(idx);
            }
            if (Arrays.stream(store).allMatch(character -> character == store[0])) {
                sb.append(store[0]);
            } else {
                return sb.toString();
            }
            idx++;
        }
    }
}
