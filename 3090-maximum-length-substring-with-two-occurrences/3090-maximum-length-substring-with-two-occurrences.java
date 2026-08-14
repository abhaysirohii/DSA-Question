class Solution {
    public int maximumLengthSubstring(String s) {
        int[] fre=new int[26];
        int left=0;
        int right=0;
        int max=0;
        while(right<s.length()){
            char curr=s.charAt(right);
            fre[curr-'a']++;

            while(fre[curr-'a']>2){
               char l =s.charAt(left);
               fre[l-'a']--;
               left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}