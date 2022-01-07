class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2) -> o1[0]-o2[0]);
        int index = 0;
        int overlap = 0;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[index][1] > intervals[i][0]){
                overlap++;
                intervals[index][1] = Math.min(intervals[index][1],intervals[i][1]);
            }else{
                index++;
                intervals[index] = intervals[i];
            }
                
        }
        return overlap;
    }
}
