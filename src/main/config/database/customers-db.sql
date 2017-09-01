-- CREATE DATABASE customers;

-- \c in postgres like USE in mysql

DROP TABLE IF EXISTS Reservation;
DROP TABLE IF EXISTS Login;
DROP TABLE IF EXISTS Client;
DROP TABLE IF EXISTS Adresse;
DROP TABLE IF EXISTS Vol;
DROP TABLE IF EXISTS Phase;
DROP TABLE IF EXISTS Localite;



-- SERIAL or BIGSERIAL postgres TYPE are auto_increment Integer

CREATE TABLE Adresse
	(adresse_id SERIAL primary key ,
     num_et_rue VARCHAR(64),
     code_postal VARCHAR(12),
     ville VARCHAR(32),
     pays VARCHAR(32));

CREATE TABLE Client
	(client_id SERIAL primary key ,
     nom VARCHAR(32),
     prenom VARCHAR(32),
     adresse_id integer,
     email VARCHAR(32),
     telephone VARCHAR(16));
     
CREATE TABLE Reservation
	(reservation_id SERIAL primary key ,
	 client_id integer,
     date_reservation VARCHAR(32),
     comment VARCHAR(32));     
     
CREATE TABLE Login
	(login_id integer primary key ,
     username VARCHAR(32) unique,
     password VARCHAR(32));
     

CREATE TABLE Vol 
	(vol_id SERIAL primary key ,
	prix integer
	phase_depart_id integer,
	phase_arrivee_id integer
	);

CREATE TABLE Localite
	(localite_id SERIAL primary key,
	ville VARCHAR(100),
	pays VARCHAR(100)
	);
	
CREATE TABLE Phase
	(phase_id SERIAL primary key,
	vol_id integer,
	date timestamp,
	heure timestamp,
	localite_id integer,
	CONSTRAINT phase_vol_id_fk FOREIGN KEY (vol_id) REFERENCES Vol(vol_id),
	CONSTRAINT phase_localite_id_fk FOREIGN KEY (localite_id) REFERENCES Localite(localite_id)
	);




ALTER TABLE Client ADD CONSTRAINT client_adresse_id_fk
FOREIGN KEY(adresse_id) REFERENCES adresse(adresse_id); 

ALTER TABLE Login ADD CONSTRAINT login_client_id_fk
FOREIGN KEY(login_id) REFERENCES Client(client_id); 

ALTER TABLE Reservation ADD CONSTRAINT res_client_id_fk
FOREIGN KEY(client_id) REFERENCES Client(client_id); 


INSERT INTO adresse(num_et_rue , code_postal , ville , pays) 
   VALUES ('12 rue elle ' , '75000' , 'Paris' , 'France');

INSERT INTO Customer(prenom , nom , address_id ,email , telephone) 
   VALUES ('alex' , 'Therieur' , 1 , 'alex-therieur@iciOulaBas.fr' , '0102030405');
   
INSERT INTO Login(login_id , username , password) 
   VALUES ( 1 , 'alex-therieur' , 'pwd007' );
   
INSERT INTO Reservation(client_id , date_reservation , comment) 
   VALUES ( 1 , '2017-08-15' , 'resa aaa' ) ,
          ( 1 , '2017-08-17' , 'resa bbb' ) ;

INSERT INTO Vol(prix) 
	VALUES (420),(342),(120);

INSERT INTO Localite(ville,pays) 
	VALUES  ('Paris', 'France'),
		('Toulouse','France'),
		('Nice','France');

INSERT INTO Phase(vol_id, date, heure, localite_id) 
	VALUES  (1, '25/08/2017', '15:35:00', 1),
		(1, '25/08/2017','18:42:00', 3);




select * from adresse;
select * from Client;
select * from Login;
select * from Reservation;
select * from Vol;
select * from Localite;
select * from Phase;
