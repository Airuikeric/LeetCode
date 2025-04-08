class Solution {
    public int removeElement(int[] nums, int val) {
        // base case: if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the valid size coutner 
        int valid_size = 0;

        // iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // if the current element is not equal to val
            if (nums[i] != val) {
                // place it at the valid_size index
                nums[valid_size] = nums[i];
                // increment the vlaid size counter
                valid_size++;
            }
        }
        // return the number of elements not equal to val
        return valid_size;
    }
}