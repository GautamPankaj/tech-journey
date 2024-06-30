class Solution {
    public String reverseWords(String s) {
        String result= "";
        String[] strArray = s.split(" ");
        int count = 0;
        for(String str: strArray){
            count
            String reversedString = reverseString(str);
            if(count < strArray.length)
                reversedString = reversedString + " ";
            result = result + reversedString;
        }
        return result;
    }
    String reverseString(String str){
        String nstr = "";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
       return nstr;
    }
}
