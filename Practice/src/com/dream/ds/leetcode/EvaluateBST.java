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
    public boolean evaluateTree(TreeNode root) {
                    boolean binLeft = false;
            boolean binRight = false;
        if(root != null && root.left != null && root.left.val != 0 && root.left.val != 1)
            binLeft = evaluateTree(root.left);
        if(root != null && root.right != null && root.right.val != 0 && root.right.val != 1)
            binRight = evaluateTree(root.right); 
            if(root != null && root.left != null && root.left.val == 1)
                binLeft = true;
            if(root != null && root.right != null && root.right.val == 1)
                binRight = true;
            if(root != null && root.right == null && root.left == null && root.val == 1){
                binRight = true;
                binLeft = true;
            }
            if(root.val == 2)
                return binLeft || binRight;
            else
                return binLeft && binRight;
    }
}
