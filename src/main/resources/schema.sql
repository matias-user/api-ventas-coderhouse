drop table productos if exists;
CREATE TABLE productos (producto_id int NOT NULL PRIMARY KEY, nombre varchar(150) not null, stock INT NOT NULL, precio DECIMAL NOT NULL );

drop table clientes if exists;
CREATE TABLE clientes (id int NOT NULL PRIMARY KEY, nombre varchar(150) not null, apellido varchar(150) not null, dni VARCHAR(150) NOT NULL, anio INT NOT NULL );