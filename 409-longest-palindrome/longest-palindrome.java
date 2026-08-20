class Solution {
    public int longestPalindrome(String a) {
        
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : a.toCharArray())
       {
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
        System.out.println(map);
       int count =0;
       int count1 =0;
       for(char key:map.keySet())
       {
           if(map.get(key)%2==0) count+=map.get(key);
           if(map.get(key)%2==1)
           {
               count += map.get(key)-1;
               if(count1==0)
               {
                   count1=1;
               }
           }

       }
        return count+count1;
    }
}