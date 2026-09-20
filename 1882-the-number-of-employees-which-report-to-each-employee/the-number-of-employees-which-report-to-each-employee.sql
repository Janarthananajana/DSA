# Write your MySQL query statement below
SELECT
    e.employee_id,
    e.name as name,
    COUNT(e1.employee_id) AS reports_count,
    round(AVG(e1.age)) AS average_age
FROM Employees e
LEFT JOIN Employees e1
    ON e.employee_id = e1.reports_to
GROUP BY e.employee_id, e.name
having count(e1.employee_id)>0
order by e.employee_id;