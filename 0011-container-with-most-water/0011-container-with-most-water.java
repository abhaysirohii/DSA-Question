class Solution {
    public int maxArea(int[] height) {
        int curr=0;
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                curr=height[left]*(right-left);
                left++;
            }else if(height[left]>height[right]){
                curr=height[right]*(right-left);
                right--;
            }
            else if(height[left]==height[right]){
                curr=height[right]*(right-left);
                right--;
            }
            max=Math.max(max,curr);
        }
        return max;
        
    }
}