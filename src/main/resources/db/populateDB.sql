DELETE FROM user_role;
DELETE FROM meal;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password, calories_per_day)
VALUES ('User', 'user@gmail.com', '{noop}password', 2005),
       ('Admin', 'admin@gmail.com', '{noop}admin', 1900),
       ('Guest', 'guest@gmail.com', '{noop}guest', 2000);

INSERT INTO user_role (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001),
       ('USER', 100001);

INSERT INTO meal (date_time, description, calories, user_id)
VALUES ('2020-01-30 10:00:00', 'Breakfast', 500, 100000),
       ('2020-01-30 13:00:00', 'Lunch', 1000, 100000),
       ('2020-01-30 20:00:00', 'Dinner', 500, 100000),
       ('2020-01-31 0:00:00', 'Food for the limit interval', 100, 100000),
       ('2020-01-31 10:00:00', 'Breakfast', 500, 100000),
       ('2020-01-31 13:00:00', 'Lunch', 1000, 100000),
       ('2020-01-31 20:00:00', 'Dinner', 510, 100000),
       ('2020-01-31 14:00:00', 'Admin lunch', 510, 100001),
       ('2020-01-31 21:00:00', 'Admin dinner', 1500, 100001);
