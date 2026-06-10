package arraysTheory;

public class BestTimeToBuySellStock {
    // O(N)
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3,};

        class Solution {

            public int maxProfit(int[] prices) {
                int minSoFar = prices[0];
                int ans = 0;

                for (int i = 1; i < prices.length; i++) {
                    int profit = prices[i] - minSoFar;
                    if (profit > ans) {
                        ans = profit;
                    }
                    minSoFar = Math.min(prices[i], minSoFar);
                }
                return ans;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
        System.out.println(solution.maxProfit(prices2));
    }
}
