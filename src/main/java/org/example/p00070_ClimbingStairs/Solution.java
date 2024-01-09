package org.example.p00070_ClimbingStairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        return cachedFibonacci(n);
    }

    private int cachedFibonacci(int n) {
        if (n <= 2) {
            return n;
        }
        Integer i = cache.get(n);
        if (i == null) {
            i = cachedFibonacci(n - 1) + cachedFibonacci(n - 2);
            cache.put(n, i);
        }
        return i;
    }
}
