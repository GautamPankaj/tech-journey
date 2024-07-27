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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String leaves = "";
        String root1Leaves = preOrder(root1, "");
        System.out.println(root1Leaves);
        String root2Leaves = preOrder(root2, "");
        System.out.println(root1Leaves);
        return root1Leaves.equals(root2Leaves);
        
    }
    private String preOrder(TreeNode root, String leaves){
        if(root.left == null && root.right == null){
            leaves  = leaves + String.valueOf(root.val) + ",";
        }
        if(root.left != null)
           leaves = preOrder(root.left, leaves);
        if(root.right != null)
           leaves = preOrder(root.right, leaves);
        return leaves;
    }
}
