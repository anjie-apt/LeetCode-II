package ListNode;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class RemoveNthNodeFromEndOfList {
    /**
     * 删除链表的倒数第N个节点，使用快慢指针，快指针先走n步，慢指针再走，
     * 当快指针走到链表尾部的时候，慢指针指向的就是倒数第n个节点，删除该节点，令slow.next = slow.next.next
     *
     * @param head 输入的链表头节点
     * @param n    待删除的倒数节点
     * @return 删除倒数第n个节点后的链表
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
