package org.example.p00002_AddTowNumbers;

import java.util.Objects;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode firstNode = null;
        ListNode node = null;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            int v = v1 % 10;
            carry = v1 / 10;

            if (node == null) {
                firstNode = new ListNode(v);
                node = firstNode;
            } else {
                node.next = new ListNode(v);
                node = node.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return firstNode;
    }
}

class ListNode {
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
        ListNode node = null;
        for (int i = vals.length - 1; i >= 0; i--) {
            node = new ListNode(vals[i], node);
        }
        return node;
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}