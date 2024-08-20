class Solution {
    public int scoreOfString(String s) {
        int[] asciiValueOfS = new int[s.length()];
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            asciiValueOfS[i] = (int) c;
            if(i > 0){
                sum = sum + Math.abs(asciiValueOfS[i]-asciiValueOfS[i-1]);
            }
        }
    return sum;
    }
}
