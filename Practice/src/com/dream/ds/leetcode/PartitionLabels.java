class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] ch = s.toCharArray();
        int lastIndex=-1;
        int charIndex=0;
        int prevIndex=0;
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            lastIndex = s.lastIndexOf(ch[charIndex]);
            while(charIndex <= lastIndex){
                lastIndex=Math.max(s.lastIndexOf(ch[charIndex++]),lastIndex);
            }
            list.add(charIndex-prevIndex);
            prevIndex = charIndex;
            if(charIndex > s.length()-1)
                break;
        }
        return list;
    }
}
