class Solution {
    public int passThePillow(int n, int time) {
        int index = 1;
        boolean isPositive = true;
        while(time > 0){
            if(index == n)
                isPositive = false;
            else if(index == 1)
                isPositive = true;
            if(isPositive)
                index++;
            else 
                index--;
            time--;
        }
        return index;
    }
}
