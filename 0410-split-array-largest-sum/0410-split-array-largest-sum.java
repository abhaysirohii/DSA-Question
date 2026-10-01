class Solution {
    static boolean isvalid(int[] nums, int k,int mid){
        int s=1;
        int pages=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid) return false;
            if(pages+nums[i]<=mid){
                pages+=nums[i];
            }
            else{
                s++;
                pages=nums[i];
            }
        }
        return s<=k;
    }
    public int splitArray(int[] nums, int k) {
        int left=1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int right = sum;
        int ans=right;
        while(left <=right){
            int mid=left+(right-left)/2;
            if(isvalid(nums,k,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}