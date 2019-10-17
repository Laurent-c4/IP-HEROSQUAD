CREATE DATABASE herosquad;
\c herosquad;
CREATE TABLE heroes (id SERIAL PRIMARY KEY, name VARCHAR, age INTEGER, specialPower VARCHAR, weakness VARCHAR, squadId INTEGER);
CREATE TABLE squads (id SERIAL PRIMARY KEY, name VARCHAR);
CREATE DATABASE herosquad_test WITH TEMPLATE herosquad;