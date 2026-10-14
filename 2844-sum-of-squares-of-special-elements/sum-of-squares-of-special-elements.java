class Solution {
    public int sumOfSquares(int[] nums) {
        int a =0;
        for(int i=1;i<=nums.length;i++)
        {
           if(nums.length%i==0)  a += nums[i-1]*nums[i-1];
        }
        return a;
    }
}