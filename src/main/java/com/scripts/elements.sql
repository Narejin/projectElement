-- Script SQL --
-- Création de la Base de données éléments --

DROP DATABASE Elements;

CREATE DATABASE Elements;
USE Elements;

CREATE TABLE Famille (
        id smallint(5) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT, 
        nom varchar(25) NOT NULL,
        particularite varchar (250) DEFAULT NULL
);

CREATE TABLE Element (
        z smallint(5) UNSIGNED NOT NULL PRIMARY KEY,
        nom varchar(3) NOT NULL,
        nom_courant varchar(25) NOT NULL,
        masse_atomique float(6) NOT NULL,
        famille_id smallint(5) UNSIGNED,
        etat varchar(10)
);

ALTER TABLE element
        ADD INDEX(famille_id);

ALTER TABLE element 
        ADD CONSTRAINT fk_famille_id_to_id FOREIGN KEY (famille_id) REFERENCES famille(id);

ALTER TABLE `famille` ADD UNIQUE(`nom`);

INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (1,'Métal Alcalin', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (2,'Métal Alcalino-terreux', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (3,'Métal de Transition', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (4,'Métal Pauvre', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (5,'Métalloïde', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (6,'Non Métaux', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (7,'Gaz Noble', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (8,'Lanthanide', NULL);
INSERT INTO `famille`(`id`, `nom`, `particularite`) VALUES (9,'Actinide', NULL);

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
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (7,'N','Azote',17.007,6,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (8,'O','Oxygène',15.999,6,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (9,'F','Fluor',18.998,6,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (15,'P','Phosphore',30.974,6,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (16,'S','Soufre',32.06,6,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (17,'Cl','Chlore',35.45,6,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (18,'Ar','Argon',39.948,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (19,'K','Potassium',39.098,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (20,'Ca','Calcium',40.078,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (21,'Sc','Scandium',44.956,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (22,'Ti','Titane',47.867,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (23,'V','Vanadium',50.942,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (24,'Cr','Chrome',51.996,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (25,'Mn','Manganèse',54.938,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (26,'Fe','Fer',55.845,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (27,'Co','Cobalt',58.933,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (28,'Ni','Nickel',58.693,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (29,'Cu','Cuivre',63.546,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (30,'Zn','Zinc',65.38,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (32,'Ge','Germamium',72.630,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (33,'As','Arsenic',74.922,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (34,'Se','Sélénium',78.971,6,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (35,'Br','Brome',79.904,6,'Liquide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (36,'Kr','Krypton',83.798,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (37,'Rb','Rubidium',85.468,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (38,'Sr','Strontium',87.62,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (39,'Y','Yttrium',88.906,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (40,'Zr','Zirconium',91.224,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (41,'Nb','Niobium',92.906,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (42,'Mo','Molybdène',95.95,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (43,'Tc','Technétium',98,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (44,'Ru','Ruthénium',101.07,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (45,'Rh','Rhodium',102.91,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (46,'Pd','Palladium',106.42,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (47,'Ag','Argent',107.87,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (48,'Cd','Cadmium',112.41,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (49,'In','Indium',114.82,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (50,'Sn','Etain',118.71,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (51,'Sb','Antimoine',121.76,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (52,'Te','Tellure',127.60,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (53,'I','Iode',126.90,6,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (54,'Xe','Xénon',131.29,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (55,'Cs','Césium',132.91,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (56,'Ba','Baryum',137.33,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (59,'Pr','Praséodyme',140.91,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (60,'Nd','Néodyme',144.24,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (61,'Pm','Prométhium',145,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (62,'Sm','Samarium',150.36,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (63,'Eu','Europium',151.96,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (64,'Gd','Gadolinium',157.25,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (65,'Tb','Terbium',158.93,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (66,'Dy','Dysprosium',162.50,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (67,'Ho','Holmium',164.93,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (68,'Er','Erbium',167.26,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (69,'Tm','Thulium',168.93,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (70,'Yb','Ytterbium',173.05,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (71,'Lu','Lutécium',174.97,8,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (72,'Hf','Hafnium',178.49,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (73,'Ta','Tantale',180.95,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (74,'W','Tungstène',183.84,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (75,'Re','Rhénium',186.21,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (76,'Os','Osmium',190.23,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (77,'Ir','Iridium',192.22,3,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (80,'Hg','Mercure',200.59,3,'Liquide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (81,'Tl','Thallium',204.38,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (82,'Pb','Plomb',207.2,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (83,'Bi','Bismuth',208.98,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (84,'Po','Polonium',209,4,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (85,'At','Astate',210,5,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (86,'Rn','Radon',222,7,'Gaz');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (87,'Fr','Francium',223,1,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (88,'Ra','Radium',226,2,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (91,'Pa','Proactinium',231.04,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (92,'U','Uranium',238.03,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (93,'Np','Neptunium',237,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (94,'Pu','Plutonium',244,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (95,'Am','Américium',243,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (96,'Cm','Curium',247,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (97,'Bk','Berkélium',247,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (98,'Cf','Californium',251,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (99,'Es','Einsteinium',252,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (100,'Fm','Fermium',257,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (101,'Md','Mendélévium',258,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (102,'No','Nobélium',259,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (103,'Lr','Lawrencium',266,9,'Solide');
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (104,'Rf','Rutherfordium',267,3,NULL);
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (105,'Db','Dubnium',268,3,NULL);
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (106,'Sg','Saeborgium',269,3,NULL);
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (107,'Bh','Bohrium',270,3,NULL);
INSERT INTO `element`(`z`, `nom`, `nom_courant`, `masse_atomique`, `famille_id`, `etat`) VALUES (108,'Hs','Hassium',277,3,NULL);