class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] copy = new int[m][n];
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j <n; j++){
                copy[i][j] = board[i][j];
            }
        }
        
        int[][] directions = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                
                int liveNeighbours = 0;
                
                for(int k = 0; k<directions.length; k++){
                    int x = i+directions[k][0];
                    int y = j+directions[k][1];
                    
                    if(x >=0 && y >=0 && x<m && y<n){
                        if(copy[x][y] == 1)liveNeighbours++;
                    }
                }
                
                if(copy[i][j] == 1){
                    if(liveNeighbours <2 || liveNeighbours > 3){
                        board[i][j] = 0;
                    }
                }
                else{
                    if(liveNeighbours == 3) board[i][j] = 1;
                }
            }
        }
        
    }
}
