package SwordRefers2Offer;

import ListNode.ListNode;
import utils.ListNodeUtils;

public class ReverseLists {
    public ListNode reverseLists(ListNode head) {
        if (head == null) return head;
        ListNode res = null;
        ListNode pre = null;
        ListNode next = null;
        ListNode node = head;
        while (node != null) {
            //1.每次先记录下一个节点用作更新为当前节点
            next = node.next;
            //2.下一节点为空，表示到了链表尾，反转结束，把当前节点作为头节点返回
            if (next == null) {
                res = node;
            }
            //3.如果没到链表尾，进行反转操作
            //3.1把前一节点置为next
            node.next = pre;
            //3.2把当前节点更新为前置节点
            pre = node;
            //3.3当前节点更新为next
            node = next;
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode res = new ReverseLists().reverseLists(head);
        new ListNodeUtils().printList(res);
    }
}
