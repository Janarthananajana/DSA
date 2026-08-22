# Write your MySQL query statement belo
update Salary set
sex = case when sex = 'm' then 'f'
when sex='f' then 'm'
else sex
end;
