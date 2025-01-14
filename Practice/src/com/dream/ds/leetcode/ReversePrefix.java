class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuffer sb = new StringBuffer();
        for(int i=index; i >=0 ; i--){
            sb.append(word.charAt(i));
        } 
        for(int i=index+1; i < word.length(); i++){
            sb.append(word.charAt(i));
        } 
        return sb.toString();
    }
}
