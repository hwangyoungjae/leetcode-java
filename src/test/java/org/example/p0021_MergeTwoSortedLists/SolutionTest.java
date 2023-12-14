package org.example.p0021_MergeTwoSortedLists;

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
        ListNode list1 = ListNode.from(new int[]{1, 2, 4});
        ListNode list2 = ListNode.from(new int[]{1, 3, 4});
        // when
        ListNode actual = solution.mergeTwoLists(list1, list2);
        // then
        ListNode expected = ListNode.from(new int[]{1, 1, 2, 3, 4, 4});
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        // given
        ListNode list1 = null;
        ListNode list2 = null;
        // when
        ListNode actual = solution.mergeTwoLists(list1, list2);
        // then
        ListNode expected = null;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3() {
        // given
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        // when
        ListNode actual = solution.mergeTwoLists(list1, list2);
        // then
        ListNode expected = new ListNode(0);
        ;
        assertThat(actual).isEqualTo(expected);
    }
}