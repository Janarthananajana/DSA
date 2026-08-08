class Solution {
    public int minOperations(int[] arr) {
          int i=0;
    int count=0;
        int op =0;
        while(i<arr.length-2)
        {
           
            if(arr[i]==0)
            { count++;

                for(int j=i;j<i+3;j++)
                {
                    if(arr[j]==0) arr[j]=1;
                    else arr[j]=0;
                }

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