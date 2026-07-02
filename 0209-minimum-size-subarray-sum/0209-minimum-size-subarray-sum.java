class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;
        
        // 'right' expands the window naturally every iteration
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            // Shrink the window from the left as long as the condition is met
            while (sum >= target) {
                // Update our min length using the current valid window boundaries
                min = Math.min(min, right - left + 1);
                
                // Shrink state
                sum -= nums[left];
                left++;
            }
        }
        
        // If 'min' was never updated, it means no valid subarray exists
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}