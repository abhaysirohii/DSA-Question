class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // 1. Initialize the sum of the first window (first k elements)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Start your max tracking with this first window's sum
        int maxSum = sum;
        
        // 2. Slide the window across the rest of the array
        for (int right = k; right < nums.length; right++) {
            // Add the new element entering the window, subtract the one leaving
            sum += nums[right] - nums[right - k]; 
            
            // Track the maximum sum found
            maxSum = Math.max(maxSum, sum);
        }
        
        // 3. Convert to double at the very end to keep precision
        return (double) maxSum / k;
    }
}