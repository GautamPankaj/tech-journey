class Solution {
    public int balancedStringSplit(String s) {
        int balancedStrings = 0;
        int lenOfLR = s.length();
        int lCount = 0;
        int rCount = 0;
        for(int i = 0; i < lenOfLR; i++){
            if('L' == s.charAt(i)){
                lCount++;
            }
            else{
                rCount++;
            }
            if(lCount == rCount){
                balancedStrings++;
                lCount = 0;
                rCount = 0;
            }
        }
        return balancedStrings;
    }
}
