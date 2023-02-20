DROP USER universidad CASCADE;

CREATE USER universidad IDENTIFIED BY universidad ;

GRANT ALTER ANY INDEX TO universidad;
GRANT ALTER ANY SEQUENCE TO universidad;
GRANT ALTER ANY TABLE TO universidad;
GRANT ALTER ANY TRIGGER TO universidad;
GRANT CREATE ANY INDEX TO universidad;
GRANT CREATE ANY SEQUENCE TO universidad;
GRANT CREATE ANY SYNONYM TO universidad;
GRANT CREATE ANY TABLE TO universidad;
GRANT CREATE ANY TRIGGER TO universidad;
GRANT CREATE ANY VIEW TO universidad;
GRANT CREATE PROCEDURE TO universidad;
GRANT CREATE PUBLIC SYNONYM TO universidad;
GRANT CREATE TRIGGER TO universidad;
GRANT CREATE VIEW TO universidad;
GRANT DELETE ANY TABLE TO universidad;
GRANT DROP ANY INDEX TO universidad;
GRANT DROP ANY SEQUENCE TO universidad;
GRANT DROP ANY TABLE TO universidad;
GRANT DROP ANY TRIGGER TO universidad;
GRANT DROP ANY VIEW TO universidad;
GRANT INSERT ANY TABLE TO universidad;
GRANT QUERY REWRITE TO universidad;
GRANT SELECT ANY TABLE TO universidad;
GRANT UNLIMITED TABLESPACE TO universidad;

ALTER SESSION SET CURRENT_SCHEMA = universidad;


CREATE TABLE departamento (
    id NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL
);

CREATE TABLE alumno (
    id NUMBER(10) PRIMARY KEY,
    nif VARCHAR2(9) UNIQUE,
    nombre VARCHAR2(25) NOT NULL,
    apellido1 VARCHAR2(50) NOT NULL,
    apellido2 VARCHAR2(50),
    ciudad VARCHAR2(25) NOT NULL,
    direccion VARCHAR2(50) NOT NULL,
    telefono VARCHAR2(9),
    fecha_nacimiento DATE NOT NULL,
    sexo VARCHAR2(1) NOT NULL
);
 
CREATE TABLE profesor (
    id NUMBER(10) PRIMARY KEY,
    nif VARCHAR2(9) UNIQUE,
    nombre VARCHAR2(25) NOT NULL,
    apellido1 VARCHAR2(50) NOT NULL,
    apellido2 VARCHAR2(50),
    ciudad VARCHAR2(25) NOT NULL,
    direccion VARCHAR2(50) NOT NULL,
    telefono VARCHAR2(9),
    fecha_nacimiento DATE NOT NULL,
    sexo VARCHAR2(1) NOT NULL
    id_departamento NUMBER(10) NOT NULL,
    FOREIGN KEY (id_departamento) REFERENCES departamento(id)
);
 
CREATE TABLE grado (
    id NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL
);

CREATE TABLE asignatura (
    id NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    creditos NUMBER(3,1) NOT NULL,
    tipo VARCHAR2(15) NOT NULL,
    curso NUMBER(3) NOT NULL,
    cuatrimestre NUMBER(1) NOT NULL,
    id_profesor NUMBER(10),
    id_grado NUMBER(10) NOT NULL,
    FOREIGN KEY(id_profesor) REFERENCES profesor(id_profesor),
    FOREIGN KEY(id_grado) REFERENCES grado(id)
);
CREATE TABLE curso (
    id NUMBER(10) PRIMARY KEY,
    anyo_inicio NUMBER(4) NOT NULL,
    anyo_fin NUMBER(4) NOT NULL
);

CREATE TABLE matricula (
    id_alumno NUMBER(10) NOT NULL,
    id_asignatura NUMBER(10) NOT NULL,
    id_curso NUMBER(10) NOT NULL,
    PRIMARY KEY (id_alumno, id_asignatura, id_curso),
    FOREIGN KEY (id_alumno) REFERENCES alumno(id),
    FOREIGN KEY (id_asignatura) REFERENCES asignatura(id),
    FOREIGN KEY (id_curso) REFERENCES curso(id)
);

COMMIT;