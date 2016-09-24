--DB name :users ,Mysql Database

create table tbl_users(c_id varchar(100), c_first_name varchar(50) not null, c_mid_name varchar(50),c_last_name varchar(50) not null,c_age int(3) not null,c_gender varchar(2) not null, c_phone bigint(10) not null, c_zip bigint(6), primary key(c_id));

