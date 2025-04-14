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
    public boolean isValidBST(TreeNode root) {
       return isBSt(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isBSt(TreeNode A,long start,long end){
        if(A==null){
            return true;
        }
        if(start < A.val && A.val <end){
            boolean l = isBSt(A.left,start,A.val);
            if(l==false){
                return false;
            }
            boolean r = isBSt(A.right,A.val,end);
            if(r==false){
                return false;
            }
            return true;
        }
        return false;

    }
}