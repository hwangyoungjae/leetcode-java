package org.example.p0067_AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int maxLength = Math.max(aLength, bLength);

        char[] charArr = new char[maxLength];

        int i1, i2;
        char c1, c2, v;
        char carry = '0';
        for (int i = 0; i < maxLength; i++) {
            i1 = aLength - i - 1;
            i2 = bLength - i - 1;

            c1 = i1 >= 0 ? a.charAt(i1) : '0';
            c2 = i2 >= 0 ? b.charAt(i2) : '0';

            if (c1 == '1' && c2 == '1') {
                v = carry == '0' ? '0' : '1';
                carry = '1';
            } else if (c1 == '1' || c2 == '1') {
                v = carry == '0' ? '1' : '0';
            } else {
                v = carry == '0' ? '0' : '1';
                carry = '0';
            }
            charArr[maxLength - i - 1] = v;
        }
        if (carry == '0') {
            return String.valueOf(charArr);
        } else {
            return "1" + String.valueOf(charArr);
        }
    }
}
