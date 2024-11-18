package com.quest.oops.Interviewday10;

public class CommodityStockAnalyzer extends StockAnalyzer {
    String commodityType;

    public CommodityStockAnalyzer(String stockName, String stockSymbol, int[] prices, String commodityType) {
        super(stockName, stockSymbol, prices);
        this.commodityType = commodityType;
    }

    @Override
    int findMaxPrice() {
        int max = prices[0];
        for (int price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    @Override
    int findMinPrice() {
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    @Override
    double calculateAveragePrice() {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return (double) sum / prices.length;
    }

    @Override
    String findLongestIncreasingTrend() {
        int start = 1, maxLength = 1, length = 1, end = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                length++;
            } else {
                if (length > maxLength) {
                    maxLength = length;
                    start = i - length;
                    end = i - 1;
                }
                length = 1;
            }
        }
        return "Start Day " + start  + ", End Day " + end + ", Length: " + maxLength + " days";
    }
@Override
void displayAnalysis() {
    System.out.println("Analysis for Commodity Stock:");
    System.out.println("Stock Name: " + stockName);
    System.out.println("Stock Symbol: " + stockSymbol);
    System.out.println("Commodity Type: " + commodityType);
    System.out.println("Highest Price: " + findMaxPrice());
    System.out.println("Lowest Price: " + findMinPrice());
    System.out.println("Average Price: " + calculateAveragePrice());
    System.out.println("Longest Increasing Trend: " + findLongestIncreasingTrend());
}
}
