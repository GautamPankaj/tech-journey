class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] output = new int[friends.length];
        int j = 0;
            for(int i : order){
                for (int friend : friends) {
                     if (friend == i) {
                        output[j++] = i;
                    }
                }
            }
            return output;
    }
}
