class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int curr:nums){
            if(curr>max1){
                max2=max1;
                max1=curr;
            }else if(curr>max2){
                max2=curr;
            }
        }
        int result=(max1-1)*(max2-1);
        return result;
    }
}