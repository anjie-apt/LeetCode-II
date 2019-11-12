package SwordRefers2Offer;

import Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintMultiLinesTest {
    @Test
    public void print() throws Exception {
        TreeNode pRoot = new TreeNode(1);
        pRoot.left = new TreeNode(2);
        pRoot.right = new TreeNode(3);
        pRoot.left.left = new TreeNode(4);
        pRoot.left.right = new TreeNode(5);
        pRoot.right.left = new TreeNode(6);
        pRoot.right.right = new TreeNode(7);
        assertEquals("[[1], [2, 3], [4, 5, 6, 7]]", new PrintMultiLines().Print(pRoot).toString());
    }

}