class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] avialbleList = new boolean[nums.length];
        for(int i : nums){
            avialbleList[i-1] = true;
        }
        List<Integer> result = new ArrayList();
        for(int j=0;j<avialbleList.length;j++){
            if(!avialbleList[j]){
                result.add(j+1);
            }
        }
        return result;

    }
}
