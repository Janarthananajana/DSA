class Solution {
    public String reversePrefix(String s, int k) {
      char[] arr = s.toCharArray();
      reverseLetter(arr,k);
      StringBuilder str = new StringBuilder();
      for(char ch : arr)
      {
         str.append(ch);
      }
      return str.toString(); 
    }
   public static void reverseLetter(char[] arr, int k)
    {
        int i=0;
        int j=k-1;
        while(i<=j)
        {
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}