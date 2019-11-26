package Tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreePostOrderTraversalTest {
    @Test
    public void postTraversal() throws Exception {
        TreeNode pRoot = new TreeNode(1);
        pRoot.left = new TreeNode(2);
        pRoot.right = new TreeNode(3);
        pRoot.left.left = new TreeNode(4);
        pRoot.left.right = new TreeNode(5);
        pRoot.right.left = new TreeNode(6);
        pRoot.right.right = new TreeNode(7);
        assertEquals("[4, 5, 2, 6, 7, 3, 1]", new BinaryTreePostOrderTraversal().postTraversal(pRoot).toString());

    }

}