/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
      invertBinaryTree(root);
      return root;
    }
    public void invertBinaryTree(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right=left;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}