class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder strb = new StringBuilder();
        for(int i=0;i<k-1;i++)
        {
            strb.append(str[i]);
            strb.append(" ");
        }
        strb.append(str[k-1]);
        return strb.toString();
    }
}