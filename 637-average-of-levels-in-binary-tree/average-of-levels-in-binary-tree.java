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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> lvlOrder = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        lvlOrder.add(root);
        while(!lvlOrder.isEmpty()){
            double sumOflvl = 0.00;
            int n = lvlOrder.size();
           for(int i=0;i<n;i++){
              TreeNode temp = lvlOrder.remove();
              sumOflvl += temp.val;
              if(temp.left!=null){
                 lvlOrder.add(temp.left);
              }
              if(temp.right!=null){
                 lvlOrder.add(temp.right);
             }
           }
           ans.add((double)(sumOflvl/n));
        }
        return ans;
    }
}