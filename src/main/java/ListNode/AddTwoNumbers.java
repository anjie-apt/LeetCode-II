package ListNode;

/**
 * 给出两个非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储?一位?数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0开头。

 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int pVal;
        int qVal;
        while (p != null || q != null) {
            if (p == null) {
                pVal = 0;
            } else pVal = p.val;
            if (q == null) {
                qVal = 0;
            } else qVal = q.val;
            int sum = pVal + qVal + carry;
            carry = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry == 1) {
            head.next = new ListNode(1);
        }
        return dummy.next;
    }
}

