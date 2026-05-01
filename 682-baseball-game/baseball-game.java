class Solution {
    public int calPoints(String[] nums) {
         Stack<String> st = new Stack<>();
        int sum=0;
        for(String a:nums)
        {
            if(a.equals("C"))
            {
                st.pop();
            }
            if(a.equals("D"))
            {
                String n = st.pop();
                int p = Integer.parseInt(n);
                st.push(n);
                st.push(String.valueOf(p*2));
            }
            if(a.equals("+"))
            {
                String f=st.pop();
                String s=st.pop();
                int ff= Integer.parseInt(f);
                int ss=Integer.parseInt(s);
                st.push(s);
                st.push(f);
                st.push(String.valueOf(ff+ss));
            }
           if(!a.equals("C") && !a.equals("D") && !a.equals("+")){
                st.push(a);
            }
        }
        while(!st.isEmpty())
        {
           int n = Integer.parseInt(st.pop());
           sum+=n;
        }
         return sum;
    }
}