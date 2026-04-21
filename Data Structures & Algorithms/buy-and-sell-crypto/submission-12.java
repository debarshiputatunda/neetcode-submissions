class Solution {
    public int maxProfit(int[] prices) {
        int sell = 1, profit = 0, buy_min = 0;

        while (sell < prices.length){
            if (prices[buy_min] < prices[sell]){ 
                profit = Math.max(prices[sell] - prices[buy_min], profit);
            }else {
                buy_min = sell;
            }
            sell ++;
        }
        return profit;
    }
}
