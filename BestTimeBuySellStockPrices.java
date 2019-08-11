package Programs;
public class BestTimeBuySellStockPrices {

	public static int maxProfit(int prices[]) {
		int maxProfit = 0;
		int min = Integer.MAX_VALUE;
		for (int price : prices) {
			if (price < min) {
				min = price;
			} else {
				maxProfit = Math.max(price - min, maxProfit);
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int prices[] = { 1, 3, 2, 5, 6 };
		System.out.println(maxProfit(prices));
	}
}