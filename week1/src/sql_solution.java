CREATE TABLE WORKER (
        WORKER_ID primary key,
        FIRST_NAME varchar(255),
        LAST_NAME varchar(255),
        SALARY decimal,
        JOINING_DATE date,
        DEPARTMENT varchar(255),
        );

INSERT INTO WORKER VALUES (1, "Rick", "Smith", 100000, "2021-02-20 09:00:00", "HR");
INSERT INTO WORKER VALUES (2, "Sam", "Williams", 80000, "2021-06-11 09:00:00", "Admin");
INSERT INTO WORKER VALUES (3, "John", "Brown", 300000, "2021-02-20 09:00:00", "HR");
INSERT INTO WORKER VALUES (4, "Amy", "Jones", 500000, "2021-02-20 09:00:00", "Admin");
INSERT INTO WORKER VALUES (5, "Sean", "Garcia", 500000, "2021-06-11 09:00:00", "Admin");
INSERT INTO WORKER VALUES (6, "Ryan", "Miller", 200000, "2021-06-11 09:00:00", "Account");
INSERT INTO WORKER VALUES (7, "Patty", "Davis", 75000, "2021-01-20 09:00:00", "Account");
INSERT INTO WORKER VALUES (8, "Monica", "Rodriguez", 90000, "2021-04-11 09:00:00", "Admin");


1. Write an SQL query to fetch worker names with salaries >= 50000 and <= 10000
        select FIRST_NAME, LAST_NAME
                from WORKER
                where SALARY >= 50000 AND SALARY <= 100000;

2. Write an SQL query to fetch the no. of workers for each department in the descending order.
        select DEPARTMENT, count(WORKER_ID)
                from WORKER
                group by DEPARTMENT DESC;

3. Write an SQL query to fetch intersecting records of two tables.
        select WORKER.FIRST_NAME, WORKER.LAST_NAME
                from WORKER
                inner join TITLE
                on WORKER.WORKER_ID = TITLE.WORKER_REF_ID;

4. Write an SQL query to determine the 5th highest salary without using TOP or limit method.
        select W1.FIRST_NAME, W1.LAST_NAME, W1.SALARY
                from WORKER w1
                where (4) = (select count(distinct SALARY)
                from WORKER w2
                where w2.SALARY > w1.SALARY);
