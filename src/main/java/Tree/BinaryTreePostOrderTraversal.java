package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的 后序 遍历。
 */
public class BinaryTreePostOrderTraversal {
    public List<Integer> postTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        //按照根，左，右的顺序入栈
        while (!stack.isEmpty()) {
            TreeNode pRoot = stack.pop();
            res.add(pRoot.val);
            if (pRoot.left != null) stack.push(pRoot.left);
            if (pRoot.right != null) stack.push(pRoot.right);
        }
        Collections.reverse(res);
        return res;
    }
}
