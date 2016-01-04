package Traversal;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class PostOrderTraversalRecursive {
    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseHelper(root);
    }
    public void traverseHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseHelper(root.left);
        traverseHelper(root.right);
        System.out.println(root.val);
    }
}
