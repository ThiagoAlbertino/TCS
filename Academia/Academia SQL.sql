CREATE DATABASE IF NOT EXISTS academia;

CREATE TABLE administrador(
	ID_ADM INT PRIMARY KEY AUTO_INCREMENT,
	nome_administrador VARCHAR(50) NOT NULL,
	senha_administrador CHAR(32) NOT NULL
);

CREATE TABLE instrutor(
	ID_INSTRUTOR INT PRIMARY KEY AUTO_INCREMENT,
	nome_instrutor VARCHAR(50) NOT NULL,
	funcao_instrutor VARCHAR(50) NOT NULL
);

CREATE TABLE aluno(
	ID_ALUNO INT PRIMARY KEY AUTO_INCREMENT,
    nome_aluno VARCHAR(50) NOT NULL,
    idade_aluno INT NOT NULL,
    rg_aluno CHAR(9) NOT NULL,
    telefone_aluno INT NOT NULL,
    endereco_aluno VARCHAR(100) NOT NULL
);

CREATE TABLE aparelho(
	ID_APARELHO INT PRIMARY KEY AUTO_INCREMENT,
    nome_aparelho VARCHAR(50) NOT NULL,
    tipo_aparelho VARCHAR(50) NOT NULL,
    marca_aparelho VARCHAR(50) NOT NULL,
    disponibilidade_aparelho BOOLEAN NOT NULL
);

CREATE TABLE treino(
	ID_TREINO INT PRIMARY KEY AUTO_INCREMENT,
    nome_treino VARCHAR(50) NOT NULL,
    tipo_treino VARCHAR(50) NOT NULL,
	duracao_treino DATETIME NOT NULL
);