class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i=0; i < nums.length-2; i++){
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int requiredSum = 0 - nums[i];
            int leftPointer = i+1;
            int rightPointer = nums.length - 1;
            while(leftPointer < rightPointer){
                tempList = new ArrayList<Integer>();
                if(nums[leftPointer] + nums[rightPointer] > requiredSum)
                    rightPointer--;
                else if(nums[leftPointer] + nums[rightPointer] < requiredSum)
                    leftPointer++;
                else{
                        tempList.add(nums[i]);
                        tempList.add(nums[leftPointer]);
                        tempList.add(nums[rightPointer]);
                        outputList.add(tempList);
                        leftPointer++;
                        while(leftPointer < rightPointer && nums[leftPointer]==nums[leftPointer-1]){
                            leftPointer++;
                        }
                }
            }
        }       
        return outputList;
    }
}
