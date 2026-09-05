class Solution {
    public int firstStableIndex(int[] arr, int k) {
         int[] rightSmallest = new int[arr.length];
        int min = arr[arr.length-1];
        rightSmallest[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            min = Math.min(arr[i],min);
            rightSmallest[i]=min;
        }
        int[] rightLargest = new int[arr.length];
        int max = arr[0];
        rightLargest[0]= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max = Math.max(arr[i],max);
            rightLargest[i]=max;

        }
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(rightLargest[i]-rightSmallest[i]<=k)
            {
                minIndex= Math.min(minIndex,i);
            }
        }
        if(minIndex==Integer.MAX_VALUE) return -1;
        return minIndex;

    }
}