class Solution {
    public int findKthPositive(int[] arr, int k) {
       
           
        int max = 0;
        for (int a : arr) {
            max = Math.max(max, a);
        }

        int[] newarr = new int[max];

        for (int a : arr) {
            newarr[a - 1] = 1;
        }

        int count = 0;

        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] == 0) {
                count++;
                if (count == k) {
                    return i + 1; // return actual number
                }
            }
        }

        // if kth missing is beyond max
        return max + (k - count);
    }
}