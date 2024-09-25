class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int output = words.length;
        for(String str : words){
            char[] charArray = str.toCharArray();
            for(int i=0; i < charArray.length; i++){
                if(allowed.indexOf(charArray[i]) == -1) {
                    output--;
                    break;
                }
            }
        }
        return output;
    }
}
