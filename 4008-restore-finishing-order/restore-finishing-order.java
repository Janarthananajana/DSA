class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
      HashSet<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }

        List<Integer> result = new ArrayList<>();

        for (int x : order) {
            if (set.contains(x)) {
                result.add(x);
            }
        }

        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;  
    }
}