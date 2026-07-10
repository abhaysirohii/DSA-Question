class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int length = s.length();
        
        // Optimization 1: Use s.charAt() directly instead of s.toCharArray()
        // to avoid allocating a brand new char array in memory.
        for (int i = 0; i < length; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < length; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}