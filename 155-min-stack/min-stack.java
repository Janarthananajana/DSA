class MinStack {
Stack<Integer> st;
    Stack<Integer> minSt;

    // Constructor
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    // Push element
    public void push(int val) {
        st.push(val);

        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    // Pop element
    public void pop() {
        int removed = st.pop();

        if (removed == minSt.peek()) {
            minSt.pop();
        }
    }

    // Get top element
    public int top() {
        return st.peek();
    }

    // Get minimum element
    public int getMin() {
        return minSt.peek();
    }
}

