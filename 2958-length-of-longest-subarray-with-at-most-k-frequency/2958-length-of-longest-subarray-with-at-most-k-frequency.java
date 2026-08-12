import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while (map.get(curr) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}