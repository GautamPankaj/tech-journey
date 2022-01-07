class Solution {
    public void sortColors(int[] nums) {
        int countRed = 0;
        int countWhite = 0;
        int countBlue = 0;
        for(int i : nums){
            if(i == 0)
                countRed++;
            if(i == 1)
                countWhite++;
            if(i == 2)
                countBlue++;
        }
        int i = 0;
        while(true){
            while(countRed > 0){
                nums[i++] = 0;
                countRed--;
            }
            while(countWhite > 0){
                nums[i++] = 1;
                countWhite--;
            }
            while(countBlue > 0){
                nums[i++] = 2;
                countBlue--;
            }
            break;
        }
    }
}
