package com.quest.Examples.Map;

import java.util.HashMap;
import java.util.Map;

public class ProductPrice {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Laptop", 1200.99);
        map.put("Smartphone", 799.49);
        map.put("Headphones", 150.99);
        map.put("Tablet", 450.89);
        System.out.println("Product List:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        //update
        String producttoupdate = "Smartphone";
        double newPrice = 850.00;
        if (map.containsKey(producttoupdate)) {
            map.put(producttoupdate, newPrice);
        } else {
            System.out.println("Product not found: " + producttoupdate);
        }
        System.out.println("\nUpdated Product List:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        //highest price
        String highestPriceProduct = null;
        double highestPrice = 0.0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > highestPrice) {
                highestPrice = entry.getValue();
                highestPriceProduct = entry.getKey();
            }
        }
        if (highestPriceProduct != null) {
            System.out.println("\nProduct with the highest price: " + highestPriceProduct + " -> $" + highestPrice);
        } else {
            System.out.println("No products available.");
        }
    }
}
