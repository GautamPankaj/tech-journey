class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> ballsMap = new HashMap();
        int boxNum = 0;
        int max = 0;
        for(int i = lowLimit; i <= highLimit; i++){
            boxNum = getBoxNumber(i);
            ballsMap.put(boxNum, ballsMap.getOrDefault(boxNum, 0) + 1);
            max = Math.max(max, ballsMap.get(boxNum));
        }
        return max;
    }
    public int getBoxNumber(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += (n % 10); 
            n /= 10;         
        }
        return sum;
    }
}
