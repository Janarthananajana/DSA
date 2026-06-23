class Solution {
    public int[] numberOfPairs(int[] arr) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int pair=0;
        for(int key : map.keySet())
        {
            if(map.get(key) > 1) {
                pair += map.get(key) / 2;
            }
            map.put(key, map.get(key)%2);
        }
        int leftOver = 0;
        for(int key:map.keySet())
        {
            if(map.get(key)>0)
            {
                leftOver+=map.get((key));
            }
        }
        int[] arr1 = new int[2];
        arr1[0]=pair;
        arr1[1]=leftOver;
       return arr1;
    }
}