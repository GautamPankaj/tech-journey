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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> averageLevel = new ArrayList<Double>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double average = 0.00;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                average = average + node.val;
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            average = average /size;
            averageLevel.add(average);
        }
        return averageLevel;
    }
}
