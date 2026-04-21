class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1, profit = 0, buy_min = 0;

        while (sell < prices.length){
            profit = Math.max(prices[sell] - prices[buy_min], profit);
            if (prices[sell] < prices[buy_min]) buy_min = sell;
            sell ++;
        }
        return profit;
    }
}
