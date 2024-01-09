package org.example.p00088_MergeSortedArray;

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
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        // when
        solution.merge(nums1, m, nums2, n);
        // then
        assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    void example2() {
        // given
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        // when
        solution.merge(nums1, m, nums2, n);
        // then
        assertThat(nums1).containsExactly(1);
    }

    @Test
    void example3() {
        // given
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        // when
        solution.merge(nums1, m, nums2, n);
        // then
        assertThat(nums1).containsExactly(1);
    }

    @Test
    void example4() {
        // given
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        // when
        solution.merge(nums1, m, nums2, n);
        // then
        assertThat(nums1).containsExactly(1, 2, 3, 4, 5, 6);
    }
}