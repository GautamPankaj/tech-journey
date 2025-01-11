class Solution {
    public int countDigits(int num) {
        int countDigits = 0;
        int originNum = num;
        while(num > 0){
            int remainder = num % 10;
            if(originNum % remainder == 0){
                countDigits++;
            }
            num = num / 10;
        }
        return countDigits;
    }
}
