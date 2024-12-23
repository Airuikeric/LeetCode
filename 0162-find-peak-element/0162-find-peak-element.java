class Solution {
    public int findPeakElement(int[] nums) {
        // base case
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // compare mid with mid + 1 to decide which side to search
            if (nums[mid] > nums[mid + 1]) {
                // peak is on the left side or at mid
                right = mid;
            } else {
                // peak is on the right side 
                left = mid + 1;
            }
        }
        
        return left;
    }
}
/*
   •   Time Complexity: O(log n) due to binary search.
   •   Space Complexity: O(1) because no additional space is used apart from a few variables.
*/
