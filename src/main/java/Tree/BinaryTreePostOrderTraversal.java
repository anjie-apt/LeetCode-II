package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {
    public List<Integer> postTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
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
