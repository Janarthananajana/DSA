class Solution {
    public int reverse(int num) {
          int reverse = 0;

        while(num != 0) {

            int lastDigit = num % 10;
            num = num / 10;

            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) {
                return 0;
            }

            reverse = reverse * 10 + lastDigit;
        }

        return reverse;
    }
}