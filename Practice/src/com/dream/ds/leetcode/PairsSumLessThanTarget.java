class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Integer[] array = new Integer[nums.size()];
        nums.toArray(array);
        int countOfPairs = 0;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] + array[j] <  target)
                    countOfPairs++;
            }
        }
        return countOfPairs;
    }
}
