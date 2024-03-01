SELECT * FROM names;
INSERT INTO names (name)
VALUES ('dojo'), ('coding')

UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;

UPDATE names
SET name = "jassem" WHERE id = 4;