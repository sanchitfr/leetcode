class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        
        for(int i = 1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            
            int count = 0;
            
            while(count != i+1){
                if(count-1 < 0){
                    row.add(result.get(i-1).get(count));
                }
                else if(count > i-1){
                    row.add(result.get(i-1).get(count-1));
                }
                else{
                    row.add(result.get(i-1).get(count-1) + result.get(i-1).get(count));
                }
                count++;
            }
            result.add(row);
        }
        return result; 
    }
}
