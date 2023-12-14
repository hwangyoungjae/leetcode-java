package org.example.p0021_MergeTwoSortedLists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ListNodeTest {
    @Test
    void from() {
        ListNode actual = ListNode.from(new int[]{1, 2, 3});
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertThat(actual).isEqualTo(expected);
    }
}