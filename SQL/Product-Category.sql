SELECT
    product_id AS PRODUCT_ID,
    name AS NAME,
    price AS PRICE
FROM
    product
WHERE
    price > 100
ORDER BY
    price DESC;
