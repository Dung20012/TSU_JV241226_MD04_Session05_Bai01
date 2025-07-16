create database student_db;
use student_db;

create table students (
	id int primary key auto_increment,
    student_name varchar(100),
    email varchar(100),
    birthday date,
    avg_mark double
);