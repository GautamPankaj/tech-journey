class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> sneakyNumberSet = new HashSet<Integer>();
        int[] sneakyNumbers = new int[2];
        int j=0;
        for(int i:nums){
            if(!sneakyNumberSet.isEmpty() && sneakyNumberSet.contains(i))
                sneakyNumbers[j++] = i;
            else
                sneakyNumberSet.add(i);
            if(j == 2)
                break;
        }
        return sneakyNumbers;
    }
}
