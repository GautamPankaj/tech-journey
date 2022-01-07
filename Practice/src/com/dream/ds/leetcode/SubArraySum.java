class Solution {
    public int subarraySum(int[] nums, int k) {
        int totalSubArray = 0;
        int subArraySum = 0;
        for(int i=0; i < nums.length; i++){
            int j=i;
            subArraySum = 0;
            while(j < nums.length){
                subArraySum = subArraySum + nums[j++];
                if(subArraySum == k)
                    totalSubArray++;
            }     
        }
        return totalSubArray;
    }
}
