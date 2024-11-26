package com.quest.Exception.BookstoreInventoryManagement;

public class OutOfStockException extends Throwable {
    public OutOfStockException(String message) {
        super(message);
    }
}
