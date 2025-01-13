class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int i = findMinimum(nums);
            nums[i] = nums[i] * multiplier;
            k--;
        }
        return nums;
    }

    int findMinimum(int[] nums){
        int min = Integer.MAX_VALUE;
        int mimimumIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                mimimumIndex = i;
            }
        }
        return mimimumIndex;
    }
}
