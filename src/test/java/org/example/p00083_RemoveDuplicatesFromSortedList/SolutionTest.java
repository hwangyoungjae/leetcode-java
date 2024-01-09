package org.example.p00083_RemoveDuplicatesFromSortedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        ListNode node = arrayTolistNode(new int[]{1, 1, 2});
        ListNode actual = solution.deleteDuplicates(node);
        ListNode expected = arrayTolistNode(new int[]{1, 2});
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        ListNode node = arrayTolistNode(new int[]{1, 1, 2, 3, 3});
        ListNode actual = solution.deleteDuplicates(node);
        ListNode expected = arrayTolistNode(new int[]{1, 2, 3});
        assertThat(actual).isEqualTo(expected);
    }

    private ListNode arrayTolistNode(int[] array) {
        ListNode node = null;
        for (int i = array.length - 1; i >= 0; i--) {
            node = new ListNode(array[i], node);
        }
        return node;
    }
}