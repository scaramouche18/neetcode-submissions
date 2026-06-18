class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i =1; i < prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                int currentprofit = prices[i] - buy;
                
                if(currentprofit > profit){
                    profit = currentprofit;
                }
            }
        }
        return profit;
        
    }
}
