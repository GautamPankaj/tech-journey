class Solution {
    public void reverseString(char[] s) {
        int firstIndex = 0;
        int lastIndex = s.length - 1;
        char temp;
        while(firstIndex < lastIndex){
            temp = s[firstIndex];
            s[firstIndex++] = s[lastIndex];
            s[lastIndex--] = temp;
        }
    }
}
