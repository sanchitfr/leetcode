class Solution {
    public int climbStairs(int n) {
//         if(n == 0){
//             return 1;
//         }
        
//         if(n < 0){
//             return 0;
//         }
        
//         int op1 = climbStairs(n-1);
//         int op2 = climbStairs(n-2);
        
//         return op1+op2;
        
        int[] storage = new int[n+1];
        storage[0] = 1;
        storage[1] = 1;
        for(int i = 2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
}
