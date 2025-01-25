class Solution {
    public int[] minOperations(String boxes) {
        int[] output = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            int count = 0;
            for(int j = 0; j < boxes.length(); j++){
                if(i==j || boxes.charAt(j) == '0')
                    continue;
                count = count + Math.abs(j-i);
            }
            output[i] = count;
        }
       return output; 
    }
}
