create table if not exists numbers(
	id int
);

insert into numbers (id)
values(1),(2),(4),(7),(8),(11);

select num1.id + 1, min(num2.id) - num1.id - 1
from numbers as num1
inner join numbers as num2 on num1.id < num2.id
group by num1.id
having num1.id < min(num2.id) - 1
order by num1.id;