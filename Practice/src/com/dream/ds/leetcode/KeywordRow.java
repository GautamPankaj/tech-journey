class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String> ans=new ArrayList<>();
        
        for (String word : words){
           boolean[] isRowHAsAllWord = {true,true,true};
            char[] charArray = word.toCharArray();
            for(char ch : charArray){
                if(row1.indexOf(Character.toLowerCase(ch))==-1)
                    isRowHAsAllWord[0] = false;
                if(row2.indexOf(Character.toLowerCase(ch))==-1)
                    isRowHAsAllWord[1] = false;
                if(row3.indexOf(Character.toLowerCase(ch))==-1)
                    isRowHAsAllWord[2] = false;
            }
            if(isRowHAsAllWord[0] || isRowHAsAllWord[1] || isRowHAsAllWord[2])
                ans.add(word);
        }
        return ans.toArray(new String[0]);
    }
}
