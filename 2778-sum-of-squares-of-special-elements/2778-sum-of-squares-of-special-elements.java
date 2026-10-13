class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int curr=i+1;
            if(n%curr==0){
                ans=ans+(nums[i]*nums[i]);
            }
        }
        return ans;
    }
}