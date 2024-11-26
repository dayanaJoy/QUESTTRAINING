package com.quest.Exception.BookstoreInventoryManagement;

import java.util.Arrays;

public class Main {
    public static final double DISCOUNT_PERCENTAGE = 10.0;

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Book 1", "Author 1", 100, 10);
        books[1] = new Book("Book 2", "Author 2", 200, 8);
        books[2] = new SpecialEditionBook("Book 3", "Author 3", 300, 3, " Special Edition 1");
        books[3] = new Book("Book 4", "Author 4", 400, 2);
        books[4] = new SpecialEditionBook("Book 5", "Author 5", 500, 10, " Special Edition 2");

        System.out.println("Books : ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        System.out.println("\npurchase : ");
        try {
            for(Book book : books) {
            books[0].Check(3);
            books[1].Check(2);
            books[2].Check(6);
            books[3].Check(3);
            books[4].Check(5);}
        } catch (OutOfStockException e) {
            System.out.println("OutOfStockException : " + e.getMessage());
        }

        System.out.println("\nAfter Purchase : ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        double price = 200.00;
        System.out.println("\nBooks priced above " + price + " :");
        Bookfilter Filterprice = book -> book.getPrice() > price;

        System.out.println("Books priced above " + price + ":");
        Bookfilter filter = book -> book.getPrice() > price;
        Arrays.stream(books)
                .filter(filter::filter)
                .forEach(book -> System.out.println(book.getTitle()));
        }
    }










//        for (int i = 0; i < books.length; i++) {
//            if (books[i].getPrice() > price) {
//                System.out.println(books[i].getTitle());
//            }

