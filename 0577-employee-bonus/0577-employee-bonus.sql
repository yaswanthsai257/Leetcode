SELECT e.name, COALESCE(b.bonus, null) AS bonus 
FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus<1000 or Bonus is null;
