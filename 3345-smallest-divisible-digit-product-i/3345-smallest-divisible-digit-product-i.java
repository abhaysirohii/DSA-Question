class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        int product=1;
        while(temp>0){
            int curr=temp%10;
            product*=curr;
            temp/=10;
        }
        int result;
        if(product%t==0){
            result= n;
        }
        else{
            result=smallestNumber(n+1,t);
        }
        return result;
    }
}