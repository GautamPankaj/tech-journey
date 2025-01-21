class Solution {
    public String truncateSentence(String s, int k) {
        String[] wordArray = s.split(" ");
        int arrayLength = wordArray.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(true){            
            if(arrayLength == 0  || k == 0){
                break;
            }
            if(i != 0)
                sb.append(" ");
            sb.append(wordArray[i]);
            arrayLength--;
            k--;
            i++;
        }
        return sb.toString();
    }
}
