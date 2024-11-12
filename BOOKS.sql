/*Objective:
In this assignment, you are required to design a database schema, create tables, insert data, and perform a series of SQL operations including SELECT, UPDATE, DELETE, and ALTER commands. You will also use aggregate functions and subqueries to manipulate and retrieve data.

Instructions:
Create a Database Schema:

Create a new database schema named LibraryManagement.
Create the Following Tables:

Books table with the following columns:
book_id (Primary Key, INT, Auto Increment)
title (VARCHAR)
author_id (Foreign Key referencing author_id in the Authors table)
publication_year (YEAR)
price (DECIMAL)
Authors table with the following columns:
author_id (Primary Key, INT, Auto Increment)
first_name (VARCHAR)
last_name (VARCHAR)
Borrowers table with the following columns:
borrower_id (Primary Key, INT, Auto Increment)
first_name (VARCHAR)
last_name (VARCHAR)
email (VARCHAR, Unique)
dob (DATE)
Loans table with the following columns:
loan_id (Primary Key, INT, Auto Increment)
borrower_id (Foreign Key referencing borrower_id in the Borrowers table)
book_id (Foreign Key referencing book_id in the Books table)
loan_date (DATE)
return_date (DATE)
Insert Records:

Insert 5 records into each of the four tables (Books, Authors, Borrowers, and Loans). Ensure the data is realistic and consistent with the relationships between the tables.
Perform the Following SQL Operations:

SELECT Queries:

Select all columns from the Books table.
Select the title, price, and publication_year of books where price > 20.
Select the first_name, last_name, and email of borrowers who have borrowed books after '2024-01-01'.
UPDATE Query:

Update the price of the book with title = 'The Great Gatsby' to 25.00.
DELETE Query:

Delete the book from the Books table where title = 'Moby Dick'.
ALTER TABLE Query:

Alter the Books table to add a new column genre of type VARCHAR(50).
Aggregate Functions:

Use the COUNT function to find the total number of borrowers.
Use the SUM function to find the total price of all books in the library.
Use the AVG function to calculate the average price of books.
Subquery:

Write a subquery to find all books that have been borrowed by any borrower who is over 30 years old.
*/

SELECT * FROM librarymanagement.books;

CREATE TABLE authors (
authorid INT PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(50),
lastname VARCHAR(50)
);

CREATE TABLE books (
bookid INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50),
authorid INT,
publicationyear YEAR,
price DECIMAL(10,2),
FOREIGN KEY (authorid) REFERENCES authors(authorid)
);

CREATE TABLE borrowers (
borrowerid INT PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(50),
lastname VARCHAR(50),
email VARCHAR(100) UNIQUE,
dob DATE
);

CREATE TABLE loans (
loanid INT PRIMARY KEY AUTO_INCREMENT,
borrowerid INT,
bookid INT,
loandate DATE,
returndate DATE,
FOREIGN KEY (borrowerid) REFERENCES borrowers(borrowerid),
FOREIGN KEY (bookid) REFERENCES books(bookid)
);

INSERT INTO authors(authorid,firstname,lastname) VALUES
(1,'Abdul','Kalam'),
(2,'Annie','Beasant'),
(3,'Rajendra','Prasad'),
(4,'Pawan','Varma'),
(5,'Toni','Morrison');

INSERT INTO books(bookid,title,authorid,publicationyear,price) VALUES
(101,'The Dawn of Hope',1,1925,500.00),
(102,'The Ancient Wisdom',2,1956,350.00),
(103,'India Divided',3,1989,750.00),
(104,'Being Indian',4,2000,550.00),
(105,'Beloved',5,2005,150.00);

INSERT INTO borrowers(borrowerid,firstname,lastname,email,dob) VALUES
(1001,'Abdul','Kalam','abdulkalam@gmail.com','1895-07-25'),
(1002,'Annie','Beasant','anniebeasant@gmail.com','1926-05-21'),
(1003,'Rajendra','Prasad','raj@gmail.com','1958-01-01'),
(1004,'Pawan','Varma','pawan@gmail.com','1980-11-29'),
(1005,'Toni','morrison','tonimorrison@gmail.com','1990-03-26');

INSERT INTO Loans (loanid,borrowerid,bookid,loandate,returndate) VALUES
(201,1001,101,'2024-02-15','2024-03-15'),
(202,1002,102,'2024-06-10','2024-07-10'),
(203,1003,103,'2024-08-20','2024-09-20'),
(204,1004,104,'2023-12-01','2024-01-01'),
(205,1005,105,'2024-09-15', '2024-10-15');

SELECT * FROM books;

SELECT title,price,publicationyear FROM books WHERE price > 20;

SELECT firstname,lastname,email FROM borrowers 
JOIN loans
ON borrowers.borrowerid = loans.borrowerid
WHERE loans.loandate > '2024-01-01';

UPDATE books 
SET title = 'The Great Gatsby'
WHERE title = 'Beloved';
UPDATE books
SET price = 25.00
WHERE title = 'The Great Gatsby';

UPDATE books 
SET title = 'Being Indian'
WHERE title = 'Moby Dick';
DELETE FROM books
WHERE title = 'Moby Dick';

ALTER TABLE books 
ADD COLUMN genre VARCHAR(50);

SELECT COUNT(*) AS number_of_borrowers FROM borrowers;
SELECT SUM(price) FROM books;
SELECT AVG(price) FROM books;

SELECT * FROM books 
JOIN loans
ON loans.bookid = books.bookid
JOIN borrowers
ON borrowers.borrowerid = loans.borrowerid
WHERE (2024 - YEAR(borrowers.dob)) > 30;
UPDATE borrowers
SET dob = '2000-01-01'
WHERE dob = '1990-03-26';