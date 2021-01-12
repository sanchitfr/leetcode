class Solution {
    
    private int maxProfit(int[] prices, int prev, int curr){
        if(curr == prices.length){
            return 0;
        }
        
        int op1 = 0, op2 = 0;
        
        if(prices[prev] < prices[curr]){
            op1 = prices[curr] - prices[prev] + maxProfit(prices, prev+1, curr+1);
        }
        else{
            op2 = maxProfit(prices, prev+1, curr+1);    
        }
        
        return Math.max(op1, op2);
        
    }
    
    public int maxProfit(int[] prices) {        
       return maxProfit(prices, 0, 1);
    }
}
