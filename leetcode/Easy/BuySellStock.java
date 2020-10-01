/**
 * Best time to buy and sell stock.
 * Find the highest profit by subtracting
 * Store the highest value in a variable
 * Complexity is O(n^2) due to for loop in a for loop
 * Space O(1) due to only two variables being stored.
 */
public class BuySellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println("If index i is: " + i + " & Value of i: " + prices[i]);
            for (int j = i; j < prices.length; j++) {
                if (i != j) {
                    System.out.println("If index j is: " + j + " & Value of j: " + prices[j]);
                    int profit = prices[j] - prices[i];
                    System.out.println("The Profit will be: " + profit);
                    // The highest profit will be stored in the maxProfit variable
                    if (profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            } System.out.println("\n");

        } return maxProfit;
    }


    public static void main(String[] args) {
        int[] dailyStock = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(dailyStock));
    }
}
