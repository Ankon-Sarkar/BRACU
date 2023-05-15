create database week2;

create table users(member_id varchar(10),name varchar(30),email varchar(30),influnce_count int,member_since date,multiplier int);

insert into users values
('1','Taylor otwell','otwell@laravel.com',739360,'2020-6-10',10),
('2','Ryan Dahl','ryan@nodejs.org',633632,'2020-04-22',10),
('3','Brendan Eich','eich@javascript.com',939570,'2020-05-07',8),
('5','Evan You','you@vuejs.org',982630,'2020-06-11',7),
('6','Rasmus Lerdorf','lerdorf@php.net',937927,'2020-06-3',8),
('7','Guido van Rossum','guido@python.org',968827,'2020-07-18',19),
('8','Adrian Holovaty','adrian@djangoproject.com',570724,'2020-05-07',5),
('9','Simon Willison','simon@djangoproject.com',864615,'2020-04-30',4),
('10','James Gosling','james@java.com',719491,'2020-05-18',5),
('11','Rod Johnson','rod@spring.io',601744,'2020-05-18',7),
('12','Satoshi Nakamoto','nakamoto@blockchain.com',630488,'2020-05-10',10);



alter table users change member_id id varchar(10);
select id,name,email,member_since from users;
select name,email from users;
select name,email,member_since,1 - (multiplier * influence_count / 20000000) from users;
select name,email,member_since,1 - (multiplier * influence_count / 20000000) as ranking from users;