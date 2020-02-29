package SwordRefers2Offer;

import Tree.TreeNode;

public class MirrorOfBinaryTree {
    public void mirror(TreeNode root) {
        /**
         * 1.判断根节点是否为空或者左右子树都为空，是直接返回
         * 2.利用一个节点进行左右子节点交换
         * 3.当左右子树不为空，递归进行翻转，得到镜像树
         */
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode res = root.left;
        root.left = root.right;
        root.right = res;

        if (root.left != null) mirror(root.left);
        if (root.right != null) mirror(root.right);
    }
}
