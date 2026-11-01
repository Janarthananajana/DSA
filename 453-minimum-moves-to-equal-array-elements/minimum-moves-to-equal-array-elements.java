class Solution {
    public int minMoves(int[] nums) {
     int max = nums[0];
      for(int n:nums)
      {
        max = Math.min(max,n);
      }
      int minimum =0;
      for(int n:nums)
      {
          minimum +=n-max;
      
      }  
      return minimum;
    }
}