create table users (
    id int auto_increment primary key,
    email varchar
);

create table courses (
    id int auto_increment primary key,
    title varchar,
    description varchar,
    price int
);

create table purchases (
    user_id int,
    course_id int,
    purchases_at timestamp,
    foreign key (user_id) references users(id),
    foreign key (course_id) references courses(id)
)