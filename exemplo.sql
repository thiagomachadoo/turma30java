/*CRIAR DATABASE*/
create database voo321;
/*SELECIONAR A DATABASE*/
use voo321;
/*CRIAR TABELA*/
create table aviao (
	id_aviao int(11) not null,
    modelo varchar(50) not null,
    primary key(id_aviao)
) engine=InnoDB;/*ENGINE = InnoDB / PROTEÇÃO DO DB*/
/*MOSTRAR AS TABELAS SELECIONADAS */
desc aviao; /*CTRL + ENTER = EXECUTAR OU CRIAR A LINHA MENCIONADA*/ /*CTRL + SHIFT+ ENTER = RODAR O CODIGO TODO*/
/*OU*/
show tables;

create table tripulantes(
	id_tripulacao int(11) not null,
    nome varchar (50) not null,
    genero char(1) not null check(genero in ('F', 'M', 'N')), /*procurar*/
    id_aviao int(11) not null references aviao(id_aviao),
    primary key(id_tripulacao)
) engine = InnoDB;

/*INSERIR NA TABELA*/
INSERT INTO aviao VALUES (1,'Zoom');
INSERT INTO aviao VALUES (2, 'Boing');
INSERT INTO aviao VALUES (3, 'Excelcior');

select * from aviao;

INSERT INTO tripulantes VALUES (16,'James Kirk','M',1);
INSERT INTO tripulantes VALUES (86, 'Catherine Janeway', 'F', 2);
INSERT INTO tripulantes VALUES (87, 'Uhura', 'F', 1);
INSERT INTO tripulantes VALUES (48, 'Ikaru Sulu', 'M', 3);
INSERT INTO tripulantes VALUES (52, 'Tuvok', 'M', 2);
INSERT INTO tripulantes VALUES (1,'Jhony','M',1);
INSERT INTO tripulantes VALUES (20, 'Sasha', 'N', 2);
INSERT INTO tripulantes VALUES (30, 'Uhura', 'F', 1);
INSERT INTO tripulantes VALUES (66, 'Price', 'N', 3);
INSERT INTO tripulantes VALUES (55, 'Taira', 'N', 2);
select * from tripulantes;
show tables;

update id_tripulacao set genero = 'N' where genero = 'F';

select * from tripulantes where genero = 'N';