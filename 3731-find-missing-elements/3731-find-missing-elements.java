class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int n=max-min+1;
        boolean[] demo = new boolean[n];
        for(int curr:nums){
            demo[curr-min]=true;
        }
        for(int i=0;i<n;i++){
            if(demo[i]==false){
                list.add(i+min);
            }
        }
        return list;
    }
}