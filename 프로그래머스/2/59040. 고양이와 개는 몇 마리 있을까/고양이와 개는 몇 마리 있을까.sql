SELECT animal_type, COUNT(*) AS count
FROM animal_ins
WHERE animal_type IN ('Cat','Dog')
GROUP BY animal_type
ORDER BY CASE animal_type 
            WHEN 'Cat' THEN 1 
            WHEN 'Dog' THEN 2 
         END;