class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
            else{
                continue;
            }
            if(i+1<nums.length){
               int next= i+1;
               int product = nums[i];
               while(next<nums.length && product* nums[next]<k ){
                     product =product * nums[next];
                    next++;
                    count++;
                }
            }
        }
        return count;
        
    }
}