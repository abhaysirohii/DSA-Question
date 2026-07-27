class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int curr:nums){
            if(curr>max1){
                max2=max1;
                max1=curr;
            }else if(curr>max2){
                max2=curr;
            }
            if(curr<min1){
                min2=min1;
                min1=curr;
            }else if(curr<min2){
                min2=curr;
            }
        }
        int result1=(min1-1)*(min2-1);
        int result2=(max1-1)*(max2-1);
        return Math.max(result1,result2);
    }
}