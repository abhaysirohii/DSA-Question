class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
                int m=st.peek();
                st.push(2*m);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("+")){
                int f= st.pop();
                int l=st.peek();
                st.push(f);
                st.push(f+l);
            }
            else{
                int num=Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}