class Solution {
    public int numberOfMatches(int n) {
        int numberOfMatches = 0;
        while(n > 1){
            numberOfMatches = numberOfMatches + (n / 2);
            if(n % 2 == 0){
               n = n /2; 
            }else{
               n = (n/2)+1;
            }
        }
        return numberOfMatches;
    }
}
