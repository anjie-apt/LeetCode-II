package ListNode;


/**
 * 给定一个链表，判断链表中是否有环。
 */
public class LinkedListCycle {
    /**
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
