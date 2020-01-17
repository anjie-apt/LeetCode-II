package SwordRefers2Offer;

import Tree.TreeNode;


/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class BalancedBinaryTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        //1.递归遍历
//        if (root == null) return true;
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        int dif = Math.abs(left - right);
//        if (dif > 1) return false;
//        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        //2.后序遍历
        return isBalanced(root);
    }

    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if (isBalanced(root.left) && isBalanced(root.right)) {
            int dif = Math.abs(left - right);
            if (dif < 2) {
                return true;
            }
        }
        return false;
    }

    private int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

}
