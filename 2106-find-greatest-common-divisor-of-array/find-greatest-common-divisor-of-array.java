class Solution {
    public int findGCD(int[] nums) {
        int smallest=nums[0];
    int largets=nums[0];
    int max=0;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i] < smallest) smallest=nums[i];
    }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > largets) largets=nums[i];
        }
        for(int i=1;i<=largets;i++)
        {
            if(smallest%i ==0 && largets%i==0)
            {
               max=Math.max(max,i);
            }
        }
        return max;
    }
}