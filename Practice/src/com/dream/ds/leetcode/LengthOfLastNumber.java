class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordArray = s.split(" ");
        return wordArray[wordArray.length - 1].length();
    }
}
