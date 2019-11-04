package ListNode;


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

