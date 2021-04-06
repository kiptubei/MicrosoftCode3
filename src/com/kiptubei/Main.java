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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution stock = new Solution();

        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        // int price[] = {100};
        int n = price.length;

        for (int val : price) {
            System.out.print(val + ",");
        }
        System.out.println();
        // fucntion call
        stock.stockBuySell(price, n);
    }

}
