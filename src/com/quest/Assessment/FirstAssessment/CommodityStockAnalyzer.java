package com.quest.Assessment.FirstAssessment;

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
    public int[] findLongestIncreasingTrend() {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int currentStart = 0;
        int length = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                length++;
                if (length > maxLength) {
                    maxLength = length;
                    start = currentStart;
                    end = i;
                }
            } else {
                length = 1;
                currentStart = i;
            }
        }
        return new int[]{start, end, maxLength};
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
    int[] trend = findLongestIncreasingTrend();
    System.out.println("Longest Increasing Trend: Start Day " + (trend[0] + 1) + ", End Day " + (trend[1] + 1) + ", Length: " + trend[2] + " days");
}
}

