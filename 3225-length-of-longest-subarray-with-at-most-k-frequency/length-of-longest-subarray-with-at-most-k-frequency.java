class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int maxlen=-1;
        for(int righ=0;righ<nums.length;righ++)
        {
            map.put(nums[righ],map.getOrDefault(nums[righ],0)+1);
            while(map.get(nums[righ])>k)
            {
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[righ])==0)
                {
                    map.remove(nums[left]);
                }
                left++;
            }
            maxlen=Math.max(righ-left+1,maxlen);
        }
        return maxlen;
    }
}