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
    
    TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(-1);
        current = newRoot;
        dfs(root);
        return newRoot.right;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        current.right = new TreeNode(root.val);
        current = current.right;
        dfs(root.right);
    }
}
