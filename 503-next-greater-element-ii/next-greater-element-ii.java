class Solution {
    public int[] nextGreaterElements(int[] arr) {
       int[] nextgr = new int[arr.length];
       Stack<Integer> st = new Stack<>();
       int last = arr[arr.length-1];

       for(int i = 2*arr.length-1;i>=0;i--)
       {
           int num = arr[i%arr.length];

           while(!st.isEmpty() && st.peek()<=num)
           {
               st.pop();
           }
           if(i<arr.length) {
               nextgr[i] = st.isEmpty() ? -1 : st.peek();
           }
           st.push(num);
       }

       return nextgr;

    }
}