class Solution {
    public String smallestPalindrome(String s) {

        int[] ch=new int[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            ch[curr-'a']++;
        }
        StringBuilder left= new StringBuilder();
        String middle="";
        for(int i=0;i<26;i++){
            for(int j=0;j<ch[i]/2;j++){
                left.append((char) ('a'+i));
            }
            if(ch[i]%2==1){
                middle=String.valueOf((char) ('a'+i));
            }
        }
        String right=new StringBuilder(left).reverse().toString();

        return left.toString()+middle+right;
    }
}