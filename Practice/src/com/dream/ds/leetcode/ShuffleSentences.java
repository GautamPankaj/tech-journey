class Solution {
    public String sortSentence(String s) {
        String[] sentences = s.split(" ");
        String[] output = new String[sentences.length];
        for(String sentence : sentences){
            output[Character.getNumericValue(sentence.charAt(sentence.length()-1))-1] = sentence.substring(0,sentence.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < output.length; i++){
            sb.append(output[i]);
            if(i < output.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
