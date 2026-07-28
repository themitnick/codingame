SELECT PRODUCT_ID, NAME, PRICE 
FROM PRODUCT 
WHERE PRICE > 100 
ORDER BY PRICE DESC;

SELECT id, prenom, nom, date_achat, num_facture, prix_total
FROM utilisateur
INNER JOIN commande ON utilisateur.id = commande.utilisateur_id;

SELECT product_id,
    CASE 
        WHEN available_stock = 0 THEN NULL
        ELSE TRIM(TRAILING '0' FROM TRIM(TRAILING '.' FROM ROUND(value::decimal / available_stock, 2)::text))
    END AS unit_value
FROM product
ORDER BY unit_value DESC NULLS LAST, product_id ASC;

