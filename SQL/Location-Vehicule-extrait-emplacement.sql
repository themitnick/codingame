SELECT 
    vehicle_part_id AS VEHICLE_PART_ID,
    arrived_timestamp AS ARRIVED_TIMESTAMP
FROM vehicle_part_location
WHERE location_id IN (3, 6, 12)
    AND left_timestamp IS NOT NULL
ORDER BY vehicle_part_id;