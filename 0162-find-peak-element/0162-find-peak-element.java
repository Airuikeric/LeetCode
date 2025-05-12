class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int left = 0; // 0
        int right = nums.length - 1; // 3

        while (left < right) { // t, t, f
            int mid = left + (right - left) / 2; // 1, 2

            if (nums[mid] > nums[mid + 1]) { // f, t
                // peak is on the left side or at mid
                right = mid; // right = 2
            } else { // t 
                // peak is on the right side
                left = mid + 1; // left = 2
            }
        }
        return left;
    }
}

/*
    index          0 1 2 3
    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 
*/