package Tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameTreeTest {
    @Test
    public void isSameTree() throws Exception {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        assertEquals(true, new SameTree().isSameTree(p, q));
    }
}