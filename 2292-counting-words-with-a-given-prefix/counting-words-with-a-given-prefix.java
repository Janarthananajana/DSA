class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
   for(String strr:words)
   {
       if(strr.startsWith(pref)) count++;
   }
   return count;
    }
}