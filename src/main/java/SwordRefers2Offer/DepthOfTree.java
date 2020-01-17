package SwordRefers2Offer;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class DepthOfTree {
    public int TreeDepth(TreeNode root) {
        //1.递归
//        if (root == null) {
//            return 0;
//        }
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        return Math.max(left, right) + 1;
        //2.层次遍历
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            res += 1;
            int size = queue.size();
            while (size > 0) {
                TreeNode pRoot = queue.poll();
                size--;
                if (pRoot.left != null) queue.offer(pRoot.left);
                if (pRoot.right != null) queue.offer(pRoot.right);
            }
        }
        return res;
    }
}
