class Solution {
    public boolean isSameAfterReversals(int num) {
        String num1 =String.valueOf(num);
        if(num1.length() == 1) return true;
        if(num1.length()>1)
        {
        if(num%10==0) return false;
        }
        
        return true;
        }
       
    }
