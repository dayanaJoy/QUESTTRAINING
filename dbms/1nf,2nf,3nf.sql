SELECT * FROM c2514_db;

CREATE TABLE customers (
customerid INT PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(20),
lastname VARCHAR(20),
gender VARCHAR(2),
phonenumber VARCHAR(20)
);
DROP TABLE customers;
DROP TABLE orders;
CREATE TABLE orders (
orderid INT PRIMARY KEY AUTO_INCREMENT,
productid INT,
customerid INT,
ordertime DATETIME,
FOREIGN KEY (customerid) REFERENCES customers (customerid)
);

INSERT INTO customers (firstname, lastname, gender, phonenumber) VALUES 
('Chris','Martin','M','01123147789'),
('Emma','Law','F','01123439899'),
('Mark','Watkins','M','01174592013'),
('Daniel','Williams','M',NULL),
('Sarah','Taylor','F','01176348290'),
('Katie','Armstrong','F','01145787353'),
('Michael','Bluth','M','01980289282'),
('Kat','Nash','F','01176987789'),
('Buster','Bluth','M','01173456782'),
('Charlie',NULL,'F','01139287883'),
('Lindsay','Bluth','F','01176923804'),
('Harry','Johnson','M',NULL),
('John','Smith','M','01174987221'),
('John','Taylor','M',NULL),
('Emma','Smith','F','01176984116'),
('Gob','Bluth','M','01176985498'),
('George','Bluth','M','01176984303'),
('Lucille','Bluth','F','01198773214'),
('George','Evans','M','01174502933'),
('Emily','Simmonds','F','01899284352'),
('John','Smith','M','01144473330'),
('Jennifer',NULL,'F',NULL),
('Toby','West','M','01176009822'),
('Paul','Edmonds','M','01966947113');
SELECT * FROM customers;

INSERT INTO orders (productid,customerid,ordertime) VALUES 
(1,1,'2017-01-01 08:02:11'),
(1,2,'2017-01-01 08:05:16'),
(5,12,'2017-01-01 08:44:34'),
(3,4,'2017-01-01 09:20:02'),
(1,9,'2017-01-01 11:51:56'),
(6,22,'2017-01-01 13:07:10'),
(1,1,'2017-01-02 08:03:41'),
(3,10,'2017-01-02 09:15:22'),
(2,2,'2017-01-02 10:10:10'),
(3,13,'2017-01-02 12:07:23'),
(1,1,'2017-01-03 08:13:50'),
(7,16,'2017-01-03 08:47:09'),
(6,21,'2017-01-03 09:12:11'),
(5,22,'2017-01-03 11:05:33'),
(4,3,'2017-01-03 11:08:55'),
(3,11,'2017-01-03 12:02:14'),
(2,23,'2017-01-03 13:41:22'),
(1,1,'2017-01-04 08:08:56'),
(3,10,'2017-01-04 11:23:43'),
(4,12,'2017-01-05 08:30:09'),
(7,1,'2017-01-06 09:02:47'),
(3,18,'2017-01-06 13:23:34'),
(2,16,'2017-01-07 09:12:39'),
(2,14,'2017-01-07 11:24:15'),
(4,5,'2017-01-08 08:54:11'),
(1,1,'2017-01-09 08:03:11'),
(6,20,'2017-01-10 10:34:12'),
(3,3,'2017-01-10 11:02:11'),
(4,24,'2017-01-11 08:39:11'),
(4,8,'2017-01-12 13:20:13'),
(1,1,'2017-01-14 08:27:10'),
(4,15,'2017-01-15 08:30:56'),
(1,7,'2017-01-16 10:02:11'),
(2,10,'2017-01-17 09:50:05'),
(1,1,'2017-01-18 08:22:55'),
(3,9,'2017-01-19 09:00:19'),
(7,11,'2017-01-19 11:33:00'),
(6,12,'2017-01-20 08:02:21'),
(3,14,'2017-01-21 09:45:50'),
(5,2,'2017-01-22 10:10:34'),
(6,24,'2017-01-23 08:32:19'),
(6,22,'2017-01-23 08:45:12'),
(6,17,'2017-01-23 12:45:30'),
(2,11,'2017-01-24 08:01:27'),
(1,1,'2017-01-25 08:05:13'),
(6,11,'2017-01-26 10:49:10'),
(7,3,'2017-01-27 09:23:57'),
(7,1,'2017-01-27 10:08:16'),
(3,18,'2017-01-27 10:13:09'),
(4,19,'2017-01-27 11:02:40'),
(3,10,'2017-01-28 08:03:21'),
(1,2,'2017-01-28 08:33:28'),
(1,12,'2017-01-28 11:55:33'),
(1,13,'2017-01-29 09:10:17'),
(6,6,'2017-01-30 10:07:13'),
(1,1,'2017-02-01 08:10:14'),
(2,14,'2017-02-02 10:02:11'),
(7,10,'2017-02-02 09:43:17'),
(7,20,'2017-02-03 08:33:49'),
(4,21,'2017-02-04 09:31:01'),
(5,22,'2017-02-05 09:07:10'),
(3,23,'2017-02-06 08:15:10'),
(2,24,'2017-02-07 08:27:26'),
(1,1,'2017-02-07 08:45:10'),
(6,11,'2017-02-08 10:37:10'),
(3,13,'2017-02-09 08:58:18'),
(3,14,'2017-02-10 09:12:40'),
(5,4,'2017-02-10 11:05:34'),
(1,2,'2017-02-11 08:00:38'),
(3,8,'2017-02-12 08:08:08'),
(7,20,'2017-02-12 09:22:10'),
(1,1,'2017-02-13 08:37:45'),
(5,2,'2017-02-13 12:34:56'),
(4,3,'2017-02-14 08:22:43'),
(5,4,'2017-02-14 09:12:56'),
(3,5,'2017-02-15 08:09:10'),
(6,7,'2017-02-15 09:05:12'),
(1,8,'2017-02-15 09:27:50'),
(2,9,'2017-02-16 08:51:12'),
(3,10,'2017-02-16 13:07:46'),
(4,11,'2017-02-17 08:03:55'),
(4,12,'2017-02-17 09:12:11'),
(5,10,'2017-02-17 11:41:17'),
(6,18,'2017-02-17 13:05:56'),
(7,19,'2017-02-18 08:33:27'),
(1,17,'2017-02-19 08:12:31'),
(1,1,'2017-02-20 09:50:17'),
(3,5,'2017-02-20 09:51:29'),
(4,6,'2017-02-20 10:43:39'),
(3,1,'2017-02-21 08:32:17'),
(1,1,'2017-02-21 10:30:11'),
(3,2,'2017-02-21 11:08:45'),
(4,3,'2017-02-22 11:46:32'),
(2,15,'2017-02-22 13:35:16'),
(6,13,'2017-02-23 08:34:48'),
(4,24,'2017-02-24 08:32:03'),
(2,13,'2017-02-25 08:03:12'),
(7,17,'2017-02-25 09:34:23'),
(7,23,'2017-02-25 11:32:54'),
(5,12,'2017-02-26 11:47:34'),
(6,4,'2017-02-27 12:12:34'),
(1,1,'2017-02-28 08:59:22');
SELECT * FROM orders;

