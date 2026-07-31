class Solution {
    public int minimumPushes(String word) {
        int[] fre=new int[26];
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            fre[curr-'a']++;
        }
        Arrays.sort(fre);
        int count=0;
        int dist=0;
        for(int i=25;i>=0;i--){
            if(fre[i]==0){
            break;
            }
            int currcount=(dist/8)+1;
            count+=currcount*fre[i];
            dist++;
        } 
        return count;
    }
}