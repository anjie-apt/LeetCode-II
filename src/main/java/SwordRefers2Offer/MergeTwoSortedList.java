package SwordRefers2Offer;

import ListNode.ListNode;

public class MergeTwoSortedList {
    public ListNode merge(ListNode list1, ListNode list2) {
        /**
         * 1.如果某一个链表为空，直接返回另外一个
         * 2.新建一个结果节点res
         * 3.对两个链表的头节点的值进行比较，较小的节点赋给res,递归调用merge，实现合并，最后返回res
         */
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode res = null;
        if (list1.val >= list2.val) {
            res = list2;
            res.next = merge(list1, list2.next);
        } else {
            res = list1;
            res.next = merge(list1.next, list2);
        }
        return res;
    }
}
