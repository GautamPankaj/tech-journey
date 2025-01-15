class Solution {
    public int minOperations(int[] nums, int k) {
        int operationCount = 0;
        for(int i : nums){
            if(i < k){
                operationCount++;
            }
        }
        return operationCount;
    }
}
