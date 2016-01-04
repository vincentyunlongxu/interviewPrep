package Traversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class PostOrderTraversalIterative {
    public void postOrderTraversal(TreeNode root) {
        Deque<TreeNode> first = new LinkedList<TreeNode>();
        Deque<TreeNode> second = new LinkedList<TreeNode>();
        TreeNode curNode = root;
        first.push(curNode);
        while (curNode != null || !first.isEmpty()) {
            TreeNode temp = first.pop();
            second.push(temp);
            if (curNode.left != null) {
                first.push(curNode.left);
            }
            if (curNode.right != null) {
                first.push(curNode.right);
            }
        }
        while (!second.isEmpty()) {
            TreeNode temp = second.pop();
            System.out.println(temp.val);
        }
    }
}
