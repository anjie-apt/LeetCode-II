package utils;

import ListNode.ListNode;

public class ListNodeUtils {
    public void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
