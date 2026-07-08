class MinStack {
    Stack<Integer> st;
    Stack<Integer> stmin;

    public MinStack() {
        this.st= new Stack<>();
        this.stmin= new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(stmin.empty() || value<=stmin.peek()){
            stmin.push(value);
        }

        
    }
    
    public void pop() {
        int v = st.pop();
        if(stmin.peek()==v){
            stmin.pop();
        }
        
    }
    
    public int top() {
        int t=st.peek();
        return t;
        
    }
    
    public int getMin() {
        return stmin.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */