class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0)
            return false;
        HashMap<Integer,Integer> numsMap = new HashMap();
        for(int i : nums){
            if(numsMap.isEmpty() || numsMap.get(i) == null){
                numsMap.put(i, 1);
            }else{
                numsMap.put(i, numsMap.get(i)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
