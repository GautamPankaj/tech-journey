class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> output = new HashSet<Integer>();
        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    output.add(i);
                    break;
                }
            }
        }
        int[] array = output.stream().mapToInt(Number::intValue).toArray();
        return array;
    }
}
