-- Actividad 1 (UT4). Gestor de incidencias informáticas.
-- Ejecutar desde MySQL con una cuenta que pueda crear bases de datos y usuarios.
-- IMPORTANTE: sustituir CAMBIA_ESTA_CONTRASENA por una contraseña propia
-- ANTES de ejecutar el script. No compartir el script con la contraseña real.
-- No se crea la tabla incidencias: la genera JPA al arrancar la aplicación.

CREATE DATABASE IF NOT EXISTS gestor_incidencias
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

-- CREATE USER IF NOT EXISTS 'incidencias_app'@'localhost'
--     IDENTIFIED BY 'CAMBIA_ESTA_CONTRASENA';

-- -- Permisos limitados a la base de datos de esta práctica.
-- -- Incluye permisos de desarrollo para que Hibernate pueda crear/modificar tablas.
-- GRANT ALL PRIVILEGES ON gestor_incidencias.*
--     TO 'incidencias_app'@'localhost';

-- Verificar que existe la base de datos:
-- SHOW DATABASES LIKE 'gestor_incidencias';

-- Si el usuario incidencias_app ya existía, CREATE USER IF NOT EXISTS
-- no cambia su contraseña. En ese caso, revisa la contraseña del usuario
-- y ajústala por separado con ALTER USER si es necesario.
