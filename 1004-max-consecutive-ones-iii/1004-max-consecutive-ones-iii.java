class Solution {
    public int longestOnes(int[] nums, int k) {
        int size =0;
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
            size=right-left+1;
            max=Math.max(max,size);
        }
        return max;
    }
}