class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        int jewelsStones = 0;
        for(char jA : jewelsArray){
            for(char sA : stonesArray){
                if(jA==sA)
                    jewelsStones++;
            }
        }
        return jewelsStones;
    }
}
