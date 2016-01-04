package Traversal;

/**
 * Created by yunlongxu on 1/3/16.
 */
public class inOrderTraversalRecursive {
    public void inOrderTraversal(TreeNode root) {
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
        System.out.println(root.val);
        traverseHelper(root.right);
    }
}
