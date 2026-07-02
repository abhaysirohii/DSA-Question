class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] pre= new int[n];
        for(int i=0;i<bookings.length;i++){
            int first = bookings[i][0]-1;
            int last =  bookings[i][1]-1; 
            int seat = bookings[i][2];
            pre[first]+= seat;
            if(last+1<n){
                pre[last+1]-=seat;
            }
            }
        
        for(int i=1;i<n;i++){
            pre[i]=pre[i]+pre[i-1];
        }
        return pre;
        
    }
}