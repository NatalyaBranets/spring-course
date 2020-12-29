# spring-course

Configuration in Database




create database library;

create table books(id serial not null,
title varchar(100) not null,
author varchar(100) not null,
quality numeric not null);

insert into books(title, author, quality) values ('War and Peas', 'Leo Tolstoy', 10);
insert into books(title, author, quality) values('The grapes of wrath', 'John Steinbeck', 5);

select * from books;



 
