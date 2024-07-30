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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        traverseBST(root, map);
        List<Integer> list = new ArrayList<Integer>();
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(entry.getValue() > max){
                max = entry.getValue();
                list.clear();
                list.add(key);
            }else if(entry.getValue() == max){
                list.add(key);
            }
            //System.out.println("Key=" + key + ", Value=" + value);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }


    private void traverseBST(TreeNode root, Map<Integer,Integer> map){
        if(root == null)
            return;
        if(root.left != null)
            traverseBST(root.left,map);
        if(root.right != null)
            traverseBST(root.right,map);
        if(map != null && map.get(root.val) != null){
            map.put(root.val, map.get(root.val)+1);
        }else{
            map.put(root.val,1);
        }
    }
}
