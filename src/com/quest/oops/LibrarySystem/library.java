package com.quest.oops.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

class Library implements LibraryOperations {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }
    @Override
    public Book searchBook(String searchTerm) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(searchTerm) || book.getAuthor().equalsIgnoreCase(searchTerm) || String.valueOf(book.getIsbn()).equals(searchTerm)) {
                return book;
            }
        }
        return null;
    }
    @Override
    public void borrowBook(int memberid, int isbn) {
        LibraryMember member = findMemberById(memberid);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null && book.isAvailable()) {
            book.setAvailability(false);//book not available means book borrowed
            member.borrowBook(isbn); //adding the book to borrowed book list
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Unable to borrow book. Either the book is unavailable or the member ID is invalid.");
        }
    }
    @Override
    public void returnBook(int memberid, int isbn) {
        LibraryMember member = findMemberById(memberid);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null && !book.isAvailable()) {
            book.setAvailability(true);
            member.returnBook(isbn);  //removing from borrowed book list
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Unable to return book. Either the book was not borrowed or the member ID is invalid.");
        }
    }

    private LibraryMember findMemberById(int memberId) {
        for (int i = 0; i < members.size(); i++) {
            LibraryMember m = members.get(i);
            if (m.getMemberId() == memberId) {
                return m;
            }
        }
        return null;
    }

    private Book findBookByIsbn(int isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
    @Override
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isAvailable()) {
                book.Displaybook();
            }
        }
    }
    @Override
    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < members.size(); i++) {
            LibraryMember m = members.get(i);
            m.displayMember();
        }
    }
    @Override
    public void addMember(LibraryMember member) {
        members.add(member);
    }
}

