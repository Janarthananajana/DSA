class Solution {
    public boolean backspaceCompare(String str1, String str2) {
    Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        // Process str1
        for(char ch : str1.toCharArray()) {
            if(ch == '#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        // Process str2
        for(char ch : str2.toCharArray()) {
            if(ch == '#') {
                if(!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        // Compare stacks
        return st.equals(st1);
    }
}