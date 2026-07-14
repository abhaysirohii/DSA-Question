class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast=n;
        do{
            slow=squr(slow);
            fast=squr(squr(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        else{
            return false;
        }
    }    

    private int squr(int num){
          int ans=0;
          int curr;
          while(num>0){
            curr= num%10;
            ans+= curr*curr;
            num=num/10;
        }
        return ans;
        
    }    
}