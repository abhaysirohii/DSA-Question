import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Step 1: Sort the array. Duplicates will now be adjacent.
        Arrays.sort(nums);
        
        // Step 2: Check neighboring elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
}