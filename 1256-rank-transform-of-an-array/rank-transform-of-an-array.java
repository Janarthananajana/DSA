class Solution {
    public int[] arrayRankTransform(int[] dummy) {
        int[] arr = new int[dummy.length];
        int index=0;
        for(int a:dummy)
        {
            arr[index++]=a;
        }
        Arrays.sort(dummy);


        HashSet<Integer> set = new HashSet<>();
        for(int a:dummy)
        {
            set.add(a);
        }
        HashMap<Integer,Integer> map = new HashMap<>();

        if(set.size()==1)
        {
            Arrays.fill(arr,1);
        }

        else
        {
            int rankend = set.size();
            for(int i=dummy.length-1;i>=0;i--)
            {
                if(!map.containsKey(dummy[i]))
                {
                    map.put(dummy[i],rankend--);
                }
            }
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=map.get(arr[i]);
            }
        }
        return arr;
    }
}