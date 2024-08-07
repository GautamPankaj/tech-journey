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
    public int countNodes(TreeNode root) {
        int countLNodes = 0;
        int countRNodes = 0;
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left != null)
            countLNodes = countNodes(root.left);
        if(root.right != null)
            countRNodes = countNodes(root.right);
        return countLNodes + countRNodes + 1;
    }
}
