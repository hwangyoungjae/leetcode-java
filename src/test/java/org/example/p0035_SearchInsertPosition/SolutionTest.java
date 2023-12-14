package org.example.p0035_SearchInsertPosition;

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
        int[] nums = {1, 3, 5, 6};
        int actual = solution.searchInsert(nums, 5);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void example2() {
        int[] nums = {1, 3, 5, 6};
        int actual = solution.searchInsert(nums, 2);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void example3() {
        int[] nums = {1, 3, 5, 6};
        int actual = solution.searchInsert(nums, 7);
        assertThat(actual).isEqualTo(4);
    }

    @Test
    void example4() {
        int[] nums = {1, 3, 5};
        int actual = solution.searchInsert(nums, 3);
        assertThat(actual).isEqualTo(1);
    }
}