class Solution {
    
//     private int fourSumCount(int[][] matrix, int n, int si, int sum){
//         if(si >= matrix.length){
//             if(sum == 0) return 1;
//             return 0;
//         }
//         int ans = 0;
//         for(int i = 0; i<n; i++){
//            ans+= fourSumCount(matrix, n, si+1, sum + matrix[si][i]);       
//         }
        
//         return ans;
//     }
    
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // int[][] matrix = {A, B, C, D};
        // if(A.length == 0) return 0;
        // return fourSumCount(matrix, A.length, 0, 0);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int a : A){
            for(int b: B){
                map.put(a+b, map.getOrDefault(a+b, 0)+1);
            }
        }
        
        for(int c: C){
            for(int d: D){
                int sum = -c-d;
                count+= map.getOrDefault(sum, 0);
            }
        }
        return count;
    }
}
