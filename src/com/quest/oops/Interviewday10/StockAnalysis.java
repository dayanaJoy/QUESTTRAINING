package com.quest.oops.Interviewday10;
import java.util.Scanner;
public class StockAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Equity Stock
        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String eqName = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String eqSymbol = sc.nextLine();
        System.out.print("Sector: ");
        String sector = sc.nextLine();
        System.out.print("Number of days: ");
        int n = sc.nextInt();
        int[] eqPrices = new int[n];
        System.out.println("Enter prices: ");
        for (int i = 0; i < n; i++) {
            eqPrices[i] = sc.nextInt();
        }
        sc.nextLine();
        EquityStockAnalyzer equityStock = new EquityStockAnalyzer(eqName, eqSymbol, eqPrices, sector);

        // Input for Commodity Stock
        System.out.println("Enter details for Commodity Stock:");
        System.out.print("Stock Name: ");
        String comName = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String comSymbol = sc.nextLine();
        System.out.print("Commodity Type: ");
        String commodityType = sc.nextLine();
        System.out.print("Number of days: ");
        int m = sc.nextInt();
        int[] comPrices = new int[m];
        System.out.println("Enter prices: ");
        for (int i = 0; i < m; i++) {
            comPrices[i] = sc.nextInt();
        }
        CommodityStockAnalyzer commodityStock = new CommodityStockAnalyzer(comName, comSymbol, comPrices, commodityType);

        // Perform analysis
        System.out.println();
        equityStock.displayAnalysis();
        System.out.println();
        commodityStock.displayAnalysis();

        // Comparison
        System.out.println("\nComparison Results:");
        if (equityStock.calculateAveragePrice() > commodityStock.calculateAveragePrice()) {
            System.out.println("Stock with Highest Average Price: Equity Stock - " + eqName +
                    " with Average Price: " + equityStock.calculateAveragePrice());
        } else {
            System.out.println("Stock with Highest Average Price: Commodity Stock - " + comName +
                    " with Average Price: " + commodityStock.calculateAveragePrice());
        }

        int eqTrend = Integer.parseInt(equityStock.findLongestIncreasingTrend());
        int comTrend = Integer.parseInt(commodityStock.findLongestIncreasingTrend());
        if (eqTrend > comTrend) {
            System.out.println("Stock with Longest Increasing Trend: Equity Stock - " + eqName +
                    " with a trend length of " + eqTrend + " days.");
        } else if (comTrend > eqTrend) {
            System.out.println("Stock with Longest Increasing Trend: Commodity Stock - " + comName +
                    " with a trend length of " + comTrend + " days.");
        } else {
            System.out.println("Both " + eqName + " and " + comName +
                    " have the same longest increasing trend length of " + eqTrend + " days.");
        }
        sc.close();
}
}


