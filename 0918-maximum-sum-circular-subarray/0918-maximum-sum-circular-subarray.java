class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int max_curr = 0, max_global = nums[0];
        int min_curr = 0, min_global = nums[0];
        
        for (int x : nums) {
            totalSum += x;
            
            // Standard Kadane to find maximum subarray
            max_curr = Math.max(x, max_curr + x);
            max_global = Math.max(max_global, max_curr);
            
            // Modified Kadane to find minimum subarray
            min_curr = Math.min(x, min_curr + x);
            min_global = Math.min(min_global, min_curr);
        }
        
        // Edge case: If all numbers are negative, max_global will be the largest single negative element.
        // totalSum - min_global would equal 0 (empty subarray, which isn't allowed).
        if (max_global < 0) {
            return max_global;
        }
        
        return Math.max(max_global, totalSum - min_global);
    }
}