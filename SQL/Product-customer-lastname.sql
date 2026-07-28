SELECT 
    lastname AS LASTNAME,
    firstname AS FIRSTNAME
FROM customer
WHERE lastname LIKE 'W%'
ORDER BY lastname, firstname;