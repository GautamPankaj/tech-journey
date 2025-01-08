class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stableMountains = new ArrayList<Integer>();
        for(int i=0; i < height.length-1 ; i++){
            if(height[i] > threshold)
                stableMountains.add(i+1);
        }
        return stableMountains;
    }
}
