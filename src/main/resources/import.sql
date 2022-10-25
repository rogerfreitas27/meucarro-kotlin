-- Insert de marcas

INSERT INTO MARCA (id,nome_marca) VALUES(1,'FIAT');
INSERT INTO MARCA  (id,nome_marca) VALUES(2,'CHEVROLET');
INSERT INTO MARCA (id,nome_marca)  VALUES(3,'TOYOTA');
INSERT INTO MARCA (id,nome_marca)  VALUES(4,'HYUNDAI');
INSERT INTO MARCA (id,nome_marca)  VALUES(5,'VOLKSWAGEM');
INSERT INTO MARCA  (id,nome_marca) VALUES(6,'JEEP');
INSERT INTO MARCA  (id,nome_marca) VALUES(7,'RENAULT');
INSERT INTO MARCA  (id,nome_marca) VALUES(8,'HONDA');
INSERT INTO MARCA (id,nome_marca) VALUES(9,'NISSAN');
INSERT INTO MARCA  (id,nome_marca) VALUES(10,'PEUGEOT');
INSERT INTO MARCA (id,nome_marca)  VALUES(11,'FORD');
INSERT INTO MARCA (id,nome_marca)  VALUES(12,'CITROEN');



-- Insert de modelos

INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(1,'FASTBACK',50000.00,1);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(2,'ARGO',30000.00,1);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(3,'ONIX',35000.00,2);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(4,'CELTA',15000.00,2);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(5,'COROLLA',25000.00,3);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(6,'YARIS',25000.00,3);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(7,'TUCSON',55000.00,4);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(8,'CRETA',75000.00,4);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(9,'NIVUS',25000.00,5);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(10,'T-CROS',45000.00,5);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(11,'COMPASS',25000.00,6);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(12,'GRAND CHEROKEE',45000.00,6);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(13,'LOGAN',22000.00,7);
INSERT INTO MODELO (id,nome,valor_fipe,marca_id) VALUES(14,'SANDERO',18000.00,7);


-- Insert de carros

INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(1,2022,'Gasolina','Vermelho',4,'2022-10-24',1);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(2,2021,'Alcool','Branca',4,'2022-10-24',2);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(3,2020,'Alcool','Prata',2,'2021-11-11',3);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(4,2015,'Flex','Prata',2,'2021-12-10',4);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(5,2019,'Gasolina','Prata',4,'2021-11-11',5);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(6,2022,'Etanol','Azul',4,'2020-11-11',6);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(7,2018,'Gasolina','Prata',4,'2021-11-11',7);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(8,2022,'Diesel','Azul',4,'2022-01-06',8);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(9,2018,'Alcool','Prata',4,'2022-01-07',9);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(10,2020,'Flex','Amarelo',4,'2022-01-15',10);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(11,2019,'Gasolina','Vermelho',4,'2022-01-15',11);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(12,2018,'Diesel','Branca',4,'2021-11-11',12);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(13,2017,'Flex','Amarelo',4,'2021-11-11',13);
INSERT INTO CARRO (id,ano,combustivel,cor,num_portas,timestamp_cadastro,modelo_id) VALUES(14,2017,'Flex','Prata',4,'2021-11-11',14);
