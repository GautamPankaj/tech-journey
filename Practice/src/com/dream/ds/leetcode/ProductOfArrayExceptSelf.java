class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] answer = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            if(i==0)
                prefix[i] = 1;
            else{
                product = product * nums[i-1];
                prefix[i] = product;
            }
        }
        product = 1;
        for(int i = nums.length-1; i >=0 ; i--){
            if(i == nums.length-1)
                suffix[i] = 1;
            else{
                product = product * nums[i+1];
                suffix[i] = product;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
                answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
}
