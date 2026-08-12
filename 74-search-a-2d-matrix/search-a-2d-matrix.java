class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int left=0;
        int right = arr.length*arr[0].length-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            int row = mid/arr[0].length;
            int col = mid%arr[0].length;
            if(arr[row][col]==target) return true;
            else if(arr[row][col]<target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}