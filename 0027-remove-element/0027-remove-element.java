class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                nums[left]=nums[i];
                left++;
            }

        }
        return left;
    }
}