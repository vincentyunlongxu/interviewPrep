package Traversal;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class PreOrderTraversalIterative {
    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                root = temp.right;
            }
        }
    }
}
