class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int i : candies){
            if(i > maxCandies)
                maxCandies = i;
        }
        List<Boolean> hasMaxCandies = new ArrayList<Boolean>();
        for (int i : candies){
            if(i + extraCandies >= maxCandies)
                hasMaxCandies.add(true);
            else
                hasMaxCandies.add(false);
        }   
        return  hasMaxCandies;    
    }
}
