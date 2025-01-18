class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        for(String word : words){
            if(word.startsWith(pref))
                prefixCount++;
        }
        return prefixCount;
    }
}
