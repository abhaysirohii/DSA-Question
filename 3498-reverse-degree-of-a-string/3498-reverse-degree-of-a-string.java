class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
            int value=26-(curr-'a');
            total=total+(value*(i+1));

        }
        return total;
    }
}