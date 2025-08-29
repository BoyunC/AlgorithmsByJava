-- 코드를 입력하세요
SELECT a.title, a.board_id, b.reply_id, b.writer_id, b.contents, DATE_FORMAT(b.created_date, '%Y-%m-%d') AS CREATED_DATE
FROM used_goods_board a 
    INNER JOIN used_goods_reply b
    ON a.board_id = b.board_id
WHERE DATE_FORMAT(a.created_date, '%Y-%m') = '2022-10'
ORDER BY b.created_date, a.title;