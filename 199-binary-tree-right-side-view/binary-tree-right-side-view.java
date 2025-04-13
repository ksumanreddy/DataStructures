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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        if(root==null){
            return li;
        }
        qu.add(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=1;i<=n;i++){
                TreeNode temp = qu.remove();
                if(temp.left!=null){
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    qu.add(temp.right);
                }
                if(i==n){
                   li.add(temp.val);
                }
            }
        }        
        return li;
    }
}