class Solution {
    
    private static int helper(int[][] obstacles, int m, int n,  int i, int j, int[][] storage){
        if(i == m-1 && j == n-1) return 1;
        
        if(i >= m && j >= n) return 0;
        
        if(storage[i][j] != -1) return storage[i][j];
        
        int op1 = 0, op2 = 0;
        if(obstacles[i][j] == 1) return storage[i][j] = 0;
        if(i+1 < m && j < n && obstacles[i+1][j] != 1){
            op1 = helper(obstacles, m , n, i+1, j, storage);
        }
        if(i < m && j+1 < n && obstacles[i][j+1] != 1){
            op2 = helper(obstacles,m , n, i, j+1, storage);
        }
        return storage[i][j] = op1+op2;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if(m == 1 && n == 1){
            if(obstacleGrid[0][0] == 1) return 0;
            return 1;
        }
        int[][] storage = new int[m][n];
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j <n; j++){
                storage[i][j] = -1;
            }
        }
        
        return helper(obstacleGrid, m, n, 0,0, storage);
    }
}
