class Solution {
    public String customSortString(String order, String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of s
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Follow order string
        for(char c : order.toCharArray()) {
            if(map.containsKey(c)) {
                int freq = map.get(c);
                while(freq-- > 0) {
                    result.append(c);
                }
                map.remove(c); // remove after use
            }
        }

        // Step 3: Add remaining characters
        for(char c : map.keySet()) {
            int freq = map.get(c);
            while(freq-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
    }
}