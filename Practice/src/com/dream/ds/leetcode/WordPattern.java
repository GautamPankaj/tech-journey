class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] str = s.split(" ");
        if(ch.length != str.length)
            return false;
        Map<Character,String> map = new HashMap<Character,String>();
        int len=0;
        while(len < ch.length){
            map.put(ch[len],str[len]);
            len++;
        }
        len=0;
        while(len < ch.length){
            if(!map.get(ch[len]).equals(str[len]))
                return false;
            len++;
        }
        len=0;
        Map<String,Character> strMap = new HashMap<String,Character>();
        while(len < str.length){
            strMap.put(str[len],ch[len]);
            len++;
        }
        len=0;
        while(len < str.length){
            if(!strMap.get(str[len]).equals(ch[len]))
                return false;
            len++;
        }

        
        return true;
    }
}
