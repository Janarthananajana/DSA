class Solution {
    public String removeStars(String st) {
       Stack<Character> normalst= new Stack<>();
    Stack<Character> revesedst= new Stack<>();
    for(char ch:st.toCharArray())
    {
        if(ch == '*')
        {
            normalst.pop();
        }
        else {
            normalst.push(ch);
        }
    }
    while(!normalst.isEmpty())
    {
        revesedst.push(normalst.pop());
    }
    StringBuilder str = new StringBuilder();
    while(!revesedst.isEmpty())
    {
        str.append(revesedst.pop());
    }
    return str.toString(); 
    }
}