DROP DATABASE if exists NotesDB;
CREATE DATABASE NotesDB;

USE NotesDB;

CREATE TABLE users(
    username VARCHAR2(20) NOT NULL, 
    password VARCHAR2(20) NOT NULL, 
    firstname VARCHAR2(20), 
    lastname VARCHAR2(20), 
    email VARCHAR(40), 
    CONSTRAINT PK_username PRIMARY KEY (username));

INSERT INTO users(username, password)
VALUES("admin","password");
COMMIT;