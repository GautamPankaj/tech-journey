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
    public List<String> binaryTreePaths(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<String> stringQueue = new LinkedList<String>();
        List<String> list = new ArrayList<String>();
        queue.add(root);
        stringQueue.add(String.valueOf(root.val));
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            String str = stringQueue.poll();
            if(temp.left == null && temp.right == null)
                list.add(str);
            if(temp.left != null){
                queue.add(temp.left);
                stringQueue.add(str + "->" + String.valueOf(temp.left.val));
            }
            if(temp.right != null){
                queue.add(temp.right);
                stringQueue.add(str + "->" + String.valueOf(temp.right.val));
            }
        }
        return list;
    }
}
