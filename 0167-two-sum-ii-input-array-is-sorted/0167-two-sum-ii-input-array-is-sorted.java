class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;
        int[] ans = new int[2]; 
        int sum=0;
        while(left<right){
            sum=numbers[left] + numbers[right];
            if(sum==target){
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }

        }
        return ans;
        
    }
}