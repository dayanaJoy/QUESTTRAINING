package com.quest.oops.LibrarySystem;

public interface LibraryOperations {
    public void addBook(Book book);
    public Book searchBook(String searchTerm);
    public void borrowBook(int memberid, int isbn);
    public void returnBook(int memberid, int isbn);
    public void displayAvailableBooks();
    public void displayAllMembers();
    public void addMember(LibraryMember member) ;
}
