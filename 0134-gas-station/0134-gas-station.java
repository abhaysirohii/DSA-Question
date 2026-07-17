class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //Stores the total net fuel available after visiting all stations
        int totalFuel =0;
    // Stores current fuel while travelling from the current
        int currentFuel =0;
        int start =0;
 
        for(int i=0; i<gas.length;i++){
            //Calculate the ney fuel -current station
            int diff = gas[i]-cost[i];
             totalFuel+=diff;
            //Add the net fuel to the current jourmey
            currentFuel += diff;
            if(currentFuel < 0){
                start= i+1;
                currentFuel =0;
            }
 
        }
        if(totalFuel < 0){
            return -1;
        }
 
        return start;
       
    }
}