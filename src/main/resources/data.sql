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