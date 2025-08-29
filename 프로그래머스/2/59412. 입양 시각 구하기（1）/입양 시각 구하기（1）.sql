-- 코드를 입력하세요
SELECT HOUR(datetime) AS HOUR, COUNT(datetime) AS COUNT
FROM animal_outs
WHERE HOUR(datetime) between 9 and 19
GROUP BY HOUR(datetime)
ORDER BY HOUR(datetime);