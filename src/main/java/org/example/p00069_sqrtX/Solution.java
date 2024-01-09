package org.example.p00069_sqrtX;

class Solution {
    public int mySqrt(int x) {
        if (x > 0) {
            int i;
            int previousI = 0;
            for (i = 1; i <= 46340; i++) {
                if (i * i < x) {
                    previousI = i;
                } else if (i * i == x) {
                    return i;
                } else {
                    return previousI;
                }
            }
            return 46340;
        }
        return 0;
    }
}