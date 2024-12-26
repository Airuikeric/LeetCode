class Solution {
    public int search(int[] nums, int target) {
        // base case
         if (nums == null || nums.length <= 0) {
            return -1;
         }
        
        int left = 0;
        int right = nums.length - 1;
        
        // Step 1: Find the pivot point (smallest elemenmt in the array)
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                // pivot is in the right half
                left = mid + 1;
            } else {
                // pivot is in the left half
                right = mid;
            }
        }
        
        // left is now at the pivot point
        int start = left;
        
        // reset search range
        left = 0;
        right = nums.length - 1;
        
        // step 2: Decide the search range
        if (target >= nums[start] && target <= nums[right]) {
            left = start; // Target lies in the left sorted half
        } else {
            right = start - 1; // target lies in the left sorted half
        }
        
        // step 3: perform binary search in the selected range
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}