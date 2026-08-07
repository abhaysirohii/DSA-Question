class Solution {
    public String toLowerCase(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr>= 65 && curr<=90){
                result+=(char)(curr+32);
            }else{
                result+=curr;
            }
        }
        return result;
    }
}