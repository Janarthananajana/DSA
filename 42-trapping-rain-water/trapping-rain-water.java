class Solution {
    public int trap(int[] height) {
        int leftmax = height[0];
         Stack<Integer> st = new Stack<>();


         st.push(height[height.length-1]);
         for(int i=height.length-2;i>=2;i--)
         {
             st.push(Math.max(st.peek(),height[i]));
         }

         int totalWater =0;
         for(int i=1;i< height.length-1;i++)
         {
             int min = Math.min(leftmax,st.peek());
             int temp = min - height[i];
             totalWater+=Math.max(0,temp);
             st.pop();
             leftmax= Math.max(leftmax,height[i]);
         }
         return totalWater;
    }
}