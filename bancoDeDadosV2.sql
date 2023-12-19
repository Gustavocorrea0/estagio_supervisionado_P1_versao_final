/*
    author:GUSTAVO ALFREDO
*/
CREATE DATABASE db_farm_system_v2;

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    nivel_de_acesso CHAR(1) NOT NULL
);

CREATE TABLE propriedade (
    id_propriedade SERIAL NOT NULL,
    nome_propriedade VARCHAR(255) NOT NULL,
    local_propriedade VARCHAR(255) NOT NULL,
    area_propriedade NUMERIC(10, 2) NOT NULL,
    tipo_de_cultura_propriedade VARCHAR(255) NULL,
    estado VARCHAR(255) NULL,
    cidade VARCHAR(255) NULL,
    PRIMARY KEY (id_propriedade)
);

CREATE TABLE veiculo (
    id_veiculo SERIAL NOT NULL,
    tipo_veiculo VARCHAR(100) NOT NULL,
    nome_veiculo VARCHAR(255) NOT NULL,
    marca_veiculo VARCHAR(255) NOT NULL,
    ano_veiculo INT NOT NULL,
    chassi_veiculo CHAR(17) NULL,
    estado_veiculo CHAR(1) NULL,
    capacidade_do_tanque_de_combustivel INT NOT NULL,
    PRIMARY KEY (id_veiculo)
);

CREATE TABLE caminhao_ou_veiculo_de_transporte (
    id_caminhao_ou_veiculo_de_transporte SERIAL NOT NULL,
    capacidade_de_carga NUMERIC(10, 2) NOT NULL,
    PRIMARY KEY (id_caminhao_ou_veiculo_de_transporte)
) INHERITS (veiculo);

CREATE TABLE trator (
    id_trator SERIAL NOT NULL,
    numero_de_marchas INT NULL,
    quantidade_de_Rodas INT NOT NULL,
    potencia_em_cv INT NULL,
    PRIMARY KEY (id_trator)
) INHERITS (veiculo);

CREATE TABLE maquina (
    id_maquina SERIAL NOT NULL,
    tipo_maquina VARCHAR(255) NOT NULL,
    nome_maquina VARCHAR(255) NOT NULL,
    marca_maquina VARCHAR(255) NOT NULL,
    ano_da_maquina INT NOT NULL,
    chassi_maquina CHAR(17) NULL,
    estado_maquina CHAR(1) NOT NULL,
    PRIMARY KEY (id_maquina)
);

CREATE TABLE carregador (
    id_carregador SERIAL NOT NULL,
    peso_suportado NUMERIC(10, 2) NOT NULL,
    PRIMARY KEY (id_carregador)
) INHERITS (maquina);

CREATE TABLE carreta_graneleira (
    id_carreta_graneleira SERIAL NOT NULL,
    capacidade_de_peso NUMERIC(10, 2) NOT NULL,
    capacidade_de_sacas INT NOT NULL,
    PRIMARY KEY (id_carreta_graneleira)
) INHERITS (maquina);

CREATE TABLE subsolador (
    id_subsolador SERIAL NOT NULL,
    peso NUMERIC(10, 2) NULL,
    largura_em_mm NUMERIC(10, 2) NOT NULL,
    numero_de_hastes INT NOT NULL,
    potencia_do_trator_em_cv INT NOT NULL,
    PRIMARY KEY (id_subsolador)
) INHERITS (maquina);

CREATE TABLE colheitadeira (
    id_colheitadeira SERIAL NOT NULL,
    quantidade_de_sacos INT NOT NULL,
    capacidade_do_tanque_de_combustivel NUMERIC(10, 2) NOT NULL,
    tipo_de_cultura VARCHAR(255) NULL,
    PRIMARY KEY (id_colheitadeira)
) INHERITS (maquina);

CREATE TABLE maquina_de_plantio (
    id_maquina_de_plantio SERIAL NOT NULL,
    capacidade_de_Sementes NUMERIC(10, 2) NOT NULL,
    quantidade_de_linhas INT NOT NULL,
    PRIMARY KEY (id_maquina_de_plantio)
) INHERITS (maquina);

CREATE TABLE pulverizador (
    id_pulverizador SERIAL NOT NULL,
    tipo_de_cultura VARCHAR(255) NULL,
    capacidade_do_reservatorio NUMERIC(10, 2) NULL,
    PRIMARY KEY (id_pulverizador)
) INHERITS (maquina);

