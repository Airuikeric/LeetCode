class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // base case; if num2 is empty, no need to merge
        if (n == 0) {
            return; // return to first array
        }
        
        // base case: if nums1 is empty, copy all the elements from nums2 to nums1;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        
        int i = m - 1; // pointer for nums1;
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for end of nums1
        
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // if ther eare remaining elements in nums2[j]
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}