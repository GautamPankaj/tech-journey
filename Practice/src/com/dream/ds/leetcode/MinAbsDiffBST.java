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
    List<Integer> list = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) { 
        inOrder(root); 
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i < arr.length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) < minDiff)
                minDiff = Math.abs(arr[i] - arr[i+1]);
        }
        return minDiff;
    }
    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