SELECT firstname,phonenumber FROM customers
WHERE gender = 'F' AND lastname = 'Bluth';

SELECT COUNT(*) AS MaleCustomersWithoutPhone FROM Customers
WHERE Gender = 'M' AND PhoneNumber IS NULL;
 
CREATE TABLE products (
productid INT PRIMARY KEY AUTO_INCREMENT,
productname VARCHAR(20),
price INT,
coffeeorigin VARCHAR(20)
);

INSERT INTO products(productname, price, coffeeorigin) VALUES 
('espresso',2.50,'brazil'),
('macchiatto',3.00,'brazil'),
('cappuccino',3.50,'costa rica'),
('latte',3.50,'indonesia'),
('americano',3.00,'brazil'),
('flat white',3.50,'indonesia'),
('filter',3.00,'india'),
('affogato',2.70,'Italy'),
('Frappe',3.50,'Greece');
SELECT * FROM products;
SELECT productname FROM products
WHERE coffeeorigin = 'India' OR 'Indonesia';

SELECT c.firstname,c.lastname,o.ordertime FROM orders o
JOIN customers c ON 
c.customerid = o.customerid 
JOIN products p ON
p.productid = o.productid
WHERE productname = 'cappuccino';

SELECT C.firstname,c.lastname,p.productname FROM orders o 
JOIN customers c ON 
c.customerid = o.customerid
JOIN products p ON
p.productid = o.productid;

/*1. Convert the following table into 1NF:
      - Table: Orders
	- Columns: `OrderID`, `CustomerName`, `ProductNames` (where `ProductNames` might contain multiple product names separated by commas).*/
CREATE TABLE orders1 (
orderid INT PRIMARY KEY AUTO_INCREMENT,
customername VARCHAR(50),
productname VARCHAR(50)
);

INSERT INTO orders1NF (customername,productname) VALUES
('Chris','Laptop'),
('Chris','TV'),
('Martin','Phone');

/*2. Normalize the following table to 2NF: -> 1NF, all values depends directly on the PK (removes partial dependencies)

      - Table: Student_Courses
	- Columns: `StudentID`, `StudentName`, `CourseID`, `CourseName`, `InstructorID`, `InstructorName*/
CREATE TABLE students (
studentid INT PRIMARY KEY,
studentname VARCHAR(50)
);
CREATE TABLE instructors (
instructorid INT PRIMARY KEY,
instructorname VARCHAR(50)
);
CREATE TABLE courses (
courseid INT PRIMARY KEY,
coursername VARCHAR(50),
instructorid INT,
FOREIGN KEY (instructorid) REFERENCES instructors (instructorid)
);
CREATE TABLE enrollments (
courseid INT,
studentid INT,
FOREIGN KEY (courseid) REFERENCES courses (courseid),
FOREIGN KEY (studentid) REFERENCES students (studentid)
);

/*Normalize the following table to 3NF:
      - Table: Sales
         - Columns: `SalesID`, `ProductID`, `ProductName`, `CategoryID`, `CategoryName`, `SaleDate`*/
CREATE TABLE products (
productid INT PRIMARY KEY,
productname VARCHAR(50),
categoryid int
);
CREATE TABLE sales (
salesid INT PRIMARY KEY,
productid INT,
salesdate date,
FOREIGN KEY (productid) REFERENCES products (productid)
);
CREATE TABLE category (
categoryid INT PRIMARY KEY,
categoryname VARCHAR(50)
);

/*Write an SQL statement to create a table in 1NF with the following information:
      - Columns: `BookID`, `Title`, `Authors` (where each book can have multiple authors).*/
CREATE TABLE BookAuthors (
    BookID INT,
    Title VARCHAR(255),
    Author VARCHAR(100),
    PRIMARY KEY (BookID, Author)
);
INSERT INTO BookAuthors (BookID, Title, Author) VALUES 
(1, 'Ikigai', 'Hector Garcia'),
(1, 'Ikigai', 'Francesc Miralles'),
(2, 'The Talisman', 'Peter Straub'),
(2, 'The Talisman', 'Stephen King'),
(3, 'Harry Potter', 'J K Rowling');

select * from BookAuthors;
