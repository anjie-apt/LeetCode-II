package SwordRefers2Offer;

import ListNode.ListNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrintListReversinglyIterativelyTest
{
    @Test
    public void printListFromTailToHead() throws Exception {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(3);
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        assertEquals(res, new PrintListReversinglyIteratively().printListFromTailToHead(head));
    }

}