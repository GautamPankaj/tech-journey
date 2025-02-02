class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // Get the length of the input array.
        int n = nums.length;
        // Initialize an ArrayList to hold the target elements.
        List<Integer> targetList = new ArrayList<>();
        // Iterate through each element of nums and index arrays.
        for (int i = 0; i < n; ++i) {
            // Add the current element from nums into the targetList at the position given by index[i].
            targetList.add(index[i], nums[i]);
        }

        // Initialize the target array.
        int[] targetArray = new int[n];
        // Convert the ArrayList back into an array.
        for (int i = 0; i < n; ++i) {
            targetArray[i] = targetList.get(i);
        }
        // Return the resultant target array.
        return targetArray;
    }
}
