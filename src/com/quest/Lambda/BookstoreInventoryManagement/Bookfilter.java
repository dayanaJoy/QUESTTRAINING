package com.quest.Lambda.BookstoreInventoryManagement;

@FunctionalInterface
public interface Bookfilter {
    boolean filter(Book book);
}
