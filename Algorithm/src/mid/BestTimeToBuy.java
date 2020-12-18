package mid;

/**
 * @author jie
 * @version 1.0
 * success come from self-discipline
 * @date 2020/12/17 19:15
 * 题目：买卖股票的最佳时机含手续费
 */

public class BestTimeToBuy {

    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int q = 0;
        if(prices==null){
            return 0;
        }
        for(int i = 0; i<prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > fee) {
                    q = prices[j] - prices[i] - fee + maxProfit(changeArr(prices, j + 1), fee);
                }
                if (q > profit) {
                    profit = q;
                }
            }
        }
        return profit;
    }


    public int[] changeArr(int[] prices, int i){
        if(i>=prices.length){
            return null;
        }
        int[] newArr = new int[prices.length-i];
        for(int j = 0 ;j<newArr.length;j++){
            newArr[j]=prices[j+i];
        }
        return newArr;
    }


    public static void main(String[] args) {
        BestTimeToBuy b = new BestTimeToBuy();
        int[] prices ={4,5,2,4,3,3,1,2,5,4};
        int fee =1;
        int x = b.maxProfit(prices,fee);
        System.out.println(x);
    }
}
