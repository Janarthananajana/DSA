class Solution {
    public String largestOddNumber(String num) {
        boolean con = true;
        int index =num.length()-1;
        while(con)
        {
            if(index<0) con=false;
            else
            {
                int n = num.charAt(index);
                if(n%2!=0) con=false;
            }
            index--;

        }
       
        return num.substring(0,index+2);
    }
}