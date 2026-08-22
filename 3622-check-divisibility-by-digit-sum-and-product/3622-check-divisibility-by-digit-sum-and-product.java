class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int sum =0;
        int temp=n; 
        while(temp>0){
            int curr=temp%10;
            sum+=curr;
            product*=curr;
            temp/=10;
        }

        return n%(sum+product)==0;
        
    }
}