package org.example.p0001_TwoSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected = {0, 1};
        assertThat(actual).containsAnyOf(expected);
    }

    @Test
    void example2() {
        int[] actual = solution.twoSum(new int[]{3, 2, 4}, 6);
        int[] expected = {1, 2};
        assertThat(actual).containsAnyOf(expected);
    }

    @Test
    void example3() {
        int[] actual = solution.twoSum(new int[]{3, 3}, 6);
        int[] expected = {0, 1};
        assertThat(actual).containsAnyOf(expected);
    }
}