CREATE TABLE producao (
    id_producao SERIAL NOT NULL,
    id_propriedade INT NULL,
    id_subdivisao INT NULL,
    propriedade_da_colheita VARCHAR(255) NOT NULL,
    data_plantio DATE NOT NULL,
    data_inicio_colheita DATE NOT NULL,
    data_fim_colheita DATE NOT NULL,
    quantidade_produzida_em_sacos INT NOT NULL,
    nome_producao VARCHAR(255) NOT NULL,
    valor_total_despesas NUMERIC(10, 2) NOT NULL,
    valor_total_de_lucro NUMERIC(10, 2) NOT NULL,
    cultura VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_producao)
);

CREATE TABLE planta (
    id_planta SERIAL NOT NULL,
    id_propriedade INT NULL,
    tipo_de_planta VARCHAR(255) NOT NULL,
    fornecedor_da_planta VARCHAR(255) NOT NULL,
    ciclo_em_dias INT NOT NULL,
    data_de_plantio DATE NOT NULL,
    altura_atual_da_planta NUMERIC(10,2) NOT NULL,
    PRIMARY KEY (id_planta)
);

CREATE TABLE soja (
    id_soja SERIAL NOT NULL,
    data_de_surgimento_de_sementes DATE NULL,
    PRIMARY KEY (id_soja)
) INHERITS (planta);

CREATE TABLE milho (
    id_milho SERIAL NOT NULL,
    data_de_surgimento_de_espigas DATE NULL,
    PRIMARY KEY (id_milho)
) INHERITS (planta);

CREATE TABLE subdivisao (
    id_subDivisao SERIAL NOT NULL,
    id_propriedade INT NOT NULL,
    nome_subdivisao VARCHAR(255) NOT NULL,
    area_subdivisao NUMERIC(10, 2) NOT NULL,
    tipo_de_cultura_subdivisao VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_subDivisao)
);

CREATE TABLE estoque (
    id_estoque SERIAL NOT NULL,
    tipo_de_insumo VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_estoque)
);

CREATE TABLE agrotoxico (
    id_agrotoxico SERIAL NOT NULL,
    nome_agrotoxico VARCHAR(255) NOT NULL,
    marca_agrotoxico VARCHAR(255) NOT NULL,
    quantidade_minima_em_litros NUMERIC(10, 2) NOT NULL,
    data_de_validade DATE NOT NULL,
    quantidade_em_litros NUMERIC(10, 2) NOT NULL,
    PRIMARY KEY (id_agrotoxico)
);

CREATE TABLE fertilizante (
    id_fertilizante SERIAL NOT NULL,
    nome_fertilizante VARCHAR(255) NOT NULL,
    marca_fertilizante VARCHAR(255) NOT NULL,
    tipo_fertilizante VARCHAR(255) NOT NULL,
    quantidade_em_sacos NUMERIC(10,2) NOT NULL,
    quantidade_em_litros NUMERIC(10,2) NOT NULL,
    PRIMARY KEY (id_fertilizante)
);

CREATE TABLE combustivel (
    id_combustivel SERIAL NOT NULL,
    nome_combustivel VARCHAR(255) NOT NULL,
    quantidade_em_litros NUMERIC(10,2) NOT NULL,
    quantidade_minima_em_litros NUMERIC(10,2) NOT NULL,
    PRIMARY KEY (id_combustivel)
);

CREATE TABLE semente (
    id_semente SERIAL NOT NULL,
    nome_semente VARCHAR(255)NOT NULL,
    marca_semente VARCHAR(255) NOT NULL,
    quantidade_em_sacos NUMERIC(10,2) NOT NULL,
    quantidade_minima_em_sacos NUMERIC(10,2) NOT NULL,
    PRIMARY KEY (id_semente)
);

CREATE TABLE controle (
    id_controle SERIAL PRIMARY KEY,
    id_usuario INTEGER REFERENCES usuario(id),
    id_veiculo INTEGER REFERENCES veiculo(id_veiculo),
    id_estoque INTEGER REFERENCES estoque(id_estoque),
    id_planta INTEGER REFERENCES planta(id_planta),
    id_propriedade INTEGER REFERENCES propriedade(id_propriedade),
    id_maquina INTEGER REFERENCES maquina(id_maquina),
    id_producao INTEGER REFERENCES producao(id_producao)
);

ALTER TABLE usuario ADD CONSTRAINT nome_usuario UNIQUE (nome);
INSERT INTO usuario (nome, senha, nivel_de_acesso) VALUES ('admin', 'admin', 'C')