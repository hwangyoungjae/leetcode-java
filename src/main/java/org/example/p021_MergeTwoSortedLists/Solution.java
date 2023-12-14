package org.example.p021_MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (Objects.isNull(list1) && Objects.isNull(list2)) {
            return null;
        } else if (Objects.isNull(list2)) {
            return list1;
        } else if (Objects.isNull(list1)) {
            return list2;
        }
        ListNode n1 = list1;
        ListNode n2 = list2;

        List<Integer> list = new ArrayList<>();
        while (Objects.nonNull(n1) || Objects.nonNull(n2)) {
            if (Objects.isNull(n1)) {
                list.add(n2.val);
                n2 = n2.next;
            } else if (Objects.isNull(n2)) {
                list.add(n1.val);
                n1 = n1.next;
            } else if (n1.val < n2.val) {
                list.add(n1.val);
                n1 = n1.next;
            } else {
                list.add(n2.val);
                n2 = n2.next;
            }
        }

        ListNode firstNode = new ListNode(list.get(0));
        ListNode node = firstNode;
        for (int i = 1; i < list.size(); i++) {
            node.next = new ListNode(list.get(i));
            node = node.next;
        }

        return firstNode;
    }
}
