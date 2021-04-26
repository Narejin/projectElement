-- Script SQL --
-- Création de la Table éléments - By Quentin Rodriguez --

CREATE DATABASE Elements;
USE Elements;

CREATE TABLE Famille (
    id smallint(5) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom varchar(25) NOT NULL
);

CREATE TABLE Element (
    z smallint(5) UNSIGNED NOT NULL PRIMARY KEY,
    nom varchar(3) NOT NULL,
    nom_courant varchar(25) NOT NULL,
    masse_atomique float(6) NOT NULL,
    famille_id smallint(5) UNSIGNED,
    etat varchar(10) NOT NULL
);

ALTER TABLE element
ADD INDEX(famille_id);

ALTER TABLE element 
ADD CONSTRAINT fk_famille_id_to_id FOREIGN KEY (famille_id) REFERENCES famille(id);

INSERT INTO `famille`(`id`, `nom`) VALUES (1,'Métal Alcalin');
INSERT INTO `famille`(`id`, `nom`) VALUES (2,'Métal Alcalino-terreux');
INSERT INTO `famille`(`id`, `nom`) VALUES (3,'Métal de Transition');
INSERT INTO `famille`(`id`, `nom`) VALUES (4,'Métal Pauvre');
INSERT INTO `famille`(`id`, `nom`) VALUES (5,'Métalloïde');
INSERT INTO `famille`(`id`, `nom`) VALUES (6,'Non Métaux');
INSERT INTO `famille`(`id`, `nom`) VALUES (7,'Gaz Noble');
INSERT INTO `famille`(`id`, `nom`) VALUES (8,'Lanthanide');
INSERT INTO `famille`(`id`, `nom`) VALUES (9,'Actinide');

INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (1,'H','Hydrogène',1.008,6,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (6,'C','Carbone',12.011,6,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (2,'He','Hélium',4.0026,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (10,'Ne','Néon',20.180,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (3,'Li','Lithium',6.94,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (11,'Na','Sodium',22.990,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (4,'Be','Béryllium',9.0122,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (12,'Mg','Magnésium',24.305,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (78,'Pt','Platine',195.08,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (79,'Au','Or',196.97,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (5,'B','Bore',10.81,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (14,'Si','Silicium',28.085,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (13,'Al','Aluminium',26.982,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (31,'Ga','Gallium',69.723,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (57,'La','Lanthane',138.91,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (58,'Ce','Cérium',140.12,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (89,'Ac','Actinium',227,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (90,'Th','Thorium',232.04,9,'Solide');