class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int today = 1;today<prices.length;today++){
            if(prices[today]> prices[today-1]){
                profit+=prices[today] - prices[today-1];
            }
        }
        return profit;
    }
}