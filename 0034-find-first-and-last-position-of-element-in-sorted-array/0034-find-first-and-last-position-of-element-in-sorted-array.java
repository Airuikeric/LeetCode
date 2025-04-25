class Solution {
   public int[] searchRange(int[] nums, int target) {
       // check for base case: emtpy array
       if (nums == null || nums.length <= 0) {
           return new int[] {-1, -1};
       }

       // find the leftmost occurrence of the target
       int left = findLeftMost(nums, target);
       // if leftmost occurrence is not found, return [-1, -1]
       if (left == -1) {
           return new int[] {-1, -1};
       }

       // find the rightmost occurrence of the target
       int right = findRightMost(nums, target);
       // return the range (left, right)
       return new int[] {left, right};
   }

    // helper method to find the leftmost occurrence of the target
    private int findLeftMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    // helper method to find the rightmost occurrence of the target
    private int findRightMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[right] == target) {
            return right;
        } else if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}