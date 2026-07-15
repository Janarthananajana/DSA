class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int size  = nums.length/3;
        for(int  key:map.keySet()){
               if(map.get(key)>size){
                res.add(key);
               }
        }
        return res;

    }
}