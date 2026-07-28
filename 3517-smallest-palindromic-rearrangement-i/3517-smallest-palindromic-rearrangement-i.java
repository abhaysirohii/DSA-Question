class Solution {
    public String smallestPalindrome(String s) {

        int[] ch=new int[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            ch[curr-'a']++;
        }
       char[] res= new char[s.length()];
       int left=0;
       int right=s.length()-1;
       for(int i=0;i<26;i++){
           while(ch[i]>=2){
            char c=(char) ('a' + i);
            res[left]=c;
            res[right]=c;
            left++;
            right--;
            ch[i]-=2;
            }
        }
        for(int i=0;i<26;i++){
            if(ch[i]==1){
                res[left]=(char) ('a'+i);
                break;
            }
        }
        return new String(res);
    }
}