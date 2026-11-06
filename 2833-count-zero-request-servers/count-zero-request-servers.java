class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a,b) -> a[1]-b[1]);
        Integer[] order = new Integer[queries.length];
        for(int i=0;i<queries.length;i++) order[i]=i;
        Arrays.sort(order, (a,b)-> queries[a]-queries[b]);
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[queries.length];
        int left = 0;
        int right = 0;
        for(int i:order)
        {
            int query = queries[i];
            while(right < logs.length && logs[right][1]<=query)
            {
                int server = logs[right][0];
                map.put(server, map.getOrDefault(server,0)+1);
                right++;
            }
            while(left < right && logs[left][1]<query-x)
            {
                int server = logs[left][0];
                if(map.get(server)==1) map.remove(server);
                else map.put(server, map.getOrDefault(server,0)-1);
                left++;
            }
            ans[i]=n-map.size();

        }
        return ans;
    }
}