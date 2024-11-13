SELECT * FROM hotel_reservaion_system;

CREATE TABLE customers (
customerid INT PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(50),
lastname VARCHAR(50),
email VARCHAR(50),
phonenumber VARCHAR(20),
address VARCHAR(20)
);

CREATE TABLE rooms (
roomid INT PRIMARY KEY AUTO_INCREMENT,
roomtype VARCHAR(20),
pricepernight DECIMAL(10,2),
status VARCHAR(50),
floornumber INT
);

CREATE TABLE reservations (
reservationid INT PRIMARY KEY AUTO_INCREMENT,
customerid INT,
roomid INT,
reservationdate DATE,
checkindate DATE,
checkoutdate DATE,
status VARCHAR(20),
FOREIGN KEY (customerid) REFERENCES customers (customerid),
FOREIGN KEY (roomid) REFERENCES rooms (roomid)
);

CREATE TABLE payments (
paymentid INT PRIMARY KEY AUTO_INCREMENT,
reservationid INT,
paymentdate DATE,
amountpaid DECIMAL(10,2),
paymentmethod VARCHAR(50),
FOREIGN KEY (reservationid) REFERENCES reservations (reservationid)
);

CREATE TABLE staff (
staffid INT PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(50),
lastname VARCHAR(50),
role VARCHAR(50),
hiredate DATE
);

CREATE TABLE roomassignments (
assignmentid INT PRIMARY KEY AUTO_INCREMENT,
staffid INT,
roomid INT,
assignmentdate DATE,
taskdescription VARCHAR(50),
FOREIGN KEY (staffid) REFERENCES staff (staffid),
FOREIGN KEY (roomid) REFERENCES rooms (roomid)
);

INSERT INTO customers (firstname,lastname,email,phonenumber,address) VALUES
('John','Mathew','john@gmail.com','1234567890','123 Street City'),
('Riya','John','riya@gmail.com','0987654321','456 Queen City'),
('Joy','Joseph','joy@gmail.com','7896541230','789 Green City'),
('Sam','Job','sam@gmail.com','0321456987','963 Blue City'),
('Reena','James','reena@gmail.com','2589630147','852 Garden City');
SELECT * FROM customers;
INSERT INTO rooms (roomtype,pricepernight,status,floornumber) VALUES
('Single',100.00,'Available',1),
('Double',150.00,'Occupied',1),
('Suite',200.00,'Available',2),
('Single',100.00,'Under Maintenance',2),
('Double',150.00,'Available',3);
SELECT * FROM rooms;
INSERT INTO reservations (customerid,roomid,reservationdate,checkindate,checkoutdate,status) VALUES
(1,1,'2024-10-01','2024-10-10','2024-10-15','completed'),
(2,2,'2024-10-02','2024-10-12','2024-10-17','confirmed'),
(3,3,'2024-10-03','2024-10-20','2024-10-25','cancelled'),
(4,4,'2024-10-04','2024-10-30','2024-11-05','completed'),
(5,5,'2024-10-05','2024-11-01','2024-11-07','confirmed');
SELECT * FROM reservations;
INSERT INTO payments (reservationid,paymentdate,amountpaid,paymentmethod) VALUES
(1,'2024-10-15',500.00,'credit card'),
(2,'2024-10-17',750.00,'cash'),
(3,'2024-10-25',1000.00,'cash'),
(4,'2024-11-05',600.00,'credit card'),
(5,'2024-11-07',450.00,'cash');
SELECT * FROM payments;
INSERT INTO staff (firstname, lastname, role, hiredate) VALUES 
('Anna', 'Johnson', 'receptionist', '2024-01-01'),
('Ben', 'Abraham', 'manager', '2024-02-01'),
('John', 'Doe', 'housekeeper', '2024-03-01'),
('Daniel', 'Amit', 'housekeeper', '2024-04-01'),
('Emma', 'Thomas', 'receptionist', '2024-05-01');
SELECT * FROM staff;
INSERT INTO roomassignments (staffid, roomid, assignmentdate, taskdescription) VALUES 
(3,1,'2024-10-12','cleaning'),
(4,2,'2024-10-13','maintenance'),
(2,3,'2024-10-14','cleaning'),
(4,4,'2024-10-15','cleaning'),
(3,5,'2024-10-16','maintenance');
SELECT * FROM roomassignments;

SELECT staff.firstname,staff.lastname,COUNT(roomassignments.assignmentid) AS Num_of_Assignments FROM roomassignments
JOIN staff ON
staff.staffid = roomassignments.staffid
GROUP BY staff.staffid;

SELECT c.*,r.* FROM customers c
FULL OUTER JOIN reservations r ON 
r.customerid = c.customerid;

SELECT * FROM rooms 
LEFT JOIN reservations ON
reservations.roomid = rooms.roomid
WHERE rooms.status = 'Available' AND rooms.floornumber = '1';

SELECT customers.firstname,customers.lastname,customers.email FROM customers
JOIN reservations ON
reservations.customerid = customers.customerid
ORDER BY checkindate;

SELECT * FROM customers
JOIN reservations ON
reservations.customerid = customers.customerid
WHERE DATEDIFF(reservations.checkoutdate,reservations.checkindate)>5;

SELECT reservationid,SUM(amountpaid) AS Total_Paid FROM payments
GROUP BY reservationid;

SELECT roomtype,AVG(pricepernight) AS Average_Price FROM rooms
GROUP BY roomtype
ORDER BY Average_Price DESC;

SELECT SUM(amountpaid) AS Total_Revenue FROM payments
WHERE paymentdate BETWEEN '2024-10-01' AND '2024-10-31';

SELECT staff.firstname,staff.lastname,COUNT(roomassignments.assignmentid) AS Num_of_Assignments FROM roomassignments
JOIN staff ON
staff.staffid = roomassignments.staffid
WHERE assignmentdate BETWEEN '2024-10-01' AND '2024-10-31'
GROUP BY staff.staffid
ORDER BY Num_of_Assignments DESC;

SELECT customers.customerid,customers.firstname,customers.lastname,MAX(reservations.reservationdate) AS Most_Recent_Reservation From reservations
JOIN customers ON
customers.customerid = reservations.customerid
GROUP BY customers.customerid
ORDER BY Most_Recent_reservation DESC;

DELETE FROM Payments WHERE reservationid = 1;
DELETE FROM Reservations 
WHERE reservationid = 1;

SELECT rooms.roomid,rooms.roomtype
FROM rooms
JOIN reservations ON
reservations.roomid = rooms.roomid
WHERE checkindate > '2024-10-24';


