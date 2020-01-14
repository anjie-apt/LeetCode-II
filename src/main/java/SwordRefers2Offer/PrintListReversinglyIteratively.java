package SwordRefers2Offer;

import java.util.*;
import ListNode.ListNode;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintListReversinglyIteratively {
    /**
     * 思路：使用栈代替递归，依次将链表节点入栈，最后再按出栈顺序打印
     * 时间复杂度： O(N)
     * 空间复杂度： O(N)
     * @param listNode：输入的链表头结点
     * @return 从尾到头的ArrayList
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null){
            return res;
        }
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            res.add(stack.pop().val);
        }
        return res;
    }
}
