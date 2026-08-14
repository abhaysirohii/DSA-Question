class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int max=0;
        while(right<s.length()){
            char curr=s.charAt(right);

            map.put(curr,map.getOrDefault(curr,0)+1);

            while(map.get(curr)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}