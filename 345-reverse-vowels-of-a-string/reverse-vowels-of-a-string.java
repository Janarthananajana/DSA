class Solution {
    public String reverseVowels(String s) {
       char[] ch = s.toCharArray();

        ArrayList<Integer> list = new ArrayList<>();
        int left =0;

        for(int i=0;i<ch.length;i++)
        {
            if(isVowel(ch[i])) list.add(i);
        }
        int right = list.size()-1;
        while(left < right)
        {
            int i = list.get(left);
            int j = list.get(right);

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            left++;
            right--;
        }
        StringBuilder str = new StringBuilder();
        for(char c:ch)
        {
            str.append(c);
        }
        return str.toString();

    }
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {return true;}
        return false;
    }

}