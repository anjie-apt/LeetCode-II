package SwordRefers2Offer;

import Tree.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubTree {
    public boolean HasSubTree(TreeNode root1, TreeNode root2) {
        boolean hasSubTree = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                hasSubTree = isSubTree(root1, root2);
            }
            if (!hasSubTree) {
                hasSubTree = HasSubTree(root1.left, root2);
            }
            if (!hasSubTree) {
                hasSubTree = HasSubTree(root1.right, root2);
            }
        }
        return hasSubTree;
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.right = new TreeNode(4);
        root1.left.right.left = new TreeNode(7);
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(3);
        boolean res = new HasSubTree().HasSubTree(root1, root2);
        System.out.println(res);


    }
}
