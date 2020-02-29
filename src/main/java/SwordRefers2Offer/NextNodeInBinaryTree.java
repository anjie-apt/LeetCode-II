package SwordRefers2Offer;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
class TreeLinkNode {
    private int val;
    TreeLinkNode parent = null;
    TreeLinkNode left = null;
    TreeLinkNode right = null;

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
public class NextNodeInBinaryTree {
    public TreeLinkNode nextNode(TreeLinkNode root, TreeLinkNode pNode) {
        if (root == null || pNode == null) return null;
        TreeLinkNode next = null;
        //如果右子树不为空，遍历查找右子树的最左子节点
        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            next = pRight;
        } else if (pNode.parent != null) {
            //如果右子树为空，记录下当前节点和它的父节点
            TreeLinkNode curNode = pNode;
            TreeLinkNode pParent = pNode.parent;
            //如果当前节点有父节点，且自己是父节点的右子节点，则需要沿着指向父节点的指针一直向上遍历寻找，直到找到一个是他父节点的左子节点的节点
            while (pParent != null && curNode == pParent.right) {
                curNode = pParent;
                pParent = pParent.parent;
            }
            //否则如果当前节点就是父节点的左子节点，当前节点的下一节点就是父节点
            next = pParent;
        }
        return next;
    }
}
