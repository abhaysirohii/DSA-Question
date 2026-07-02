import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // If we find a duplicate, shrink from the left 
            // until the older duplicate is kicked out of the set
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Now it's safe to add the character and update max
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}