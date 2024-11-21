package com.quest.oops.Interviewday10;

import java.util.Scanner;

public class StockAnalysis {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        // Input for Equity Stock
        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String equityname = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String equitysymbol = sc.nextLine();
        System.out.print("Sector: ");
        String sector = sc.nextLine();
        System.out.print("Number of days: ");
        int number_of_days = sc.nextInt();
        int[] equityprices = new int[number_of_days];
        System.out.println("Enter prices: ");
        for (int i = 0; i < number_of_days; i++) {
            equityprices[i] = sc.nextInt();
        }
        sc.nextLine();
        EquityStockAnalyzer equityStock = new EquityStockAnalyzer(equityname, equitysymbol, equityprices, sector);

        // Input for Commodity Stock
        System.out.println("Enter details for Commodity Stock:");
        System.out.print("Stock Name: ");
        String commodityname = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditysymbol = sc.nextLine();
        System.out.print("Commodity Type: ");
        String commoditytype = sc.nextLine();
        System.out.print("Number of days: ");
        int Number_of_days = sc.nextInt();
        int[] commodityprices = new int[Number_of_days];
        System.out.println("Enter prices: ");
        for (int i = 0; i < Number_of_days; i++) {
            commodityprices[i] = sc.nextInt();
        }
        CommodityStockAnalyzer commodityStock = new CommodityStockAnalyzer(commodityname, commoditysymbol, commodityprices, commoditytype);

        // display
        System.out.println();
        equityStock.displayAnalysis();
        System.out.println();
        commodityStock.displayAnalysis();

        // Comparison
        System.out.println("Comparison Results:");
        if (equityStock.calculateAveragePrice() > commodityStock.calculateAveragePrice()) {
            System.out.println("Stock with Highest Average Price: Equity Stock - " + equityname + " with Average Price: " + equityStock.calculateAveragePrice());
        } else {
            System.out.println("Stock with Highest Average Price: Commodity Stock - " + commodityname + " with Average Price: " + commodityStock.calculateAveragePrice());
        }

        int[] equityTrend = equityStock.findLongestIncreasingTrend();
        int[] commodityTrend = commodityStock.findLongestIncreasingTrend();
        if (equityTrend[2] > commodityTrend[2]) {
            System.out.println("\nStock with longest increasing trend is equity trend\n" + "name= " + equityname + " with " + equityTrend[2] + " days");
        } else if (equityTrend[2] < commodityTrend[2]) {
            System.out.println("\nStock with longest increasing trend is commodity trend\n" + "name= " + commodityStock.stockName + " with " + commodityTrend[2] + " days");
        } else {
            System.out.println("\nBoth have same trend length");
            sc.close();
        }
    }
}