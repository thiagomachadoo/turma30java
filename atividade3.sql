create database db_escola;

use db_escola;

create table if not exists aluno(
		id_aluno int auto_increment,
        nome varchar(50) not null,
        idade int not null,
        nota int not null,
        primary key(id_aluno)
         
)engine InnoDB;
SELECT * FROM 	aluno;
INSERT INTO aluno VALUES(4,"MARCO",18,6);
INSERT INTO aluno VALUES(33,"TALITA",18,4);
INSERT INTO aluno VALUES(87,"JULIO",18,10);
INSERT INTO aluno VALUES(67,"MARIVALDO",18,9);
INSERT INTO aluno VALUES(1,"LIDONEL",18,7);
INSERT INTO aluno VALUES(2,"ERIC",18,4);
INSERT INTO aluno VALUES(53,"MARIA",18,2);
INSERT INTO aluno VALUES(45,"JUCA",18,1);

select * from aluno where nota > 7; 
select * from aluno where nota < 7; 

