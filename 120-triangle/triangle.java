class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int[][] arr = new int[list.size()+1][list.size()+1];
        for(int i=list.size()-1;i>=0;i--)
        {
            for(int j=0;j<list.get(i).size();j++)
            {
                arr[i][j]=list.get(i).get(j)+Math.min(arr[i+1][j],arr[i+1][j+1]);
            }
        }
        return arr[0][0];
    }
}