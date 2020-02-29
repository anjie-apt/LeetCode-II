package SwordRefers2Offer;

/**
 * 假设某只股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 例如，一只股票在某些时间节点的价格为[9, 11, 8, 5, 7, 12, 16, 14]
 * 如果我们能在价格为5的时候买入并在价格为16的时候卖出，则能获得最大利润为11
 */
public class MaxProfit {
    public int buy(int[] stocks) {
        /**
         * 1.判空
         * 2.初始化最低价格和最大利润
         * 3.从i=2开始遍历，如果前一个值比最低价格低，更新为最低价格
         * 4.计算当前的利润=当前价格-最低价格
         * 5.更新最大利润
         */
        if (stocks.length == 0) return 0;

        int min_price = stocks[0];
        int max_profit = stocks[1] - stocks[0];

        for (int i = 2; i < stocks.length; i++) {
            if (stocks[i-1] < min_price) {
                min_price = stocks[i-1];
            }

            int cur_profit = stocks[i] - min_price;

            max_profit = Math.max(cur_profit, max_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] stocks = new int[]{9, 11, 8, 5, 7, 12, 16, 14};
        int res = new MaxProfit().buy(stocks);
        System.out.println(res);
    }
}
