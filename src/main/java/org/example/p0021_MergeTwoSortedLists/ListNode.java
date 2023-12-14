package org.example.p0021_MergeTwoSortedLists;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int[] vals) {
        if (vals.length == 0) return null;
        ListNode firstNode = new ListNode(vals[0]);
        ListNode node = firstNode;
        for (int i = 1; i < vals.length; i++) {
            node.next = new ListNode(vals[i]);
            node = node.next;
        }
        return firstNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
