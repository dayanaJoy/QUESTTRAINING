package com.quest.oops.LibrarySystem;

import java.util.ArrayList;
class LibraryMember {
    private int memberId;
    private String name;
    private String contactInfo;
    private ArrayList<Integer> borrowedBooks;

    public LibraryMember(int memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(int isbn) {
        borrowedBooks.add(isbn);
    }

    public void returnBook(int isbn) {
        borrowedBooks.remove(isbn);
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId + ", Name: " + name + ", Contact: " + contactInfo + ", Borrowed Books: " + borrowedBooks);
    }
}

