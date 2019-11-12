package SwordRefers2Offer;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintMultiLines {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int size = queue.size();
            while (size > 0) {
                TreeNode root = queue.poll();
                temp.add(root.val);
                size--;
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
