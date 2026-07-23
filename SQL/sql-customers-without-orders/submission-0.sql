-- Write your query below
SELECT s.name from customers s
WHERE id  NOT IN 
( SELECT customer_id FROM orders);