class Solution {
    public int alternatingSum(int[] nums) {
        
       int i = 1;
        int sum = nums[0];
        boolean condition = true;
        while (i < nums.length) {
            if (condition) {
                sum = sum - nums[i];
                condition=false;
            } else {
                sum = sum + nums[i];
                condition=true;
            }
            i++;
        }
        return sum;
    }
}