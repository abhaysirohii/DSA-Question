class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        rotated(nums,0,n-1);
        rotated(nums,0,k-1);
        rotated(nums,k,n-1);
        
    }
    private void rotated(int[] arr,int i,int k){
        int left=i;
        int right=k;
        while(left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
    }
}