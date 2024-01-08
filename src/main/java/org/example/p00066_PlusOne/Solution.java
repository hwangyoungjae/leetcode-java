package org.example.p00066_PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int carray = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i] += 1;
            } else {
                digits[i] += carray;
                carray = 0;
            }
            if (digits[i] >= 10) {
                carray = digits[i] / 10;
                digits[i] = digits[i] - carray * 10;
            }
        }

        if (carray > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carray;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }

    /**
     * https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/
     */
    public int[] plusOne2(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(i);
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
