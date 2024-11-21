package com.quest.oops.Interviewday10;

abstract class StockAnalyzer {
    String stockName;
    String stockSymbol;
    int[] prices;

    public StockAnalyzer(String stockName, String stockSymbol, int[] prices) {
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.prices = prices;
    }
    abstract int findMaxPrice();
    abstract int findMinPrice();
    abstract double calculateAveragePrice();
    abstract int[] findLongestIncreasingTrend();
    abstract void displayAnalysis();
}
