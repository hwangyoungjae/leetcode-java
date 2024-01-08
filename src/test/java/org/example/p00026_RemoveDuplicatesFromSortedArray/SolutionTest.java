package org.example.p00026_RemoveDuplicatesFromSortedArray;

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
        // given
        int[] nums = {1, 1, 2};
        // when
        int k = solution.removeDuplicates(nums);
        // then
        int[] expectedNums = {1, 2};
        assertThat(k).isEqualTo(2);
        for (int i = 0; i < k; i++) {
            assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
    }

    @Test
    void example2() {
        // given
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // when
        int k = solution.removeDuplicates(nums);
        // then
        int[] expectedNums = {0, 1, 2, 3, 4};
        assertThat(k).isEqualTo(5);
        for (int i = 0; i < k; i++) {
            assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
    }
}