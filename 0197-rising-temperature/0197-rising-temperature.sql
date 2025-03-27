# Write your MySQL query statement below
SELECT w1.id
FROM Weather w1
JOIN Weather w2
--	•	DATEDIFF(date1, date2) gives how many days between date1 and date2.
--	•	So DATEDIFF(w1.recordDate, w2.recordDate) = 1 means w1 is 1 day after w2.
  ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;

