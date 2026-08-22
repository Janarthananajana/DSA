# Write your MySQL query statement below
select r.contest_id ,  ROUND(
        COUNT(r.user_id) * 100.0 /
        (SELECT COUNT(*) FROM Users),
        2
    ) AS percentage
    from Register r  join
    Users u on r.user_id = u.user_id
    group by r.contest_id
    order by percentage desc , r.contest_id asc;