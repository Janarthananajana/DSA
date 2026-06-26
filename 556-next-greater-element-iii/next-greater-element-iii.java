class Solution {
    public int nextGreaterElement(int num) {
         
           String s = Integer.toString(num);
           char[] ch  = s.toCharArray();
           int i=ch.length-2;
           while(i>=0 && ch[i]>=ch[i+1])
           {
               i--;
           }
           if(i==-1)
           {
               return -1;
           }
        
               int j = ch.length - 1;
               while (j > i && ch[j] <= ch[i]) {
                   j--;
               }
               swap(ch, i, j);
               reverse(ch, i + 1);
               long value = 0;

for (char c : ch) {
    value = value * 10 + (c - '0');
}

if (value > Integer.MAX_VALUE) {
   return -1;
} 
return (int)value;
              
           

    }
     static void swap(char[] ch , int i,int j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
        static void reverse(char[] ch,int start)
        {
            int end=ch.length-1;
            while(start<end)
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                end--;
                start++;
            }
        }
}