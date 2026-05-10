class Solution {
    public int firstUniqChar(String name) {
      int[] alphabet= new int[26];
       for(char ch:name.toCharArray())
       {
           alphabet[ch - 'a']++;
       }
       for(char ch:name.toCharArray())
       {
           int num=(ch-'a');
           if(alphabet[num]==1)
           {
               char cha=(char)(num +'a');
               return name.indexOf(cha);
           }
       }
       return -1;
    }
}