class Solution {
    public int longestOnes(int[] nums, int k) {
        int max =0;
        int left=0;
        int n= nums.length;
        for(int right=0;right<n;right++){
            int curr=nums[right];
            if(curr==0){
                k--;
            }
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}