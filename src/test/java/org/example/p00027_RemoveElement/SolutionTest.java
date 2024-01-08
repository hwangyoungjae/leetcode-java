package org.example.p00027_RemoveElement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        // when
        int k = solution.removeElement(nums, val);
        // then
        int[] expectedNums = {2, 2};
        assertThat(k).isEqualTo(expectedNums.length);
        assertThat(Arrays.copyOf(nums, expectedNums.length)).containsExactlyInAnyOrder(expectedNums);
    }

    @Test
    void example2() {
        // given
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        // when
        int k = solution.removeElement(nums, val);
        // then
        int[] expectedNums = {0, 1, 4, 0, 3};
        assertThat(k).isEqualTo(expectedNums.length);
        assertThat(Arrays.copyOf(nums, expectedNums.length)).containsExactlyInAnyOrder(expectedNums);
    }
    @Test
    void example3() {
        // given
        int[] nums = {1};
        int val = 1;
        // when
        int k = solution.removeElement(nums, val);
        // then
        int[] expectedNums = {};
        assertThat(k).isEqualTo(expectedNums.length);
        assertThat(Arrays.copyOf(nums, expectedNums.length)).containsExactlyInAnyOrder(expectedNums);
    }
}