class Solution {
    public int[] separateDigits(int[] num) {
       StringBuilder str = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int a:num)
        {
            String s = String.valueOf(a);
            str.append(s);
            String strbuil = str.toString();
            for(int i=0;i<strbuil.length();i++)
            {
                int nums = strbuil.charAt(i)-'0';
                list.add(nums);
            }
            str.replace(0,str.length(),"");
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
         
    }
}