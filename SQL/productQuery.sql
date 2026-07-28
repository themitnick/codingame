SELECT
    product_id,
    CASE
        WHEN available_stock = 0 OR available_stock IS NULL THEN NULL
        ELSE TRIM(TRAILING '0' FROM TRIM(TRAILING '.' FROM ROUND(CAST(value AS DECIMAL) / available_stock, 2)::TEXT))
    END AS unit_value
FROM product
WHERE available_stock > 0 OR available_stock IS NULL
ORDER BY
    CASE
        WHEN available_stock = 0 OR available_stock IS NULL THEN NULL
        ELSE CAST(value AS DECIMAL) / available_stock
    END DESC NULLS LAST,
    product_id ASC;

