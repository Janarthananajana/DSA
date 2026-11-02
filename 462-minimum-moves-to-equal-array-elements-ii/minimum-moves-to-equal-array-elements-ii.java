class Solution {
    public int minMoves2(int[] nums) {
      Arrays.sort(nums);
      int mid = nums.length/2;
      int num = nums[mid];
      int sum=0;
      for(int n:nums)
      {
        sum+=Math.abs(n-num);
      } 
      return sum;

    }
}