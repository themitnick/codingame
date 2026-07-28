SELECT
    lastname,
    firstname
FROM customer
WHERE zipcode IN ('75000', '34000')
AND birth_date IS NOT NULL
ORDER BY lastname, firstname;

