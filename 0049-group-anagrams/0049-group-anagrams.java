import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store the sorted string as the key and the list of anagrams as the value
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            // 1. Get the original string
            String original = strs[i];
            
            // 2. Sort the characters of the string to create the key
            char[] chars = original.toCharArray();
            Arrays.sort(chars);
            String copy = new String(chars);
            
            // 3. Put it in the map
            if (map.containsKey(copy)) {
                map.get(copy).add(original);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(original);
                map.put(copy, newList);
            } 
        }
        
        // 4. Collect all the grouped lists from the map and return them
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }
        
        return result;
    }
}