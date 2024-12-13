package com.quest.UseCases.ProductInventoryManagement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 1000.0, 50),
                new Product(2, "Monitor", 300.0, 100),
                new Product(3, "Keyboard", 70.0, 500),
                new Product(4, "Mouse", 50.0, 1000)
        );

        // Compute the total value of inventory (price × quantity of all products) using Stream
        double totalInventoryValue = products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
        System.out.println("Total inventory value: " + totalInventoryValue);

        // Find the top 3 most expensive products
        List<Product> top3MostExpensiveProducts = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 most expensive products: " + top3MostExpensiveProducts.stream().map(Product::getName).collect(Collectors.toList()));

        // Collect all products into a Map where the key is the product name and the value is its price
        Map<String, Double> productMap = products.stream()
                .collect(Collectors.toMap(Product::getName, Product::getPrice));
        System.out.println("Product map: " + productMap);
    }
}