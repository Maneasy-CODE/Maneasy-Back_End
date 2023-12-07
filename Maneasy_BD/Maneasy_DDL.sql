CREATE DATABASE bd_maneasy;

USE bd_maneasy;

CREATE TABLE tb_servicos(
	id_servicos BINARY(16) NOT NULL PRIMARY KEY,
	nome_servicos VARCHAR(255) NOT NULL,
    data_criacao DATE NOT NULL,
    data_inicio DATE NOT NULL,
    data_termino DATE NOT NULL,
    descricao_servicos VARCHAR(255) NOT NULL,
    orcamento DECIMAL (20, 2),
    tempo_servico INT NOT NULL,
	anexo VARCHAR(2048),
    tipo_servicos BIT NOT NULL,
    consultoria VARCHAR(2048),
    status_servicos TINYINT NOT NULL
	/*status_servicos ENUM('Aberto', 'Em andamento', 'Finalizado') NOT NULL*/
);

CREATE TABLE tb_chamados(
	id_chamado BINARY(16) NOT NULL PRIMARY KEY,
    setor VARCHAR(255) NOT NULL,
    nome_solicitante VARCHAR(255) NOT NULL,
	chapa_usuario INT NOT NULL UNIQUE,
    nome_atendente VARCHAR(255) NOT NULL,
    data_criacao DATE NOT NULL,
    data_inicio DATE NOT NULL,
    data_termino DATE NOT NULL,
    descricao_chamado VARCHAR(255) NOT NULL,
    anexo VARCHAR(2048) NOT NULL,
    status_chamado TINYINT NOT NULL    
	/*status_chamado ENUM('Aberto', 'Em andamento', 'Finalizado') NOT NULL*/
);

CREATE TABLE tb_hard_skills(
	id_hard_skill BINARY(16) NOT NULL PRIMARY KEY,
    nome_hard_skill VARCHAR(255) NOT NULL
);

CREATE TABLE tb_usuarios(
	id_usuario BINARY(16) NOT NULL PRIMARY KEY,
    chapa_usuario INT NOT NULL UNIQUE,
    nome_usuario VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    tipos_usuario TINYINT NOT NULL  
    /*tipos_usuario ENUM ('Administrador', 'Gestor', 'Profissional', 'Comum') NOT NULL*/
);

CREATE TABLE tb_profisionais(
	id_profissional BINARY(16) NOT NULL PRIMARY KEY,
    status_profissional TINYINT NOT NULL,
    /*status_profissional ENUM('Ativo', 'Inativo', 'Férias', 'Afastado') NOT NULL,*/
    inicio_ferias DATE,
    termino_ferias DATE,
    jornada_trabalho_profissional SMALLINT,
    hora_extra SMALLINT,
    id_usuario BINARY(16) NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES tb_usuarios(id_usuario)
);

CREATE TABLE tb_profissionais_hardskills(
	id_profissionais_hardskills BINARY(16) NOT NULL PRIMARY KEY,
	id_profissional BINARY(16) NOT NULL,
	id_hard_skill BINARY(16) NOT NULL,
    FOREIGN KEY (id_profissional) REFERENCES tb_profisionais(id_profissional),
	FOREIGN KEY (id_hard_skill) REFERENCES tb_hard_skills(id_hard_skill)
);

CREATE TABLE tb_squads(
	id_squad BINARY(16) NOT NULL PRIMARY KEY,
	id_chamado BINARY(16),
	id_servicos BINARY(16),
	FOREIGN KEY (id_chamado) REFERENCES tb_chamados(id_chamado),
	FOREIGN KEY (id_servicos) REFERENCES tb_servicos(id_servicos)
);

CREATE TABLE tb_profissionais_squads(
	id_profissional BINARY(16) NOT NULL,
	id_squad BINARY(16) NOT NULL,
    FOREIGN KEY (id_profissional) REFERENCES tb_profisionais(id_profissional),
	FOREIGN KEY (id_squad) REFERENCES tb_squads(id_squad)
);

CREATE TABLE tb_dados_volkswagen(
	id_dados_volkswagen BINARY(16) NOT NULL PRIMARY KEY,
    chapa_usuario INT NOT NULL UNIQUE,
    nome_usuario VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
	tipos_usuario TINYINT NOT NULL
    /*tipos_usuario ENUM ('Administrador', 'Gestor', 'Profissional', 'Comum') NOT NULL*/
);