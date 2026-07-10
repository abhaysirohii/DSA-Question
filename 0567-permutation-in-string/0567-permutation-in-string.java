class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1=new int[26];
        int[] f2=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']+=1;
            f2[s2.charAt(i)-'a']+=1;
        } 
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (f1[i] == f2[i]) matches++;
        }
        if (matches == 26) return true;
        for(int i=s1.length();i<s2.length();i++){
            f2[s2.charAt(i)-'a']+=1;
            f2[s2.charAt(i-s1.length())-'a']-=1;
            if(Arrays.equals(f1,f2)){
            return true;       
            }
        }
        return false;
        
    }
}