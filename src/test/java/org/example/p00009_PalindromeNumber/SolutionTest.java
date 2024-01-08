package org.example.p00009_PalindromeNumber;

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
        int input = 121;
        boolean actual = solution.isPalindrome(input);
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        int input = -121;
        boolean actual = solution.isPalindrome(input);
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3() {
        int input = 10;
        boolean actual = solution.isPalindrome(input);
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }
}