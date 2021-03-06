DROP TABLE IF EXISTS cargos;

CREATE TABLE cargos (
    id INT PRIMARY KEY,
    NOME VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS perfis;

CREATE TABLE perfis (
    id INT PRIMARY KEY,
    NOME VARCHAR(250) NOT NULL
);

/*DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa (
    id INT PRIMARY KEY,
    NOME VARCHAR(250) NOT NULL,
    CPF VARCHAR(11) NOT NULL,
    data_nascimento DATE,
    sexo VARCHAR(1) NOT NULL,
);

DROP TABLE IF EXISTS user;

CREATE TABLE user (
    id INT PRIMARY KEY,
    id_pessoa INT NOT NULL,
    id_perfil INT NOT NULL,
    id_cargo INT NOT NULL,
    data_cadastro DATE NOT NULL
);

ALTER TABLE user ADD CONSTRAINT fk_user_id_pessoa
    FOREIGN KEY (id_pessoa) REFERENCES pessoa (id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION;

ALTER TABLE user ADD CONSTRAINT fk_user_id_perfil
    FOREIGN KEY (id_perfil) REFERENCES perfis (id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION;

ALTER TABLE user ADD CONSTRAINT fk_user_id_cargo
    FOREIGN KEY (id_cargo) REFERENCES cargos (id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION;*/
