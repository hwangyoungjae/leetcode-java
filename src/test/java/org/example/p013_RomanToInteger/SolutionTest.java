package org.example.p013_RomanToInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        String input = "III";
        int actual = solution.romanToInt(input);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        String input = "LVIII";
        int actual = solution.romanToInt(input);
        int expected = 58;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3() {
        String input = "MCMXCIV";
        int actual = solution.romanToInt(input);
        int expected = 1994;
        assertThat(actual).isEqualTo(expected);
    }
}