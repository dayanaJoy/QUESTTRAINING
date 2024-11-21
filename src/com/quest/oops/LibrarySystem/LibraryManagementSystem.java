package com.quest.oops.LibrarySystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Available Books");
            System.out.println("7. Display All Members");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter publication year: ");
                    int publicationyear = sc.nextInt();
                    System.out.println("Choose Book Type : ");
                    System.out.println("1.Fiction");
                    System.out.println("2.Non Fiction");
                    System.out.println("Enter your choice: ");
                    int bookType = sc.nextInt();
                    sc.nextLine();
                    if(bookType == 1) {
                        System.out.println("Enter genre : ");
                        String genre = sc.nextLine();
                        Fiction fiction = new Fiction(isbn,title,author,publicationyear,genre);
                        library.addBook(fiction);
                    } else if(bookType == 2) {
                        System.out.println("Enter genre : ");
                        String genre = sc.nextLine();
                        NonFiction nonfiction = new NonFiction(isbn,title,author,publicationyear,genre);
                        library.addBook(nonfiction);
                    }
                    /*System.out.print("Is the book available? (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    sc.nextLine();*/
                    Book book = new Book(isbn, title, author, publicationyear);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter member ID: ");
                    int memberid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter contact info: ");
                    String contactinfo = sc.nextLine();
                    LibraryMember member = new LibraryMember(memberid, name, contactinfo);
                    library.addMember(member);
                    break;
                case 3:
                    System.out.print("Enter book title, author, or ISBN: ");
                    String searchitem = sc.nextLine();
                    library.searchBook(searchitem);
                    break;
                case 4:
                    System.out.print("Enter member ID: ");
                    int borrowMemberId = sc.nextInt();
                    System.out.print("Enter ISBN of the book to borrow: ");
                    int borrowisbn = sc.nextInt();
                    library.borrowBook(borrowMemberId, borrowisbn);
                    break;
                case 5:
                    System.out.print("Enter member ID: ");
                    int returnMemberId = sc.nextInt();
                    System.out.print("Enter ISBN of the book to return: ");
                    int returnIsbn = sc.nextInt();
                    library.returnBook(returnMemberId, returnIsbn);
                    break;
                case 6:
                    library.displayAvailableBooks();
                    break;
                case 7:
                    library.displayAllMembers();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        sc.close();
    }
}

