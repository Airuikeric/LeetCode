# Write your MySQL query statement below
SELECT unique_id, name 
FROM Employees e 
LEFT JOIN EmployeeUNI euni
--    ON euni.id = e.id;
     USING (id);