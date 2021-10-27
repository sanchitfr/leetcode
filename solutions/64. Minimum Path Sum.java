class Solution {
    
    private static int helper(int[][] grid, int m, int n, int i, int j, int[][] storage){
        if(i == m-1 && j == n-1){
            return grid[m-1][n-1];
        }
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }
        
        if(storage[i][j]  != 0) return storage[i][j];
        
        int ans = grid[i][j];
        int op1 = helper(grid, m, n, i+1, j, storage);
        int op2 = helper(grid, m, n, i, j+1, storage);
        return storage[i][j] = ans+Math.min(op1, op2);
    }
    
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] storage = new int[m][n];
        return helper(grid, m,n,0,0, storage);
    }
}
