class Solution {
    public String removeOuterParentheses(String name) {
        Stack<Character> st=new Stack<>();
           ArrayList<Integer> list = new ArrayList<>();
           list.add(0);
           st.push(name.charAt(0));
           StringBuilder str= new StringBuilder();
           int i=1;
           while(i<name.length())
           {
               if(!st.isEmpty() && name.charAt(i)!=st.peek())
               {

                       char s = st.pop();
                   if(!st.isEmpty()) {
                       str.append(s);
                       str.append(name.charAt(i));
                   }
                   if(st.isEmpty())
                   {
                       list.add(i);
                       list.add(i+1);
                       st.push('(');
                       i+=2;
                   }
                   else {
                       i++;
                   }
               }

               else{
                   st.push(name.charAt(i));
                   i++;
               }

           }

           int j=0;
           StringBuilder strr= new StringBuilder();
            while(j < list.size()-1)
            {
                String sub=name.substring(list.get(j)+1,list.get(j+1));
                strr.append(sub);
                j+=2;
            }
       return strr.toString();
    }
}