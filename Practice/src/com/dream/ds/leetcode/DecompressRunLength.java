class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressedList = new ArrayList<Integer>();
        int i =0;
        while(i < nums.length){
            int freq = nums[i];
            while(freq>0){
                decompressedList.add(nums[i+1]);
                freq--;
            }
            i = i+2;
        }
        int[] arr = decompressedList.stream().mapToInt(j -> j).toArray();
        return arr;
    }
}
