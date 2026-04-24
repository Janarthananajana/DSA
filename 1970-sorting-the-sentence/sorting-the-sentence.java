class Solution {
    public String sortSentence(String sentence) {
         String[] arr=sentence.split(" ");
       String[] Actualarr= new String[arr.length];
       StringBuilder strbulider = new StringBuilder();
       for(String s:arr )
       {
           int length=s.length();
           char ch=s.charAt(length-1);
           int n = Integer.parseInt(String.valueOf(ch));
           Actualarr[n-1]=s.substring(0,length-1);
       }
       for(String ss:Actualarr)
       {
           strbulider.append(ss+" ");
       }
       String sub= strbulider.toString();
       return sub.substring(0,sub.length()-1);
    }
}