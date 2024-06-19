-- 1. get all the columns from the Customers table.
SELECT * FROM Customers;

-- 2. select the City column from the Customers table.
SELECT city FROM Customers;

-- 3. Select all the different values from the Country column in the Customers table.
SELECT DISTINCT Country FROM Customers;

-- 4. Select all records where the City column has the value "Berlin".
SELECT * FROM Customers
WHERE City = "Berlin";

-- 5. Use the NOT keyword to select all records where City is NOT "Berlin".
SELECT * FROM Customers
WHERE NOT City = "Berlin";

-- 6. Select all records where the CustomerID column has the value 32.
SELECT * FROM Customers
WHERE CustomerID = 32;

-- 7.Select all records where the City column has the value 'Berlin' and the PostalCode column 
-- has the value 12209.
SELECT * FROM Customers
WHERE City = "Berlin" AND PostalCode = 12209;

-- 8. Select all records where the City column has the value 'Berlin' or 'London'.

SELECT * FROM Customers
WHERE City = "Berlin" OR City = "London";

-- 9. Select all records from the Customers table, sort the result alphabetically by the column City.
SELECT * FROM Customers
ORDER BY City;

-- 10. Select all records from the Customers table, sort the result reversed alphabetically by the column City.
SELECT * FROM Customers
ORDER BY City DESC;

-- 11. Select all records from the Customers table, sort the result alphabetically, first by the column Country, then, by the column City.
SELECT * FROM Customers
ORDER BY Country, City;

-- 12. Insert a new record in the Customers table.
INSERT INTO Customers (CustomerName, Address, City, PostalCode,Country)
VALUES ('Hekkan Burger', 'Gateveien 15', 'Sandnes', '4306', 'Norway');

-- 13. Select all records from the Customers where the PostalCode column is empty.
SELECT * FROM Customers 
WHERE PostalCode IS NULL;

-- 14. Select all records from the Customers where the PostalCode column is NOT empty.s
SELECT * FROM Customers 
WHERE PostalCode IS NOT NULL;

-- 15. Update the City column of all records in the Customers table.
UPDATE Customers 
SET City = "Oslo";

/* 16. Set the value of the City columns to 'Oslo', but only the ones where the Country column 
has the value "Norway".*/
UPDATE Customers
SET City = "Oslo"
WHERE Country = "Norway";

-- 17. Update the City value and the Country value.
UPDATE Customers
SET City = "Oslo", Country = "Norway"
WHERE CustomerID = 32;

-- 18. Delete all the records from the Customers table where the Country value is 'Norway'.
DELETE FROM Customers
WHERE Country = "Norway";

-- 19. Delete all the records from the Customers table.
DELETE FROM Customers;

-- 20. Use the MIN function to select the record with the smallest value of the Price column.
SELECT MIN(Price) FROM Products;

-- 21. Use an SQL function to select the record with the highest value of the Price column.
SELECT MAX(Price) FROM Products;

-- 22. Use the correct function to return the number of records that have the Price value set to 18.
SELECT COUNT(*)
FROM Products
WHERE Price = 18;

-- 23. Use an SQL function to calculate the average price of all products.
SELECT AVG(Price) FROM Products;

-- 24. Use an SQL function to calculate the sum of all the Price column values in the Products table.
SELECT SUM(Price)
FROM Products;

--25. Select all records where the value of the City column starts with the letter "a".
SELECT * FROM Customers
WHERE City LIKE "a%";

--26. Select all records where the value of the City column ends with the letter "a".
SELECT * FROM Customers
WHERE City LIKE "%a";

--27. Select all records where the value of the City column contains the letter "a".
SELECT * FROM Customers
WHERE City LIKE "%a%";

--28. Select all records where the value of the City column starts with letter "a" and ends with the letter "b".
SELECT * FROM Customers
WHERE City LIKE "a%b";

-- 29. Select all records where the value of the City column does NOT start with the letter "a".
SELECT * FROM Customers
WHERE City NOT LIKE "a%";

-- 30. Select all records where the second letter of the City is an "a".
SELECT * FROM Customers
WHERE City LIKE "_a%";

-- 31. Select all records where the City starts with a "b".
SELECT * FROM Customers
WHERE City LIKE "b%";

-- 32. Use the IN operator to select all the records where Country is either "Norway" or "France".
SELECT * FROM Customers
WHERE Country IN ("Norway", "France");

-- 33. Use the IN operator to select all the records where Country is NOT "Norway" and NOT "France".
SELECT * FROM Customers
WHERE Country NOT IN ('Norway', 'France');

-- 34. select all the records where the value of the Price column is between 10 and 20.
SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20;

-- 35. select all the records where the value of the Price column is NOT between 10 and 20.
SELECT * FROM Products 
WHERE Price NOT BETWEEN 10 AND 20;

-- 36. Select all the records where the value of the ProductName column is alphabetically between 'Geitost' and 'Pavlova'.
SELECT * FROM Products
WHERE ProductName BETWEEN 'Geitost' AND 'Pavlova'

-- 37. When displaying the Customers table, make an ALIAS of the PostalCode column, the column should be called Pno instead.
SELECT CustomerName,Address,PostalCode AS Pno FROM Customers;

-- 38. When displaying the Customers table, refer to the table as Consumers instead of Customers.
SELECT * FROM Customers AS Consumers;

-- 39. Insert the missing parts in the JOIN clause to join the two tables Orders and Customers, using the CustomerID field in both tables as the relationship between the two tables.
SELECT * FROM Orders
LEFT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;

-- 40. Choose the correct JOIN clause to select all records from the two tables where there is a match in both tables.
SELECT * FROM Orders
INNER JOIN Customers
ON Orders.CustomerID=Customers.CustomerID;

-- 41. Choose the correct JOIN clause to select all the records from the Customers table plus all the matches in the Orders table.SELECT *
SELECT * FROM Orders
RIGHT JOIN Customers
ON Orders.CustomerID=Customers.CustomerID;

SELECT * FROM Customers
LEFT JOIN Orders
ON Orders.CustomerID=Customers.CustomerID;

-- 42. List the number of customers in each country.
SELECT Country, COUNT(CustomerID) 
FROM Customers
GROUP BY Country;

-- 43. List the number of customers in each country, ordered by the country with the most customers first.
SELECT Country, COUNT(CustomerID) 
FROM Customers
GROUP BY Country
ORDER BY COUNT(CustomerID) DESC ;

-- 44. Write the correct SQL statement to create a new database called testDB.
CREATE DATABASE testDB;

-- 45. Write the correct SQL statement to delete a database named testDB.
DROP DATABASE testDB;

-- 46. Write the correct SQL statement to create a new table called Persons.
CREATE TABLE Persons (
  PersonID int,
  LastName varchar(255),
  FirstName varchar(255),
  Address varchar(255),
  City varchar(255) 
);

-- 47. Write the correct SQL statement to delete a table called Persons.
DROP TABLE Persons;

-- 48. Use the TRUNCATE statement to delete all data inside a table.
TRUNCATE TABLE Persons;

DELETE FROM Persons;

-- 49. Add a column of type DATE called Birthday.
ALTER TABLE Persons
ADD Birthday DATE;

-- 50. Delete the column Birthday from the Persons table.
ALTER TABLE Persons
DROP COLUMN Birthday;