class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int maxNoDeletion = arr[0];
        int maxOneDeletion = arr[0];
        int overallMax = arr[0];
        
        for (int i = 1; i < n; i++) {
            maxOneDeletion = Math.max(
                maxNoDeletion,             
                maxOneDeletion + arr[i]    
            );
            maxNoDeletion = Math.max(arr[i], maxNoDeletion + arr[i]);
            
            overallMax = Math.max(overallMax, Math.max(maxNoDeletion, maxOneDeletion));
        }
        
        return overallMax;
    }
}