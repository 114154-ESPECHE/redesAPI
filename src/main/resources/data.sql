INSERT INTO empresas (url, nombre) VALUES ('https://www.facebook.com', 'Facebook');
INSERT INTO empresas (url, nombre) VALUES ('https://www.twitter.com', 'Twitter');
INSERT INTO empresas (url, nombre) VALUES ('https://www.instagram.com', 'Instagram');

INSERT INTO redes (id_Empresa) VALUES (1);
INSERT INTO redes (id_Empresa) VALUES (2);
INSERT INTO redes (id_Empresa) VALUES (3);

INSERT INTO ubicaciones (direccion, telefono, nombre) VALUES ('Dirección 1', 123456789, 'Ubicación A');
INSERT INTO ubicaciones (direccion, telefono, nombre) VALUES ('Dirección 2', 987654321, 'Ubicación B');

INSERT INTO ubicaciones_redes (id_Ubicacion, id_Red) VALUES (1, 1);
INSERT INTO ubicaciones_redes (id_Ubicacion, id_Red) VALUES (1, 2);
INSERT INTO ubicaciones_redes (id_Ubicacion, id_Red) VALUES (2, 3);