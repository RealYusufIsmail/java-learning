create table IF NOT EXISTS users (
    id int auto_increment primary key,
    email varchar
);

create table IF NOT EXISTS courses (
    id int auto_increment primary key,
    title varchar,
    description varchar,
    price int
);

create table IF NOT EXISTS purchases (
    user_id int,
    course_id int,
    purchases_at timestamp,
    foreign key (user_id) references users(id),
    foreign key (course_id) references courses(id)
);

insert into users (email) values (
    '123@gmail.com'
);

insert into courses (title, description, price) values (
    'Learn SQL',
    'Learn SQL in a fun and easy way',
    100
);

insert into purchases (user_id, course_id, purchases_at) values (
    1,
    1,
    '2020-01-01 00:00:00'
);