class Solution {
    public int binaryGap(int n) {
       String s = Integer.toBinaryString(n);
       int left =s.indexOf("1");
       int right=0;
       int max =0;
       while(right < s.length())
       {
         if(s.charAt(right)=='1')
         {
            max = Math.max(max, right - left);
            left = right;
         }
         right++;
       }
        return left>0?max:0;
    }
}