class Solution {
    public String restoreString(String s, int[] indices) {
        char[] output = new char[indices.length];
        for(int i=0; i < indices.length; i++){
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }
}
