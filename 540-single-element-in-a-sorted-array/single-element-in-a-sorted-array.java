class Solution {
    public int singleNonDuplicate(int[] arr) {
          int i=0;
       int j=arr.length-1;
	   while(i<=j)
	   {
	    if(i == arr.length - 1||arr[i] != arr[i+1])
	    {
	        return arr[i];
	    }
	    if(j == 0||arr[j]!=arr[j-1])
	    {
	        return arr[j];
	    }
	    i+=2;
	    j-=2;
	  }
	  return 0;
    }
}