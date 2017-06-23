/* cria o banco de dados de nome "projetopw_db" */
create database projetopw_bd;

# especifica ao servidor de banco de dados que queremos usar o banco de dados recém criado
use projetopw_bd;

/* comando para criar a tabela de usuários do sistema */
create table usuarios(
    usuario varchar(20),
    senha varchar(15),
    primary key (usuario, senha)
);


insert into usuarios (usuario, senha) values ('jones', '123');



/* Exemplo de criação de tabela */
/*
CREATE TABLE teste ( 
codigo int(7) NOT NULL default '0',  
sequencia int(6) NOT NULL default '0',  
descricao varchar(50) NOT NULL default '',  
PRIMARY KEY  (codigo, sequencia)
);
*/