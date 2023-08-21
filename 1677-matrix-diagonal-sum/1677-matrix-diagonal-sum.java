class Solution {
    public int diagonalSum(int[][] mat) {
        int count = 0;
        int n = mat.length;
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         if(i==j) count += mat[i][j];
        //         else if(i+j == n-1) count += mat[i][j];
        //     }
        // }

        int i = 0, j = n-1, k=0;

        while(i < n) {
            if(k != j) count += mat[i][k] + mat[i][j];
            else count += mat[i][j];
            i++;
            j--;
            k++;
        }
        return count;
    }
}