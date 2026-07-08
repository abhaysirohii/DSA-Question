import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>(); // Stores indices, not temperatures
        int[] result = new int[n];
        
        // FIXED: Loop condition changed to i >= 0
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are colder or equal to the current day
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            
            // If stack is not empty, the top element is the index of the next warmer day
            if (!st.isEmpty()) {
                result[i] = st.peek() - i; // Difference in indices = number of days
            } // Otherwise, it defaults to 0
            
            // Push the current day's index onto the stack
            st.push(i);
        }
        
        return result;
    }
}