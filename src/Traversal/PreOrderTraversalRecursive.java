package Traversal;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class PreOrderTraversalRecursive {
    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseHelper(root);
    }
    public void traverseHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traverseHelper(root.left);
        traverseHelper(root.right);
    }
}
