class Solution {
    public String[] findRelativeRanks(int[] score) {
       
       String[] rank = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++)
        {
            map.put(score[i],i);
        }
        Arrays.sort(score);
        int[] arr = new int[score.length];
        int index =0;
        for(int i=score.length-1;i>=0;i--)
        {
            arr[index++]= score[i];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i<3)
            {
                rank[map.get(arr[i])]=rank(i);
            }
            else
            {
                rank[map.get(arr[i])]=String.valueOf(i+1);
            }
        }
       return rank;


    }
    public static String rank(int n)
    {
        switch(n)
        {
            case 0:
                return "Gold Medal";
            case 1:
                return "Silver Medal";
            case 2:
                return "Bronze Medal";
            default:
                return "";
        }
    }
}