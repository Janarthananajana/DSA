class Solution {
    public boolean checkDivisibility(int n) {
       
    int sum = 0;
        int product = 1;
        int actual = n;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        return actual % (sum + product) == 0;
    }
}