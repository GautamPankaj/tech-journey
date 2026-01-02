class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> numMap = new HashMap();
        for(int i : nums){
            if(numMap.isEmpty() || numMap.get(i) == null){
                numMap.put(i, 1);
            }
            else{
                numMap.put(i, numMap.get(i)+1);
            }
        }
        int output = 0;
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if(entry.getValue() == 1){
                output = output + entry.getKey();
            }
        }
        return output;
    }
}
