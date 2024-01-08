package org.example.p00002_AddTowNumbers;

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
    void ListNodeFromIntArray() {
        ListNode actual = ListNode.from(new int[]{2, 4, 3});
        ListNode expected = new ListNode(2, new ListNode(4, new ListNode(3)));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ListNodeFromIntArray2() {
        ListNode actual = ListNode.from(new int[]{5, 6, 4});
        ListNode expected = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example1() {
        // given
        ListNode l1 = ListNode.from(new int[]{2, 4, 3});
        ListNode l2 = ListNode.from(new int[]{5, 6, 4});
        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);
        // then
        ListNode expected = ListNode.from(new int[]{7, 0, 8});
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        // given
        ListNode l1 = ListNode.from(new int[]{0});
        ListNode l2 = ListNode.from(new int[]{0});
        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);
        // then
        ListNode expected = ListNode.from(new int[]{0});
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3() {
        // given
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);
        // then
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertThat(actual).isEqualTo(expected);
    }

//    @Test
//    void example4() {
//        // given
//        ListNode l1 = ListNode.from(new int[]{9});
//        ListNode l2 = ListNode.from(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9});
//        // when
//        ListNode actual = solution.addTwoNumbers(l1, l2);
//        // then
//        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
//        assertThat(actual).isEqualTo(expected);
//    }
}