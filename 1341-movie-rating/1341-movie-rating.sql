-- Part 1: User with most ratings
SELECT u.name AS results
FROM Users u
WHERE u.user_id = (
    SELECT mr.user_id
    FROM MovieRating mr
    JOIN Users u2 ON mr.user_id = u2.user_id
    GROUP BY mr.user_id, u2.name
    ORDER BY COUNT(*) DESC, u2.name
    LIMIT 1
)

UNION ALL   -- keep duplicates

-- Part 2: Movie with highest average rating in Feb 2020
SELECT m.title AS results
FROM Movies m
WHERE m.movie_id = (
    SELECT mr.movie_id
    FROM MovieRating mr
    JOIN Movies m2 ON mr.movie_id = m2.movie_id
    WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY mr.movie_id, m2.title
    ORDER BY AVG(mr.rating) DESC, m2.title
    LIMIT 1
);
