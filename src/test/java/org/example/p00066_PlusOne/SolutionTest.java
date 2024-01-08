package org.example.p00066_PlusOne;

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
        int[] actual = solution.plusOne(new int[]{1, 2, 3});
        assertThat(actual).containsExactly(new int[]{1, 2, 4});
    }

    @Test
    void example2() {
        int[] actual = solution.plusOne(new int[]{4, 3, 2, 1});
        assertThat(actual).containsExactly(new int[]{4, 3, 2, 2});
    }

    @Test
    void example3() {
        int[] actual = solution.plusOne(new int[]{9});
        assertThat(actual).containsExactly(new int[]{1, 0});
    }

    @Test
    void example4() {
        int[] actual = solution.plusOne(new int[]{1, 2, 9});
        assertThat(actual).containsExactly(new int[]{1, 3, 0});
    }
}