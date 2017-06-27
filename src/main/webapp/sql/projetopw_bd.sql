/* cria o banco de dados de nome "projetopw_db" */
create database projetopw_bd;

/* especifica ao servidor de banco de dados que queremos usar o banco de dados recém criado*/
use projetopw_bd;

/* comando para criar a tabela de usuários do sistema */
create table usuarios(
    usuario varchar(20),
    senha varchar(15),
    primary key (usuario, senha)
);
	
/* Alterando a engine da tabela usuarios para innodb*/
alter table usuarios engine = InnoDB;


/* comando para criar a tabela de alunos */
create table aluno(
	MatrAluno varchar(10) not null,
    Nome varchar(50) not null,
    DataNascimento date,
    Rg varchar(15),
    Cpf varchar(11),
    NomeMae varchar(50) not null,
    Cidade varchar(30),
    Bairro varchar(30),
    Logradouro varchar(30),
    Cep varchar(8),
    Numero int(4),
    constraint primary key(MatrAluno)
) ENGINE = innodb;
	

/* comando para criar a tabela de cursos */
create table curso(
	CodCurso varchar(10) not null,
    Nome varchar(30) not null,
    Ementa varchar(300),
    constraint primary key(CodCurso)
) ENGINE = innodb;


/* comando para criar a tabela de matriculas */
create table matricula(
	Aluno varchar(10) not null,
    Curso varchar(10) not null,
    Situacao varchar(10) not null,
    DataMatricula date,
    constraint foreign key(Aluno) references aluno(MatrAluno),
    constraint foreign key(Curso) references curso(CodCurso)
) ENGINE = innodb;


/* Inserindo usuários do sistema */
insert into usuarios (usuario, senha) values ('hitalo', '123');
insert into usuarios (usuario, senha) values ('jones', '123');
insert into usuarios (usuario, senha) values ('marcelo', '123');
insert into usuarios (usuario, senha) values ('reinaldo', '123');
insert into usuarios (usuario, senha) values ('walison', '123');



/* Exemplo de criação de tabela com chave primária

CREATE TABLE teste ( 
codigo int(7) NOT NULL default '0',  
sequencia int(6) NOT NULL default '0',  
descricao varchar(50) NOT NULL default '',  
PRIMARY KEY  (codigo, sequencia)
);

 EXEMPLO DE TABELA COM CHAVE EXTRANGEIRA
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);
*/
