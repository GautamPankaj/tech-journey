class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!map.isEmpty() && map.get(s.charAt(i)) != null){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int oddCount=0;
        int evenCount=0;
        boolean oddCountExist = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 0)
                evenCount = evenCount + entry.getValue();
            else{
                oddCountExist = true;
                oddCount = oddCount + entry.getValue() - 1;
            }      
        }
        if(oddCountExist)
            return evenCount+oddCount+1;
        return evenCount+oddCount;
    }
}
