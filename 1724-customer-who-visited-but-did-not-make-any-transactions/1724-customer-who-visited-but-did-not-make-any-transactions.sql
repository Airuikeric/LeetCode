# Write your MySQL query statement below
SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits v
-- 	This keeps all visits, even if there’s no transaction (which is what we want to detect).
LEFT JOIN Transactions t
    USING (visit_id)
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;