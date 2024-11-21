package com.quest.oops.LibrarySystem;

public class NonFiction extends Book{
    String genre;
    public NonFiction(int isbn, String title, String author, int publicationYear,String genre) {
        super(isbn, title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void Displaybook()   {
        System.out.println("Book type : Fiction \nISBN: " + getIsbn() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getPublicationYear() + ", Available: " + isAvailable());
    }
}