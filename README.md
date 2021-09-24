# Project Onboarding Weekly Coding Challenges
***
##### Sept, 8, 2021 (SQL)
Write an SQL Script to Seed Sample Data and answer the below queries:
- Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000
- Write an SQL query to fetch the no. of workers for each department in the descending order.
- Write an SQL query to fetch intersecting records of two tables.
- Write an SQL query to determine the 5th highest salary without using TOP or limit method.

[My solution](week1/src/sql_solution.sql)
***
##### Sept 15, 2021 (Java)
1) Write a program to encrypt a message using the ROT13 technique.
[Solution](week2/src/rot13.java)
2) Write a program to convert a decimal number to its octal equivalent.
[Solution](week2/src/octal.java)
***
##### Sept 22, 2021 (Java)

Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.

Examples
actualMemorySize("32GB") --> "29.76GB"

actualMemorySize("2GB") --> "1.86GB"

actualMemorySize("512MB") --> "476MB"

Notes
-The actual storage loss on a USB device is 7% of the overall memory size!
-If the actual memory size was greater than 1 GB, round your result to two decimal places.
-If the memory size after adjustment is smaller then 1 GB, return the result in MB.
[Solution](week3/src/MemorySize.java)
***