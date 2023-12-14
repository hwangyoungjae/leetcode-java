package org.example.p0013_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int length = s.length();
        int r = 0;
        for (int i = 0; i < length; i++) {
            int n;
            if (i + 1 < length) {
                switch (s.substring(i, i + 2)) {
                    case "IV":
                        n = 4;
                        i++;
                        break;
                    case "IX":
                        n = 9;
                        i++;
                        break;
                    case "XL":
                        n = 40;
                        i++;
                        break;
                    case "XC":
                        n = 90;
                        i++;
                        break;
                    case "CD":
                        n = 400;
                        i++;
                        break;
                    case "CM":
                        n = 900;
                        i++;
                        break;
                    default:
                        n = map.get(s.charAt(i));
                }
            } else {
                n = map.get(s.charAt(i));
            }
            r+=n;
        }
        return r;
    }

    public int romanToInt1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int output = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int n1 = map.get(s.charAt(i));
            int n2;
            int n = 0;
            try {
                n2 = map.get(s.charAt(i - 1));
            } catch (Exception e) {
                n2 = 0;
            }
            if (n2 < n1) {
                n = n1 - n2;
//                System.out.printf("A %d %d %d = %d %n", i, n1, n2, n);
                i--;
            } else {
                n = n1;
//                System.out.printf("B %d %d %d = %d %n", i, n1, n2, n);
            }
            output += n;
        }
        return output;
    }
}
