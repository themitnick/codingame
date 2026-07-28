SELECT 
    vpl.vehicle_part_location_id AS VEHICLE_PART_LOCATION_ID,
    vp.rfid AS RFID
FROM vehicle_part_location vpl
JOIN vehicle_part vp ON vpl.vehicle_part_id = vp.vehicle_part_id
WHERE vpl.arrived_timestamp IS NOT NULL 
    AND vpl.left_timestamp IS NOT NULL
    AND vpl.left_timestamp < vpl.arrived_timestamp;