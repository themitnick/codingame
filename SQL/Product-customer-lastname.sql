SELECT 
    lastname AS LASTNAME,
    firstname AS FIRSTNAME
FROM customer
WHERE lastname LIKE 'W%'
ORDER BY lastname, firstname;

SELECT 
    lastname AS LASTNAME,
    firstname AS FIRSTNAME
FROM customer
WHERE birth_date IS NOT NULL
ORDER BY lastname, firstname;