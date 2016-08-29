-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Dim 28 Août 2016 à 23:28
-- Version du serveur: 5.1.36
-- Version de PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de données: `siig`
--

-- --------------------------------------------------------

--
-- Structure de la table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `idAccount` int(11) NOT NULL AUTO_INCREMENT,
  `idP` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `login` varchar(254) DEFAULT NULL,
  `pw` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idAccount`),
  KEY `FK_association12` (`idUser`),
  KEY `FK_association8` (`idP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `account`
--


-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

CREATE TABLE IF NOT EXISTS `consultation` (
  `idConsultation` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `idDoc` int(11) NOT NULL,
  `dateConsultation` date DEFAULT NULL,
  PRIMARY KEY (`idConsultation`),
  KEY `FK_association2` (`idDoc`),
  KEY `FK_association3` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `consultation`
--


-- --------------------------------------------------------

--
-- Structure de la table `destination`
--

CREATE TABLE IF NOT EXISTS `destination` (
  `idDestination` int(11) NOT NULL AUTO_INCREMENT,
  `idEntite` int(11) DEFAULT NULL,
  `idVille` int(11) DEFAULT NULL,
  `idMission` int(11) NOT NULL,
  `description` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idDestination`),
  KEY `FK_association13` (`idVille`),
  KEY `FK_association14` (`idEntite`),
  KEY `FK_association15` (`idMission`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `destination`
--

INSERT INTO `destination` (`idDestination`, `idEntite`, `idVille`, `idMission`, `description`) VALUES
(1, 11, 32, 6, 'Construction d''un PDA'),
(2, 9, 1, 6, '');

-- --------------------------------------------------------

--
-- Structure de la table `document`
--

CREATE TABLE IF NOT EXISTS `document` (
  `idDoc` int(11) NOT NULL AUTO_INCREMENT,
  `idSousType` int(11) NOT NULL,
  `titre` varchar(254) DEFAULT NULL,
  `dateAjout` date DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  `doc` longblob,
  PRIMARY KEY (`idDoc`),
  KEY `FK_association100` (`idSousType`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `document`
--


-- --------------------------------------------------------

--
-- Structure de la table `entite`
--

CREATE TABLE IF NOT EXISTS `entite` (
  `idEntite` int(11) NOT NULL AUTO_INCREMENT,
  `idVille` int(11) DEFAULT NULL,
  `intitule` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idEntite`),
  KEY `FK_association9` (`idVille`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Contenu de la table `entite`
--

INSERT INTO `entite` (`idEntite`, `idVille`, `intitule`) VALUES
(0, NULL, '--- Entite ---'),
(1, NULL, 'DPMA'),
(2, NULL, 'DIP'),
(3, NULL, 'DFMPSP'),
(4, NULL, 'DCAJ'),
(5, NULL, 'DRHAG'),
(6, NULL, 'ONP'),
(7, NULL, 'INRH'),
(8, NULL, 'ANDA'),
(9, NULL, 'CENTRE'),
(10, NULL, 'SDPM'),
(11, NULL, 'SITE'),
(12, NULL, 'EFM'),
(13, NULL, 'CPM'),
(14, NULL, 'DONP');

-- --------------------------------------------------------

--
-- Structure de la table `membreequipe`
--

CREATE TABLE IF NOT EXISTS `membreequipe` (
  `idMe` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `idMission` int(11) NOT NULL,
  `fonction` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idMe`),
  KEY `FK_association10` (`idMission`),
  KEY `FK_association11` (`idUser`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `membreequipe`
--

INSERT INTO `membreequipe` (`idMe`, `idUser`, `idMission`, `fonction`) VALUES
(1, 2, 6, 'Evaluateur'),
(2, 2, 6, 'Evaluateur'),
(3, 1, 6, 'Evaluateur');

-- --------------------------------------------------------

--
-- Structure de la table `mission`
--

CREATE TABLE IF NOT EXISTS `mission` (
  `idMission` int(11) NOT NULL AUTO_INCREMENT,
  `idType` int(11) DEFAULT NULL,
  `titre` varchar(254) DEFAULT NULL,
  `debut` date DEFAULT NULL,
  `fin` date DEFAULT NULL,
  `objet` varchar(254) DEFAULT NULL,
  `detail` varchar(254) DEFAULT NULL,
  `etat` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idMission`),
  KEY `FK_association17` (`idType`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `mission`
--

INSERT INTO `mission` (`idMission`, `idType`, `titre`, `debut`, `fin`, `objet`, `detail`, `etat`) VALUES
(1, 1, 'Audit du patrimoine', '2016-07-04', '2016-07-29', 'Patrimoine', '', 'Cree'),
(3, 2, 'mission2', '2014-08-10', '2014-08-11', 'sans2', 'detail2', 'Cree'),
(6, 2, 'mission5', '2014-08-09', '2014-08-31', 'sans2', 'detail2', 'Cree');

-- --------------------------------------------------------

--
-- Structure de la table `missionpj`
--

CREATE TABLE IF NOT EXISTS `missionpj` (
  `idPj` int(11) NOT NULL AUTO_INCREMENT,
  `idType` int(11) NOT NULL,
  `idMission` int(11) NOT NULL,
  `idDoc` int(11) NOT NULL,
  `titre` varchar(254) DEFAULT NULL,
  `dateAjout` date DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idPj`),
  KEY `FK_association16` (`idMission`),
  KEY `FK_association18` (`idType`),
  KEY `FK_association204` (`idDoc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `missionpj`
--


-- --------------------------------------------------------

--
-- Structure de la table `profil`
--

CREATE TABLE IF NOT EXISTS `profil` (
  `idP` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(254) DEFAULT NULL,
  `libelle` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `profil`
--


-- --------------------------------------------------------

--
-- Structure de la table `soustypedoc`
--

CREATE TABLE IF NOT EXISTS `soustypedoc` (
  `idType` int(11) NOT NULL,
  `idSousType` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idSousType`),
  KEY `FK_association200` (`idType`),
  KEY `idType` (`idType`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `soustypedoc`
--

INSERT INTO `soustypedoc` (`idType`, `idSousType`, `libelle`) VALUES
(1, 1, 'Rapport mission'),
(1, 2, 'Rapport d''activit'),
(1, 3, 'Plan d''approche'),
(2, 4, 'Guide d''audit'),
(2, 5, 'Guide d''inspection'),
(2, 6, 'Guide d''?valuation'),
(2, 7, 'La loi de finance');

-- --------------------------------------------------------

--
-- Structure de la table `typedoc`
--

CREATE TABLE IF NOT EXISTS `typedoc` (
  `idType` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(254) DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idType`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `typedoc`
--

INSERT INTO `typedoc` (`idType`, `libelle`, `description`) VALUES
(1, 'Archives', 'archives'),
(2, 'Ressources', 'ressources');

-- --------------------------------------------------------

--
-- Structure de la table `typemission`
--

CREATE TABLE IF NOT EXISTS `typemission` (
  `idType` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(254) DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idType`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `typemission`
--

INSERT INTO `typemission` (`idType`, `type`, `description`) VALUES
(0, '--- Type ---', 'NULL'),
(1, 'Audit', 'desc1'),
(2, 'Inspection', 'desc2'),
(3, 'Enquete', 'desc3'),
(4, 'Evaluation', 'desc4'),
(5, 'Suivi des recommandations', 'desc5'),
(6, 'Etude et conseil', 'desc6');

-- --------------------------------------------------------

--
-- Structure de la table `typepj`
--

CREATE TABLE IF NOT EXISTS `typepj` (
  `idType` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(254) DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idType`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `typepj`
--


-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `ppr` decimal(8,0) DEFAULT NULL,
  `cin` varchar(254) DEFAULT NULL,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`idUser`, `ppr`, `cin`, `nom`, `prenom`) VALUES
(1, '100', 'ABCDEF', 'Ali', 'Benani'),
(2, '200', 'IJKLMN', 'Mohammed', 'Salama'),
(3, '300', 'OPQRST', 'Samir', 'hamadi');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE IF NOT EXISTS `ville` (
  `idVille` int(11) NOT NULL AUTO_INCREMENT,
  `intitule` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idVille`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=55 ;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`idVille`, `intitule`) VALUES
(0, '--- Ville ---'),
(1, 'Rabat'),
(2, 'Casablanca'),
(3, 'Ras Kebdana'),
(4, 'Nador'),
(5, 'Al Hoceima'),
(6, 'Cala Iris'),
(7, 'Fnidek'),
(8, 'Jebha'),
(9, 'Oued Laou'),
(10, 'Martil'),
(11, 'M''Diq'),
(12, 'Sidi Hssain'),
(13, 'Chmaala'),
(14, 'Ouaren'),
(15, 'Tanger'),
(16, 'Ksar Sghir'),
(17, 'Asilah'),
(18, 'Larache'),
(19, 'K?nitra-Mehdia'),
(20, 'Moulay Bouselham'),
(21, 'Skhirat'),
(22, 'Bouznika'),
(23, 'Mohamm?dia'),
(24, 'Oualidia'),
(25, 'El Jadida'),
(26, 'Safi'),
(27, 'Souiria Kdima'),
(28, 'Essaouira'),
(29, 'Imessouane'),
(30, 'Taghazout'),
(31, 'Imi Ouadar'),
(32, 'Agadir'),
(33, 'Sidi Ifni'),
(34, 'Rkount'),
(35, 'Sidi Boulfail'),
(36, 'Tan Tan'),
(37, 'Tafraya'),
(38, 'Amegriou'),
(39, 'Laayoune'),
(40, 'Boujdour'),
(41, 'Ougnit'),
(42, 'Sidi Elghazi'),
(43, 'Lakraa'),
(44, 'Dakhla'),
(45, 'Lassarga'),
(46, 'Lmhiriz'),
(47, 'Ntirift'),
(48, 'Labouirda'),
(49, 'Aglou'),
(50, 'Tifnit'),
(51, 'Aariche'),
(52, 'Foum El Bir'),
(53, 'Punta'),
(54, 'Roc Chico');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `FK_association12` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `FK_association8` FOREIGN KEY (`idP`) REFERENCES `profil` (`idP`);

--
-- Contraintes pour la table `consultation`
--
ALTER TABLE `consultation`
  ADD CONSTRAINT `FK_association2` FOREIGN KEY (`idDoc`) REFERENCES `document` (`idDoc`),
  ADD CONSTRAINT `FK_association3` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);

--
-- Contraintes pour la table `destination`
--
ALTER TABLE `destination`
  ADD CONSTRAINT `FK_association13` FOREIGN KEY (`idVille`) REFERENCES `ville` (`idVille`),
  ADD CONSTRAINT `FK_association14` FOREIGN KEY (`idEntite`) REFERENCES `entite` (`idEntite`),
  ADD CONSTRAINT `FK_association15` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`);

--
-- Contraintes pour la table `document`
--
ALTER TABLE `document`
  ADD CONSTRAINT `FK_association100` FOREIGN KEY (`idSousType`) REFERENCES `soustypedoc` (`idSousType`);

--
-- Contraintes pour la table `entite`
--
ALTER TABLE `entite`
  ADD CONSTRAINT `FK_association9` FOREIGN KEY (`idVille`) REFERENCES `ville` (`idVille`);

--
-- Contraintes pour la table `membreequipe`
--
ALTER TABLE `membreequipe`
  ADD CONSTRAINT `FK_association10` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`),
  ADD CONSTRAINT `FK_association11` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);

--
-- Contraintes pour la table `mission`
--
ALTER TABLE `mission`
  ADD CONSTRAINT `FK_association17` FOREIGN KEY (`idType`) REFERENCES `typemission` (`idType`);

--
-- Contraintes pour la table `missionpj`
--
ALTER TABLE `missionpj`
  ADD CONSTRAINT `FK_association16` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`),
  ADD CONSTRAINT `FK_association18` FOREIGN KEY (`idType`) REFERENCES `typepj` (`idType`),
  ADD CONSTRAINT `FK_association204` FOREIGN KEY (`idDoc`) REFERENCES `document` (`idDoc`);

--
-- Contraintes pour la table `soustypedoc`
--
ALTER TABLE `soustypedoc`
  ADD CONSTRAINT `fkaaa2` FOREIGN KEY (`idType`) REFERENCES `typedoc` (`idType`);
