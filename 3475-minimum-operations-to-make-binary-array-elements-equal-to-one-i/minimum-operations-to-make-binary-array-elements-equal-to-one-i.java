class Solution {
    public int minOperations(int[] arr) {
         int i=0;
    int count=0;
        int op =0;
        while(i<arr.length-2)
        {

            if(arr[i]==0)
            { count++;

                arr[i]=1;
                arr[i+1]=arr[i+1]==0?1:0;
                arr[i+2]=arr[i+2]==0?1:0;

            }
            i++;

        }
    for(int k=arr.length-1;k>=0;k--)
    {
        if(arr[k]==0) return -1;
    }
    return count;
    }
}