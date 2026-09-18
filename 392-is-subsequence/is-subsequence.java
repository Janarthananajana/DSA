class Solution {
    public boolean isSubsequence(String s, String t) {
  
        int previousIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int currentIndex = t.indexOf(ch, previousIndex + 1);

            if (currentIndex == -1) {
                return false;
            }

            if (currentIndex <= previousIndex) {
                return false;
            }

            previousIndex = currentIndex;
        }

        return true;
    }
}
 