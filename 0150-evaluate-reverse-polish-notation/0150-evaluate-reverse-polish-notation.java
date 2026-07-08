class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            if(token.equals("+") || token.equals("-") ||token.equals("*")  ||token.equals("/")){
                int v1= st.pop();
                int v2=st.pop();
                int result;
                if(token.equals("+")){
                    result = v2 + v1;
                } else if(token.equals("/")){
                    result = v2/v1;
                }else if(token.equals("*")){
                    result = v2 * v1;
                }else{
                    result = v2 - v1;
                }
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
        
    }
}