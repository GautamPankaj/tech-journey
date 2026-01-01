class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int j = 0;
        for(int i : nums2){
            nums2[j++] = i * k;
        }
        int output = 0;
        for(int i : nums1){
            for(int l : nums2){
                if(i % l == 0){
                    output++;
                }
            }
        }
        return output;
    }
}
