class Solution {
    public int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int notDivisibleSum = 0;
        for(int i = 1; i <= n; i++){
            if(i % m == 0)
                divisibleSum = divisibleSum +i;
            else
                notDivisibleSum = notDivisibleSum +i;
        }
        return notDivisibleSum - divisibleSum;
    }
}
