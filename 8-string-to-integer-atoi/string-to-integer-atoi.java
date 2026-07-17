class Solution {
    public int myAtoi(String s) {
       
         s = s.trim();
        if (s.length() == 0) return 0;

        long num = 0;     
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        int index = 0;

        while (index < s.length()) {
            if (!Character.isDigit(s.charAt(index))) {
                break;
            }

            num = num * 10 + (s.charAt(index) - '0');

           
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (sign * num);
    }
}