class Solution {
    public int searchInsert(int[] nums, int target) {
        // if the array is empty insert it into the array
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        
        /*
             0, 1, 2, 3
            [1, 3, 5, 6]
            
            target = 2
            left = 2
            right = 3
                
*/
        int left = 0; // 0
        int right = nums.length - 1; // 3
        
        while (left <= right) { // t, t
            int mid = left + (right - left) / 2; // 1, 2
            if (nums[mid] == target) { // f, f
                return mid;
            } else if (nums[mid] < target) { // t, f
                left = mid + 1;
            } else { // f
                right = mid - 1;
            }
        }
        return left;
        
    }
}
// time complexity: O(log n)
// space complexity: O(1)