create database db_Ecommerce;
use db_Ecommerce;
CREATE TABLE IF NOT EXISTS produto1(
	id_produto1 int auto_increment,
    marca varchar(30) not null,
    tamanho char not null,
    modelo varchar(20) not null,
    preco decimal(10,2) not null,
    primary key(id_produto1)
    )engine InnoDB;
    
select * from produto1;
use db_Ecommerce;
INSERT INTO produto1 VALUES(3,"YSL",'G',"PRAIA",259.90);
INSERT INTO produto1 VALUES(65,"Dior",'M',"CASUAL",499.90);
INSERT INTO produto1 VALUES(98,"Prada",'M',"INFANTIL",679.90);
INSERT INTO produto1 VALUES(23,"Burberry",'P',"CASUAL",999.90);
INSERT INTO produto1 VALUES(4,"Cartier",'G',"INVERNO",899.90);
INSERT INTO produto1 VALUES(22,"Rolex",'X',"CASUAL",699.90);
INSERT INTO produto1 VALUES(276,"Chanel",'P',"INFANTIL",199.90);
INSERT INTO produto1 VALUES(121,"Rolex",'M',"CASUAL",639.90);
    
select * from produto1 where preco < 500 ;
select * from produto1 where preco > 500 ;

  
  
drop database db_Ecommerce;