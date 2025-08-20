class Solution {
    public int maxProfit(int[] prices) {

        //122 // Best Time to Buy and Sell Stock II
        // Approach: Bruteforce (greedy)
        // my brute force solution was to find the minimum price and then the maximum price after that, but this is not optimal.
        // Instead, we can iterate through the prices and keep track of the minimum price seen so far.
        // Whenever we find a price that is higher than the minimum price, we can calculate the profit we would make by selling at that price.
        // We then reset the minimum price to the current price, as we can consider this as a new buying point.
        // This way, we can accumulate the total profit by selling at every point where the price increases.
        // Time Complexity: O(n)
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        int totalprofits = 0;
        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }
            else{
                maxprofit = ((price - minprice) > 0) ? price - minprice : 0;
                totalprofits += maxprofit;
                maxprofit = 0;
                minprice = price;
            }
        }
        return totalprofits;

        //=========
        // Approach: Greedy
        // Same logic as above, but we can simplify it further.
        // We can just add the profit whenever the price increases.
        // Time Complexity: O(n)
        int totalprofits = 0;
        for(int i=1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                totalprofits += prices[i] - prices[i-1];
            }
        }
        return totalprofits;
        //greedy algorithm explanation in general:
        // The greedy algorithm is a problem-solving approach that builds up a solution piece by piece,
        // always choosing the next piece that offers the most immediate benefit.
        // It does not always yield the optimal solution for all problems, but it works well for problems like this one,
        // where local optimal choices lead to a global optimal solution.
        // Time Complexity: O(n)
        // Space Complexity: O(1)

    }
}