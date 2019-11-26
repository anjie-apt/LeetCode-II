package SwordRefers2Offer;

import Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReConstructBinaryTreeTest {
    @Test
    public void reConstructBinaryTree() throws Exception {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(8);
        assertEquals(true, isSameTree(root, new ReConstructBinaryTree().reConstructBinaryTree(pre, in)));
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        return root1 == null || root2 == null || root1.val == root2.val && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }

}