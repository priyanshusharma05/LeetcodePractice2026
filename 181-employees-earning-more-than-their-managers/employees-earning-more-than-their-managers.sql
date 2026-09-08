# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee f 
on e.managerId=f.id
where e.salary > f.salary; 