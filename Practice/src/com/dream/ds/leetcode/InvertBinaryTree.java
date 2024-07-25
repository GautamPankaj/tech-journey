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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> helperQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> invertQueue = new LinkedList<TreeNode>();
        TreeNode invertRoot = null;
        if(root != null){
            helperQueue.add(root);
            invertRoot = new TreeNode(root.val);
            invertQueue.add(invertRoot);
        }
        while(!helperQueue.isEmpty()){
            TreeNode temp = helperQueue.poll();
            TreeNode tempInvert = invertQueue.poll();
            if(temp!=null){
                if(temp.left != null)
                    tempInvert.right = new TreeNode(temp.left.val);
                if(temp.right != null)        
                    tempInvert.left = new TreeNode(temp.right.val);
            helperQueue.add(temp.right);
            helperQueue.add(temp.left);
            invertQueue.add(tempInvert.left);
            invertQueue.add(tempInvert.right);    
            }    
        }
        return invertRoot;
    }
}
