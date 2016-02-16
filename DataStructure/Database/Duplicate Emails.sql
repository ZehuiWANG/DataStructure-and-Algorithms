Duplicate Emails Total Accepted: 5116 Total Submissions: 13014 My Submissions Question Solution 
Write a SQL query to find all duplicate emails in a table named Person.

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:

+---------+
| Email   |
+---------+
| a@b.com |
+---------+


# Write your MySQL query statement below
Select email from Person
Group by email
Having count(*)>1;