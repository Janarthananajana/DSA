class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partition = new ArrayList<>();
        for(int i=0;i<s.length(); )
        {
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(i));
            for(int j=startIndex;j<=endIndex-1;j++)
            {
                if( s.lastIndexOf(s.charAt(j))>endIndex)
                {
                    endIndex = s.lastIndexOf(s.charAt(j));
                }
            }
            partition.add(endIndex-startIndex+1);
            i=endIndex+1;
        }
        return partition;
    }
}