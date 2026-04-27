class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         HashSet<Character> set = new HashSet<>();

        // store all jewel types
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        // check each stone
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        return count;
    }
}