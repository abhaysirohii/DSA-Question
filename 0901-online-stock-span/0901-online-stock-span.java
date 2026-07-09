import java.util.Stack;

class StockSpanner {
    // Store pairs as int[]: index 0 is price, index 1 is its span
    private Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        // Pop elements from the stack while the current price is greater or equal
        // Accumulate their spans directly
        while (!st.isEmpty() && price >= st.peek()[0]) {
            span += st.pop()[1];
        }
        
        // Push the current price and its accumulated span onto the stack
        st.push(new int[]{price, span});
        
        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */