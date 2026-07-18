class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int total = 0;
        for (int num : nums)
            total += num;

        Integer[][] dp = new Integer[nums.length][2 * total + 1];

        return solve(nums, target, 0, 0, dp, total);
    }
    public static int solve(int[] nums, int target, int index,
                            int sum, Integer[][] dp, int total) {

        // Base case
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        // Already computed?
        if (dp[index][sum + total] != null)
            return dp[index][sum + total];

        int add = solve(nums, target, index + 1,
                        sum + nums[index], dp, total);

        int subtract = solve(nums, target, index + 1,
                             sum - nums[index], dp, total);

        dp[index][sum + total] = add + subtract;

        return dp[index][sum + total];
    }

}