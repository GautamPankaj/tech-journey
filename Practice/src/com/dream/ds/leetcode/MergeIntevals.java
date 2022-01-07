class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
        int index = 0;
        for(int i=1; i < intervals.length; i++){
            if(intervals[index][1] >= intervals[i][0]){
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);                 
            }else{
                index++;
                intervals[index] = intervals[i];
            }  
        }
        int[][] mergedIntervals = new int[index+1][2];
        int j=0;
        for(int i=0; i <= index; i++){
            mergedIntervals[j][0] = intervals[i][0];
            mergedIntervals[j][1] = intervals[i][1];
            j++;
        }
        return mergedIntervals;
    }
}
