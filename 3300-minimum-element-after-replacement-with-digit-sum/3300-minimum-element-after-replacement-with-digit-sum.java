class Solution {
    public int minElement(int[] nums) {
        int n= nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int sum=0;
            while(curr>0){
                sum+=(curr%10);
                curr/=10;
            }
            nums[i]=sum;
            min=Math.min(min,sum);
        }
        return min;
    }
}