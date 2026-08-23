class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int[] nums = new int[arr.length+1];
        for (int a : arr) {
            nums[a]++;
        }
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==0) li.add(i);
        }
         return li;
    }
}