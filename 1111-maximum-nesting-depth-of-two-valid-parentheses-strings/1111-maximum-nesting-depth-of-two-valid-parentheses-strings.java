class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count =0;
        int n= seq.length();
        int[] result= new int[n];
        int index=0;
        for(char ch:seq.toCharArray()){
            if(ch=='('){
                result[index]=count%2;
                count++;
            }else {
                count--;
                result[index]=count%2;
            }
            
            index++;
        }
        return result;
    }
}