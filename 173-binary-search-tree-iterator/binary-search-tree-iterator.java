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
class BSTIterator {
    private Stack<TreeNode> bst = new Stack<>();
    public BSTIterator(TreeNode root) {
        push(root);
    }
    
    public int next() {
       TreeNode node = bst.pop();
       push(node.right);
       return node.val;  
    }
    
    public boolean hasNext() {
       return !bst.isEmpty();
    }
    private void push(TreeNode root){
        while (root!= null) {
            bst.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */