class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int y=0;
        int copy=x;
        while(copy>0){
            int remainder= copy%10;
            y=y*10+remainder;
            copy=copy/10;
        }
        if(x==y){
            return true;
        }else{
            return false;
        }
        
    }
}