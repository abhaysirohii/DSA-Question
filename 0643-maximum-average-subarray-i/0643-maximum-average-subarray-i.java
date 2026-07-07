class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 1. Initialize max to the smallest possible value (handles negative numbers)
        int max = Integer.MIN_VALUE; 
        int sum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            // 2. Fixed the window size calculation (right - left + 1)
            int size = right - left + 1; 
            
            // 3. Once the window hits size k, check max and slide it forward
            if (size == k) {
                max = Math.max(max, sum);
                
                sum -= nums[left]; // Remove element leaving the window
                left++;            // Move the left pointer forward
            }
        }
        
        // 4. Cast to double at the very end to prevent integer division from dropping decimals
        return (double) max / k; 
    }
}