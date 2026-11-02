class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int mid = nums.length/2;
       int midNum = nums[mid];
       int sum=0;
       for(int n:nums)
       {
          sum+=Math.abs(n-midNum);
       }
       return sum;
    }
}