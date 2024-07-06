class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] copiedArray= Arrays.copyOf(score, score.length); 
        Arrays.sort(copiedArray);
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        String[] merit = {"Gold Medal","Silver Medal","Bronze Medal"};
        int meritIndex = 1;
        for(int j=copiedArray.length-1; j >= 0; j--){
            if(meritIndex <= 3){
                map.put(copiedArray[j],merit[meritIndex-1]);
            }
            else
                 map.put(copiedArray[j],String.valueOf(meritIndex));          
            meritIndex++;
        }
        String[] strArray = new String[score.length];
        for(int i=0; i < score.length; i++){
            strArray[i] = map.get(score[i]);
        }
        return strArray;
    }
}
