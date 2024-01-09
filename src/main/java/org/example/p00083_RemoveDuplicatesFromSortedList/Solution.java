package org.example.p00083_RemoveDuplicatesFromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode root = new ListNode(head.val);

        ListNode node = root;
        ListNode nextNode = head.next;

        while (nextNode != null) {
            if (node.val < nextNode.val) {
                node.next = new ListNode(nextNode.val);
                node = node.next;
            }
            nextNode = nextNode.next;
        }
        return root;
    }
}
