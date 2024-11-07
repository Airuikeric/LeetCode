class Solution {
    public int searchInsert(int[] nums, int target) {
        // if the array is empty insert it into the array
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        
        /*
             0, 1, 2, 3
            [1, 3, 5, 6]
            
            left = 0
            right = 1
            mid = 1, 0
            target = 2
                
*/
        int left = 0; // 0
        int right = nums.length - 1; // 3
        
        while (left <= right) { // t, t
            int mid = left + (right - left) / 2; // 1, 0
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // t
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