class Solution {
    public int singleNumber(int[] nums) {
       
         Arrays.sort(nums);
          int count=1;
          for(int right=0;right<nums.length-1;right++) {
              if(nums[right]==nums[right+1]) count++;
              else {
                  if(count > 1)
                  {
                      count=1;

                  }
                  else{
                      return nums[right];
                  }
              }
          }

          return nums[nums.length-1];
}
}