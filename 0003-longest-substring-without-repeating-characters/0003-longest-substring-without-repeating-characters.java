import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map stores: Character -> Its index in the string
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            if (map.containsKey(ch)) {
                // Move left to the right of the old duplicate's index.
                // Math.max ensures left never moves backward if the duplicate is outside our window.
                left = Math.max(left, map.get(ch) + 1);
            }
            
            // Update or insert the character's newest position
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}