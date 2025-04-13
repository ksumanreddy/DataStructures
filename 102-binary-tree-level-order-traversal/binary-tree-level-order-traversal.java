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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> lvl = new LinkedList<>();
         if (root == null) return list;
        lvl.add(root);
        while(!lvl.isEmpty()){
            int n = lvl.size();
            List<Integer> li = new ArrayList<>();
            for(int i=1;i<=n;i++){
               TreeNode temp = lvl.remove();
               li.add(temp.val);
               if(temp.left!=null){
                  lvl.add(temp.left);
               }
               if(temp.right!=null){
                lvl.add(temp.right);
               }
            }
            list.add(li);
        }
        return list;
    }
}