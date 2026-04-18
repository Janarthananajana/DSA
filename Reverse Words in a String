class Solution {
    public String reverseWords(String name) {
         String[] strarr=name.split(" ");
       ArrayList<String> strlist= new ArrayList<>();


       for(String n:strarr)
       {
           if(n.equals("")) continue;
           else strlist.add(n);
       }
       String[] strar= new String[strlist.size()];
       for(int k=0;k<strlist.size();k++)
       {
           strar[k]=strlist.get(k);
       }
        int i=0;
        int j=strar.length-1;
       while(i<j)
       {
           String temp=strar[i];
           strar[i]=strar[j];
           strar[j]=temp;
           i++;
           j--;
       }
       StringBuilder str=new StringBuilder();
       int lastindex = strar.length-1;
       for(int h=0;h<strar.length;h++)
       {
           if(h==lastindex)
           {
               str.append(strar[h]);
           }
           else {
               str.append(strar[h] + " ");
           }
       }
       return str.toString();
    }
}
