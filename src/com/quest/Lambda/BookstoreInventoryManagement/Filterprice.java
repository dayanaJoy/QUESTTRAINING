package com.quest.Lambda.BookstoreInventoryManagement;

public class Filterprice implements Bookfilter {
    private double price;
    public Filterprice(double price) {
        this.price = price;
    }
    @Override
    public boolean filter(Book book) {
        return  book.getPrice() > price;
    }
}
