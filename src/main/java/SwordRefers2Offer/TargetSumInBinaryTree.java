package SwordRefers2Offer;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TargetSumInBinaryTree {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        find(root, target, new ArrayList<Integer>(), res);
        return res;
    }
    private void find(TreeNode root, int target, List<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        /**
         * 1.判断根节点是否为空
         * 2.进行相关值操作，temp添加根节点的值，更新target值
         * 3.判断当前节点是否是叶子节点，如果当前target值为0且为叶子节点，则将temp添加到res中，
         * 这里使用new 一个ArrayList来实现深拷贝
         * 4.递归调用find遍历左右子树
         * 5.从temp中移除最后一个元素
         */
        if (root == null) return;

        temp.add(root.val);
        target -= root.val;

        boolean isLeaf = root.left == null && root.right == null;
        if (target == 0 && isLeaf) res.add(new ArrayList<Integer>(temp));

        if (root.left != null) find(root.left, target, temp, res);
        if (root.right != null) find(root.right, target, temp, res);

        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        int target = 22;
        ArrayList<ArrayList<Integer>> res = new TargetSumInBinaryTree().findPath(root, target);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }
}
