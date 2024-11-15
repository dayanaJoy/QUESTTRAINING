package com.quest.practice_vars;

public class InventorySystem {

    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[] stock = {0, 50, 200, 75, 150};
        double[] prices = {200, 150, 50, 300, 100};
        int[] quantitiesSold = {20, 10, 60, 10, 30};
        // Task 1: Generate Sales Report
        generateSalesReport(products, stock, prices, quantitiesSold);
        // Task 2: Inventory Shortage Check
        checkInventoryShortages(products, stock, quantitiesSold);
        // Task 3: Restock Inventory
        restockInventory("Product B", 20, products, stock);
        // Task 4: Sales Summary Based on Price Range
        generateSalesSummary(100, 300, products, prices, stock, quantitiesSold);
        // Task 5: Track Out-of-Stock Products
        trackOutOfStockProducts(products, stock);
    }

    // Task 1: Generate Sales Report
    public static void generateSalesReport(String[] products, int[] stock, double[] prices, int[] quantitiesSold) {
        System.out.println("Task 1: Sales Report:");
        double totalRevenue = 0.0;
        for (int i = 0; i < products.length; i++) {
            int soldQuantity = Math.min(quantitiesSold[i], stock[i]);
            double revenue = soldQuantity * prices[i];
            totalRevenue += revenue;
            System.out.println(products[i] + " sold " + soldQuantity + " units, Revenue: $" + revenue);
        }
        System.out.println("\nTotal revenue: " + totalRevenue + "\n");
    }

    // Task 2: Inventory Shortage Check
    public static void checkInventoryShortages(String[] products, int[] stock, int[] quantitiesSold) {
        System.out.println("Task 2: Inventory Shortage Check:");
        for (int i = 0; i < products.length; i++) {
            if (quantitiesSold[i] > stock[i]) {
                System.out.println("Warning: Insufficient stock for " + products[i] +
                        ". Sold " + quantitiesSold[i] + " units, but only " + stock[i] + " units were available.");
            }
        }
        System.out.println();
    }

    // Task 3: Restock Inventory
    public static void restockInventory(String product, int restockAmount, String[] products, int[] stock) {
        System.out.println("Task 3: Restock Inventory:");
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(product)) {
                stock[i] += restockAmount;
                System.out.println("Restocking " + product + " with " + restockAmount + " units.");
                System.out.println("Updated stock for " + product + ": " + stock[i] + " units.\n");
                return;
            }
        }
        System.out.println("Product " + product + " not found in inventory.\n");
    }

    // Task 4: Generate Sales Summary Based on Price Range
    public static void generateSalesSummary(double minPrice, double maxPrice, String[] products, double[] prices, int[] stock, int[] quantitiesSold) {
        System.out.println("Task 4: Sales Summary Based on Price Range:");
        System.out.println("Products in the price range $" + minPrice + " to $" + maxPrice + ":");
        for (int i = 0; i < products.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                int soldQuantity = Math.min(quantitiesSold[i], stock[i]);
                double revenue = soldQuantity * prices[i];
                System.out.println(products[i] + ": Revenue = " + revenue);
            }
        }
        System.out.println();
    }

    public static void trackOutOfStockProducts(String[] products, int[] stock) {
        System.out.println("Task 5: Out-of-Stock Products:");
        System.out.println("Products out of stock:");
        for (int i = 0; i < products.length; i++) {
            if (stock[i] == 0) {
                System.out.println(products[i]);
            }
        }
        System.out.println();
    }
}

