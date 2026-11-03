class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[nums.length-1];
        int sum=0;
        for(int n:nums)
        {
            sum+=min-n;
        }
        return sum;
    }
}