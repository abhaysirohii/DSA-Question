class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int first=list1.get(list1.size()-1);
            int second=list2.get(list2.size()-1);
            if(first>second) list1.add(nums[i]);
            else list2.add(nums[i]);
        }

        int[] result = new int[nums.length];
        int index=0;
        for(int curr:list1)  result[index++]=curr;
        for(int curr:list2)  result[index++]=curr;

        return result;
    }
}