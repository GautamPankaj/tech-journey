class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int countOfEmployee = 0;
        for(int i : hours){
            if(i >= target)
                countOfEmployee++;
        }
        return countOfEmployee;
    }
}
