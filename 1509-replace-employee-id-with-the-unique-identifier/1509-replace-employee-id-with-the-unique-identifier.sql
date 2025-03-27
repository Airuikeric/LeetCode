# Write your MySQL query statement below
SELECT euni.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI euni
    USING (id);