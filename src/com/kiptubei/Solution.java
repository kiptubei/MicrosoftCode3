/**
 *  The cost of a stock on each day is given in an array, find the max profit that you can make by buying *  and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the *  maximum profit can earned by buying on day 0, selling on day 3.
 *  Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order,
 * then profit cannot be earned at all.
 */
package com.kiptubei;

/**
 *
 * @author kiptubei
 */
import java.util.ArrayList;

class Interval {

    int buy, sell;
}

public class Solution {

    void stockBuySell(int price[], int n) {
        // Prices must be given for at least two days
        if (n == 1) {
            return;
        }

        int count = 0;

        // solution array
        ArrayList<Interval> sol = new ArrayList<>();

        // Traverse through given price array
        int i = 0;

        while (i < n - 1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (price[i + 1] <= price[i])) {
                i++;
            }

            // If we reached the end, break as no further solution possible
            if (i == n - 1) {
                break;
            }

            Interval e = new Interval();
            System.out.println("e.buy == i++  where i =" + i);
            e.buy = i++;

            System.out.println("e.buy =" + e.buy);
            // Store the index of minima

            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i - 1])) {
                i++;
            }

            // Store the index of maxima
            e.sell = i - 1;
            sol.add(e);

            // Increment number of buy/sell
            count++;
        }

        // print solution
        if (count == 0) {
            System.out.println("There is no day when buying the stock "
                    + "will make profit");
        } else {
            int totalProfit = 0;
            for (int j = 0; j < count; j++) {
                int profit = 0;

                profit = sol.get(j).sell - sol.get(j).buy;
                System.out.println("Buy on day: " + sol.get(j).buy
                        + "        "
                        + "Sell on day : " + sol.get(j).sell + " : profit  = " + profit);

                totalProfit += profit;
            }

            System.out.println("Total Profit possible for the period = " + totalProfit);
        }

        return;
    }

}
