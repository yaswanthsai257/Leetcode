# Write your MySQL query statement below
select e.unique_id,emp.name from EmployeeUNI e right join 
Employees emp on e.id=emp.id;