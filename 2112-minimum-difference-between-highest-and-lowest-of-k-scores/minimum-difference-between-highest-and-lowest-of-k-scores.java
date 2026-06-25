class Solution {
    public int minimumDifference(int[] arr, int k) {
         int l=0;
     int r=k-1;

     int min= Integer.MAX_VALUE;
        Arrays.sort(arr);
     while(r<arr.length)
     {
         min =Math.min(min,Math.abs(arr[l++]-arr[r++]));


     }
     return min;
    }
}