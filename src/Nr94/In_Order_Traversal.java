package Nr94;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class In_Order_Traversal {
//    Method1: Recursion
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        traverseHelper(root, result);
        return result;
    }
    public void traverseHelper(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        traverseHelper(root.left, result);
        result.add(root.val);
        traverseHelper(root.right, result);
    }

//    Method2: Iterative
    public ArrayList<Integer> inorderTraversalIterative(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curNode = root;
        while (!stack.empty() || curNode != null) {
            if (curNode.left != null) {
                stack.push(curNode);
                curNode = curNode.left;
            } else {
                TreeNode temp = stack.pop();
                result.add(temp.val);
                curNode = temp.right;
            }
        }
        return result;
    }
}
