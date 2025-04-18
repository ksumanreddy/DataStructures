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
    int totalSum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root,targetSum);
    }
    public boolean pathSum(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        targetSum -= root.val;
        if(targetSum==0 && root.left==null && root.right==null){
            return true;
        }

        return pathSum(root.left,targetSum) || pathSum(root.right,targetSum);
    }
}