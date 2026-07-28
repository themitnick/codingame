SELECT 
    first_name AS FIRST_NAME,
    last_name AS LAST_NAME,
    ROUND(AVG(score), 2) AS AVG_SCORE
FROM students
WHERE test_name IN ('English Test', 'History Test')
GROUP BY id, first_name, last_name
HAVING AVG(score) >= 0.9
ORDER BY AVG_SCORE DESC;