drop table alumno if exists;
CREATE TABLE ALUMNO (nombre varchar(150)NOT NULL, apellido varchar(150) not null, dni INT NOT NULL, legajo INT NOT NULL );
drop table cliente if exists;
CREATE TABLE cliente (id int NOT NULL PRIMARY KEY, nombre varchar(150) not null, apellido varchar(150) not null, dni VARCHAR(150) NOT NULL, anio INT NOT NULL );