class Solution {
    public int searchInsert(int[] nums, int target) {
        // if the array is empty insert it into the array
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int left = 0; 
        int right = nums.length - 1; 
        
        while (left <= right) { // t ,t, t, f
            int mid = left + (right - left) / 2; // 1, 2, 3
            if (nums[mid] == target) { // f, f, f
                return mid;
            } else if (nums[mid] < target) {  // t, t, t
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }
        return left;
        
    }
}
// time complexity: O(log n)
// space complexity: O(1)

/*
    nums = [1, 3, 5, 6]  target = 7
    index:  0, 1, 2, 3
    left = 0, 2, 3, 4
    right = 3
    mid = 1, 2, 3
*/