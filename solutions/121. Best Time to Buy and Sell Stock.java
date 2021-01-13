class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int max = 0, buyPrice =  prices[0];
       
        for(int i = 1; i<prices.length; i++){
            if(prices[i] < buyPrice) buyPrice = prices[i];
            
            max = Math.max(max, prices[i] - buyPrice);
        }
        return max;
    }
}
