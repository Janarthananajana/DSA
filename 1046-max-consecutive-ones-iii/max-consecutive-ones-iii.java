class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int swap=0;
      int maxLenght=0;
      int i=0;
      int j = 0;
      while(j<nums.length)
      {
          if(nums[j]==0)
          {
              swap++;
          }
          while(swap>k)
          {

             if(nums[i]==0)
             {
                 swap--;
             }
             i++;
          }
          maxLenght = Math.max(maxLenght,j-i+1);
          j++;
      }
       return maxLenght;
        
    }
}