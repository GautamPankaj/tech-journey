class Solution {
    public int addDigits(int num) {
        while(num/10 != 0){
            num = checkForOneDigit(num);
        }
        return num;
    }

    public int checkForOneDigit(int num){
        int newNum = 0;
        while(num / 10 > 0){
            newNum = newNum + num % 10;
            num = num / 10;
        }
        newNum = newNum + num;
        return newNum;
    }
}
