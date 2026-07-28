SELECT DISTINCT make, model
FROM vehicle
WHERE vehicle_name LIKE 'G%';
ORDER BY make, model;