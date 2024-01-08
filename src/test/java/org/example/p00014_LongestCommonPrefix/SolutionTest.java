package org.example.p00014_LongestCommonPrefix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        String[] input = {"flower", "flow", "flight"};
        String actual = solution.longestCommonPrefix(input);
        String expected = "fl";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        String[] input = {"dog", "racecar", "car"};
        String actual = solution.longestCommonPrefix(input);
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }
}