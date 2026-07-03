class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        // 1. Build frequency arrays for the target pattern 'p' and our active window
        int[] pCounts = new int[26];
        int[] windowCounts = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCounts[p.charAt(i) - 'a']++;
            windowCounts[s.charAt(i) - 'a']++;
        }

        // 2. Check if the initial window matches the pattern
        if (Arrays.equals(pCounts, windowCounts)) {
            result.add(0);
        }

        // 3. Slide the fixed-size window across the rest of string 's'
        int left = 0;
        for (int right = p.length(); right < s.length(); right++) {
            // Include the incoming character on the right
            windowCounts[s.charAt(right) - 'a']++;
            
            // Remove the outgoing character on the left
            windowCounts[s.charAt(left) - 'a']--;
            left++; // Move the left boundary forward

            // Check if the newly shifted window is an anagram match
            if (Arrays.equals(pCounts, windowCounts)) {
                result.add(left);
            }
        }

        return result;
    }
}