class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0 ;
        int rightSum = 0;
        int[] leftSumArray = new int[nums.length];
        int[] righttSumArray = new int[nums.length];
        int[] leftRightDiffArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            leftSumArray[i] = leftSum;
            leftSum = leftSum + nums[i];
        }
        for(int i = nums.length-1; i >=0 ; i--){
            righttSumArray[i] = rightSum;
            rightSum = rightSum + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            leftRightDiffArray[i] = Math.abs(righttSumArray[i] - leftSumArray[i]);
        }
        return leftRightDiffArray;
    }
}
