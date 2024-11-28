package com.quest.Lambda.BookstoreInventoryManagement;

public class OutOfStockException extends Throwable {
    public OutOfStockException(String message) {
        super(message);
    }
}
