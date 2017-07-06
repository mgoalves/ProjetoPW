/* cria o banco de dados de nome "projetopw_db" */
create database projetopw_bd
default character set utf8
default collate ut8_general_ci;

/* especifica ao servidor de banco de dados que queremos usar o banco de dados recém criado*/
use projetopw_bd;

/* comando para criar a tabela de usuários do sistema */
create table usuarios(
    usuario varchar(20),
    senha varchar(15),
    primary key (usuario, senha)
);
	
# Alterando a engine da tabela usuarios para innodb
alter table usuarios engine = InnoDB;


/* comando para criar a tabela de alunos */
create table aluno(
	MatrAluno integer(5) auto_increment,
    Nome varchar(50) not null,
    DataNascimento date,
    Rg varchar(15),
    Cpf varchar(11) unique,
    NomeMae varchar(50) not null,
    Cidade varchar(30),
    Bairro varchar(30),
    Logradouro varchar(30),
    Cep varchar(8),
    Numero varchar(5),
    constraint PK_ALUNO primary key(MatrAluno)
) ENGINE = innodb;

select * from aluno;
	

/* comando para criar a tabela de cursos */
create table curso(
	CodCurso varchar(10) not null,
    Nome varchar(30) not null,
    Ementa varchar(300),
    constraint primary key(CodCurso)
) ENGINE = innodb;


/* comando para criar a tabela de matriculas */
create table matricula(
	Aluno integer(10) not null,
    Curso varchar(10) not null,
    Situacao varchar(10) not null,
    DataMatricula date,
    constraint foreign key(Aluno) references aluno(MatrAluno),
    constraint foreign key(Curso) references curso(CodCurso)
) ENGINE = innodb;




select * from aluno;

# Inserindo usuários do sistema 
insert into usuarios (usuario, senha) values ('hitalo', '123');
insert into usuarios (usuario, senha) values ('jones', '123');
insert into usuarios (usuario, senha) values ('marcello', '123');
insert into usuarios (usuario, senha) values ('reinaldo', '123');
insert into usuarios (usuario, senha) values ('wallison', '123');


create table professor (

	/*Atributos Primarios*/
	rg varchar(8) not null,
	cpf varchar(13) not null,
	nome varchar (30) not null,
	matricula int auto_increment,
	dataNascimento date,
	
	
	/*Atrubutos Secunadrios para Endereço*/
	cidade varchar(20),
	bairro  varchar(20),
	logradouro varchar(20),
	cep varchar(8),
	numero int,
	
	/*Atributos Secundários para Formação*/
	mestrado varchar(30),
	graduacao varchar(30),
	posGraduacao varchar(30),
	
	constraint primary key(matricula)
	
) ENGINE = innodb;



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