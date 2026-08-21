class Solution {
    public int maximum69Number (int n) {
    int num = 0;
        int num1 = 0;
        boolean d = true;
        while(n>0)
        {
               int rem = n%10;
                num = num*10 + rem;
                n/=10;

        }
        while(num>0)
        {
            int rem = num%10;
            if(d && rem == 6)
            {

                num1 = num1*10 + 9;
                d=false;
                num/=10;
            }
            else
            {
                num1 = num1*10 + rem;
                num/=10;
            }
        }
        
        return num1;
    }
}