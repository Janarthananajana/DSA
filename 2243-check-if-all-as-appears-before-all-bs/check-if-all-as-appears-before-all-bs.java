class Solution {
    public boolean checkString(String s) {
       int a=0 ;
        int b=1;
        while(b<s.length())
        {
            if(s.charAt(a)==s.charAt(b)) {
                a++;
                b++;
                continue;

            }
            else
            {
                if(s.charAt(a)=='a' && s.charAt(b)=='b')
                {   a++;
                    b++;
                    continue;
                }
                else return false;
            }


        }
        return true;
    }
}