class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
		int h=numRows;
		for(int i=0;i<h;i++)
		
		{
		    List<Integer> n = new ArrayList<>();
		    for(int j=0;j<=i;j++)
		    {
		        if(j==0 || j == i)
		        {
		            n.add(1);
		        }
		        else{
		        List<Integer> prev = li.get(i-1);
		        n.add(prev.get(j)+prev.get(j-1));
		        }
		    }
		    li.add(n);
		}
		return li;
    }
}