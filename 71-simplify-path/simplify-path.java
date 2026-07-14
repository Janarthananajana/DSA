class Solution {
    public String simplifyPath(String s) {
        String[] str = s.split("/");

        Stack<String> st = new Stack<>();

        for (String part : str) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(part);
            }
        }
        String[] array = new String[st.size()];
        int index = array.length-1;
        StringBuilder strbuil = new StringBuilder();
        if(st.size()==0) strbuil.append("/");
        else {
            while(!st.isEmpty())
            {
                array[index--]=st.pop();
            }
        }

        for(String str1:array)
        {
            strbuil.append("/");
            strbuil.append(str1);
        }
        return strbuil.toString();
    }
}