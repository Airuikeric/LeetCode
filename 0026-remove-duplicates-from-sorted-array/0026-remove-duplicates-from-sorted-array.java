class Solution {
    public int removeDuplicates(int[] nums) {
        // the first number is alwasy unique
        int index = 1;
        // i < nums.length, so I can comparing the second last element to last element
        // make sure don't go out of bounds
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                // replace the index++ number to i + 1 number
                nums[index++] = nums[i + 1];
            }
        }
         // `index` is the count of unique elements
        return index;
    }
}