use school;
create table Data1(id int,name varchar(30),marks int,department varchar(30),section char(1));
insert into Data1 values(1,"Lily",95,"BCA","A"),(2,"Bravo",90,"BCA","A"),(3,"Ray",78,"BCA","B"),(4,"Albert Einstein",99,"BCA","C"),(5,"Ada Lovelace",98,"BCA","C");
update data1 set name="Rayedry",marks=59 where id=3;
select name,department,section from Data1 where marks<60 ;
