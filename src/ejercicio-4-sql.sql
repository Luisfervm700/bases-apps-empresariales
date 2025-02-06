create database ejercicio4;

use ejercicio4;

CREATE TABLE clientes (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    telefono VARCHAR(20),
    fecha_registro DATE DEFAULT CAST(GETDATE() AS DATE)
);

INSERT INTO clientes (nombre, email, telefono)
VALUES 
    ('Juan Pérez', 'juan.perez@email.com', '1234567890'),
    ('Ana Gómez', 'ana.gomez@email.com', '0987654321'),
    ('Carlos Sánchez', 'carlos.sanchez@email.com', '1122334455'),
    ('María López', 'maria.lopez@email.com', '2233445566'),
    ('Luis Martínez', 'luis.martinez@email.com', '3344556677');

	SELECT * FROM clientes;
		