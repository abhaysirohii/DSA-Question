class Solution {
    public String minWindow(String s, String t) {
        if(s.isBlank() ||t.isBlank() ){
            return "";
        }

        int[] map= new int[128];
        for(char ch:t.toCharArray()){
            map[ch]+=1;
        }
        int left=0;
        int right=0;
        int count=t.length();
        int minlen= Integer.MAX_VALUE;
        int minstart =0;

        while(right<s.length()){
            char ch=s.charAt(right);
            if(map[ch]>0){
                count--;
            }
            map[ch]=map[ch]-1;
            right++;
            while(count==0){
                if(right-left<minlen){
                    minlen=right-left;
                    minstart=left;
                }
                char ch2= s.charAt(left);
                map[ch2]++;
                if(map[ch2]>0){
                    count++;
                }
                left++;
            }

        }
        return minlen==Integer.MAX_VALUE ?  "" :  s.substring(minstart,minstart+minlen);
    }    
}