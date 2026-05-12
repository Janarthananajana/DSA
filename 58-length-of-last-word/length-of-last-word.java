class Solution {
    public int lengthOfLastWord(String name) {
        int lenght=0;
      int i=name.length()-1;
      while(i>=0 && name.charAt(i)== ' ')
      {
          i--;
      }
      while(i>=0 && name.charAt(i) !=' ')
      {
          lenght++;
          i--;
      }
        return lenght;
    }
}