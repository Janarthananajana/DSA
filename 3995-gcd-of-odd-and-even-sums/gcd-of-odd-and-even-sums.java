class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a =0;
        int b =0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2!=0) a+=i;
            else b+=i;
        }
        int min = Math.min(a, b);
        int gcd = 1;

        for (int i = 1; i * i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = Math.max(gcd, i);

                int other = min / i;

                if (a % other == 0 && b % other == 0) {
                    gcd = Math.max(gcd, other);
                }
            }
        }

        return gcd;
    }
}