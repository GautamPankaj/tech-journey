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
    int maxEdge = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return 0;
        int edge = findMaxEdge(root);    
        return maxEdge;    
    }
    public int findMaxEdge(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int leftEdge = findMaxEdge(root.left);
        int rightEdge = findMaxEdge(root.right);
        int edge = Math.max(leftEdge,rightEdge);
        maxEdge = Math.max(maxEdge, leftEdge + rightEdge);
        return edge+1;
    }
}
