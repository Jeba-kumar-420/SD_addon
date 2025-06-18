use school;
select * from data1;
alter  TABLE data1 add gender varchar(20);
Select * from data1 ; 
update data1 set gender="female" where id=1;
update data1 set gender="Male" where id=2;
update data1 set gender="Male" where id=3;
update data1 set gender="Male" where id=4;
update data1 set gender="Female" where id=5;
ALTER TABLE data1
DROP COLUMN section;
truncate table data1;
drop database data1;