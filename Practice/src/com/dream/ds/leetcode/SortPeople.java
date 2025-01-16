class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] sortedNamesByHeight = new String[names.length];
        for(int i=0; i < heights.length-1; i ++){
            for(int j=i+1; j < heights.length; j ++){
                String tempName;
                int tempHeight;
                if(heights[i] < heights[j]){
                    tempName = names[i];
                    tempHeight = heights[i];
                    names[i] = names[j];
                    heights[i] = heights[j];
                    names[j] = tempName;
                    heights[j] = tempHeight;
                }
            }
        }
        return names;
    }
}
