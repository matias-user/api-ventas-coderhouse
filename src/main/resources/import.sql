INSERT INTO clientes ( nombre, apellido, dni, anio) VALUES ('Matias','Abarca','12345',27), ('John','Doe','12345',30);
INSERT INTO facturas ( creado_en, cliente_id) VALUES  (NOW(),1), (NOW(),2);
INSERT INTO productos (nombre, stock, precio, creado_en, factura_id) VALUES ('Bicicleta',20,5000, NOW(),1),('Play 5',10,10000, NOW(),2);