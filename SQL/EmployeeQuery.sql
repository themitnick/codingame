SELECT
    first_name,
    last_name,
    satisfaction
FROM employees
WHERE num_years >= 5
AND satisfaction >= 0.8
ORDER BY last_name;

