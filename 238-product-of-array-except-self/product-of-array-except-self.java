class Solution {
    public int[] productExceptSelf(int[] arr) {
         int[] arrExcpetFirst = new int[arr.length];
        Arrays.fill(arrExcpetFirst,1);
        int[] arrExceptSecond = new int[arr.length];
        Arrays.fill(arrExceptSecond,1);
        for(int i=1;i<arr.length;i++)
        {
            arrExcpetFirst[i]=arr[i-1]*arrExcpetFirst[i-1];
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            arrExceptSecond[i]=arr[i+1]*arrExceptSecond[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arrExcpetFirst[i]*arrExceptSecond[i];
        }
       return arr;
    }
}