create database db_rh;

use db_rh;

 create table if not exists funcionarios(
	id_funcionarios int auto_increment,
    nome varchar(50) not null,
    idade int not null,
    cargo varchar(40) not null,
    setor varchar(30) not null,
    primary key (id_funcionarios)
    )engine InnoDB;
    
    select * from funcionarios;
    
    INSERT INTO funcionarios VALUES(4,"MARCELLA",18,"chefia","diretoria");
    INSERT INTO funcionarios VALUES(6,"MARIA",19,"estágio","all");
    INSERT INTO funcionarios VALUES(83,"DANILO",23,"estágio","all");
    INSERT INTO funcionarios VALUES(23,"LUCIANA",54,"adm","financeiro");
    INSERT INTO funcionarios VALUES(68,"JOÃO",45,"estágio","all");
    insert into funcionarios (salario) values (3.000);
    alter table funcionarios add column salario double;
    
    
		