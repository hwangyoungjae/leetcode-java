package org.example.p00020_ValidParentheses;

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
        // given
        String input = "()";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        // given
        String input = "()[]{}";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3() {
        // given
        String input = "(]";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example4() {
        // given
        String input = "([])";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example5() {
        // given
        String input = "[";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example6() {
        // given
        String input = "]";
        // when
        boolean actual = solution.isValid(input);
        // then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }
}