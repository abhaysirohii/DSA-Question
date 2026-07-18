class Solution {
    public int findGCD(int[] nums) {
        int low = nums[0];
        int high = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<low){
                low=nums[i];
            }
            if(nums[i]>high){
                high=nums[i];
            }
        }
        return gcd(low,high);
        
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a= temp;
        }
        return a;
    }
}