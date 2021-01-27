class Solution {
    
//     private int numSquares(int n, int sum, int count){
//         if(sum > n){
//             return Integer.MAX_VALUE;
//         }
//         if(sum == n) return count;
//         int ans = Integer.MAX_VALUE;
//         for(int i = 1; i*i <= n; i++){
//             int smallAns = numSquares(n, sum+(i*i), count+1);
//             //System.out.println(smallAns+ " "+ i);
//             if(smallAns < ans) ans = smallAns;
//         }
//         // System.out.println(sum);
//         return ans;
//     }
    
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}
