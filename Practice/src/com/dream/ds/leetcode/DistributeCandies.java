class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandy = new HashSet();
        for(int i : candyType){
            uniqueCandy.add(i);
        }
        return candyType.length/2 > uniqueCandy.size() ? uniqueCandy.size() : candyType.length/2;
    }
}
