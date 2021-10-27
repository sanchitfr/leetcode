class Solution {
    
    private int uniquePaths(int m, int n, int i, int j, int[][] storage){
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i >= m || j >= n) return 0;
        
        if(storage[i][j] != -1) return storage[i][j];
        
        int op1 = uniquePaths(m,n,i+1, j, storage);
        int op2 = uniquePaths(m,n,i, j+1, storage);
        
        return storage[i][j] = op1+op2;
    }
    
    public int uniquePaths(int m, int n) {
        int [][] storage = new int[m][n];
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                storage[i][j] = -1;
            }
        }
        
        return uniquePaths(m,n,0,0, storage);
    }
}
