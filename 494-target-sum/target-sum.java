class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return Ways(nums,target, 0,0);
    }
    public static int Ways(int[] nums, int target, int index,int sum)
    {
        if(index == nums.length)
        {
            if(sum == target)
            {
                return 1;
            }
            return 0;
        }
        int add =  Ways(nums, target,  index+1, sum+nums[index]);
        int sub = Ways(nums, target, index+1,sum-nums[index]);
        return add+sub;
    }
}