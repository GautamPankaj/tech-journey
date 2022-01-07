class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0)
            return -1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(!map.isEmpty() && map.get(i) != null){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxIndex = entry.getKey();
            }
        } 
        return maxIndex;
    }
}
