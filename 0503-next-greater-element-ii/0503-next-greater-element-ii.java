class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] result= new int[nums.length]; 
        for(int i=2* nums.length-1;i>=0;i--){
            int curr=nums[i%nums.length];
            while(!st.isEmpty() && curr>=st.peek()){
                st.pop();
            }
            if(i<nums.length){
              if(st.isEmpty()){
                result[i]=-1;
               }
              else{
                result[i]=st.peek();
              }
            }  
            st.push(curr);
        }
        return result; 
        
    }
}