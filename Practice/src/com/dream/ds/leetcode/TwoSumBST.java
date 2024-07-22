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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
        if(list.size() <= 1)
            return false;
        Collections.sort(list);
        int l = 0;
        int r = list.size()-1;
        while(l < r){
            if(list.get(l) + list.get(r) == k)
                return true;
            if(list.get(l) + list.get(r) > k)
                r--;
            if(list.get(l) + list.get(r) < k)
                l++;
        }
    return false;
    }
}
