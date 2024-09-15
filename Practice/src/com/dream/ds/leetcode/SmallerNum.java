class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            smallerNums[i] = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && i != j)
                    smallerNums[i]++;
            }
        }
        return smallerNums;
    }
}
