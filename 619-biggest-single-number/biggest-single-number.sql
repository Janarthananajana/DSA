# Write your MySQL query statement below
select max(num) as num from MYNumbers
where num in (select num from MYNumbers 
group by num having count(*)=1);