package SwordRefers2Offer;

import Tree.TreeNode;

public class IsSymmentricalTree {
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null || isSymmentricalTree(pRoot, pRoot);
    }

    private boolean isSymmentricalTree(TreeNode root1, TreeNode root2) {
        /**
         * 判断条件：
         * 1.如果两个根节点都为空，返回true
         * 2.如果其中一个不为空，return false
         * 3.如果两个根节点值不相等，return false
         * 4.递归判断左右子树
         */
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmentricalTree(root1.left, root2.right) && isSymmentricalTree(root1.right, root2.left);
    }
}
