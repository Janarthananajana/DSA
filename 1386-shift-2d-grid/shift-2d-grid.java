class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
   int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {

            int last = grid[m - 1][n - 1];
            int[][] temp = new int[m][n];

            // Shift all elements
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (j != n - 1) {
                        temp[i][j + 1] = grid[i][j];
                    } else if (i != m - 1) {
                        temp[i + 1][0] = grid[i][j];
                    }
                }
            }

            temp[0][0] = last;
            grid = temp;
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}