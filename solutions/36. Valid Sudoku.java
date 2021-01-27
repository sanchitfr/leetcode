class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer> [] rows = new HashMap[9];
        HashMap<Integer, Integer> [] cols = new HashMap[9];
        HashMap<Integer, Integer> [] box = new HashMap[9];        
    
    for(int i = 0; i<9; i++){
        rows[i] = new HashMap<Integer, Integer>();
        cols[i] = new HashMap<Integer, Integer>();
        box[i] = new HashMap<Integer, Integer>();
​
    }
    
    for(int i = 0; i<9; i++){
        for(int j =0; j<9; j++){
            char c = board[i][j];
            
            if(c != '.'){
                int num = (int)c;
                int boxIndex = (i/3)*3 + j/3;
                
                rows[i].put(num, rows[i].getOrDefault(num, 0)+1);
                cols[j].put(num, cols[j].getOrDefault(num, 0)+1);
                box[boxIndex].put(num, box[boxIndex].getOrDefault(num, 0)+1);
                
                if(rows[i].get(num) > 1 || cols[j].get(num) > 1 || box[boxIndex].get(num) > 1){
                    return false;
                }
            }
        }
    }
    return true;
}
}
