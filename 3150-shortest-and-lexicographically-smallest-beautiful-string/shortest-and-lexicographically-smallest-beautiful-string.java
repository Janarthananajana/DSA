class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

     int[] arr = new int[2];
        int left =0;
        int right =0;
        int min = Integer.MAX_VALUE;
        String answer = "";
        while(right<s.length())
        {

            if(s.charAt(right)-'0'==1)
            {
                arr[1]++;
            }
            while(arr[1]>k)
            {
                if(s.charAt(left)-'0'==1) arr[1]--;
                left++;
            }

            while(arr[1]==k && s.charAt(left)=='0') {
               left++;

            }
            if(arr[1]==k)
            {
                int len = right - left + 1;
                String current = s.substring(left, right + 1);

                if (len < min) {
                    min = len;
                    answer = current;
                }
                else if (len == min && current.compareTo(answer) < 0) {
                    answer = current;
                }
            }

            right++;
        }
         return answer;
 
    }
}