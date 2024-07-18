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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int sumOfRange = 0;
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.val >= low && temp.val <= high){
                sumOfRange = sumOfRange + temp.val;
            }
            if(temp.left != null ){
                queue.add(temp.left);
            }
            if(temp.right != null ){
                queue.add(temp.right);
            }
        }
        return sumOfRange;
    }
}
