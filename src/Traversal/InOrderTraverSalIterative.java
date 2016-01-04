package Traversal;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class InOrderTraverSalIterative {
    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                System.out.println(temp.val);
                root = temp.right;
            }
        }
    }
}
