class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      int left=0;
     
     List<Integer> list = new ArrayList<>();
      
      for(int i=p.length();i<=s.length();i++)
      {
            if(isAnagram(s.substring(left,i),p))
            {
                list.add(left);
            }
            left++;
      }
      return list;
    }
    public static boolean isAnagram(String s,String p)
    {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            arr[p.charAt(i)-'a']--;
        }
        for(int a:arr)
        {
            if(a<0 || a> 0) return false;
        }
        return true;
    }
}