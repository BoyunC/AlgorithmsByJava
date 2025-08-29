-- 코드를 입력하세요
SELECT a.flavor 
from icecream_info a inner join first_half b
on a.flavor = b.flavor
where b.total_order >= 3000
and a.ingredient_type = 'fruit_based'
order by b.total_order desc;
