-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 02 juin 2020 à 14:34
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projetjava`
--

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

DROP TABLE IF EXISTS `cours`;
CREATE TABLE IF NOT EXISTS `cours` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `cours`
--

INSERT INTO `cours` (`ID`, `NOM`) VALUES
(1, 'Web Dynamique'),
(2, 'Thermodynamique'),
(3, 'Analyse financiere '),
(4, 'Probabilites et statistiques'),
(5, 'Robotique');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

DROP TABLE IF EXISTS `enseignant`;
CREATE TABLE IF NOT EXISTS `enseignant` (
  `ID_UTILISATEUR` int(255) NOT NULL,
  `ID_COURS` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `enseignant`
--

INSERT INTO `enseignant` (`ID_UTILISATEUR`, `ID_COURS`) VALUES
(11, 1),
(12, 2),
(13, 3),
(14, 4),
(15, 5);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `ID_UTILISATEUR` int(255) NOT NULL,
  `NUMERO` int(255) NOT NULL,
  `ID_GROUPE` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`ID_UTILISATEUR`, `NUMERO`, `ID_GROUPE`) VALUES
(121, 1, '01'),
(122, 2, '01'),
(123, 3, '01\r\n'),
(124, 4, '01'),
(125, 5, '01'),
(126, 6, '01'),
(127, 7, '01'),
(128, 8, '01'),
(129, 9, '01'),
(130, 10, '01'),
(131, 11, '01'),
(132, 12, '02'),
(133, 13, '02'),
(134, 14, '02'),
(135, 15, '02'),
(136, 16, '02'),
(137, 17, '02'),
(138, 18, '02'),
(139, 19, '02'),
(140, 20, '02'),
(141, 21, '02'),
(142, 22, '02'),
(143, 23, '03'),
(144, 24, '03'),
(145, 25, '03'),
(146, 26, '03'),
(147, 27, '03'),
(148, 28, '03'),
(149, 29, '03'),
(150, 30, '03'),
(151, 31, '03'),
(152, 32, '03'),
(153, 33, '03');

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

DROP TABLE IF EXISTS `groupe`;
CREATE TABLE IF NOT EXISTS `groupe` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL,
  `ID_PROMOTION` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `groupe`
--

INSERT INTO `groupe` (`ID`, `NOM`, `ID_PROMOTION`) VALUES
(1, 'ING3-01', 2022),
(2, 'ing3-02', 2022),
(3, 'ing3-03', 2022);

-- --------------------------------------------------------

--
-- Structure de la table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
CREATE TABLE IF NOT EXISTS `promotion` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `promotion`
--

INSERT INTO `promotion` (`ID`, `NOM`) VALUES
(2022, 'Ing3'),
(2021, 'Ing4'),
(2020, 'Ing05'),
(2023, 'Ing2'),
(2024, 'Ing01');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL,
  `CAPACITE` int(4) NOT NULL,
  `ID_SITE` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`ID`, `NOM`, `CAPACITE`, `ID_SITE`) VALUES
(1, 'salle01', 50, 1),
(2, 'salle02', 50, 1),
(3, 'Salle03', 250, 1),
(4, 'salle04', 50, 2),
(5, 'Salle05', 500, 2),
(6, 'Salle06', 250, 2),
(7, 'salle07', 50, 3),
(8, 'salle08', 500, 3),
(9, 'Salle09', 400, 3);

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

DROP TABLE IF EXISTS `seance`;
CREATE TABLE IF NOT EXISTS `seance` (
  `ID` int(255) NOT NULL,
  `SEMAINE` int(255) NOT NULL,
  `DATE` date NOT NULL,
  `HEURE_DEBUT` time(6) NOT NULL,
  `HEURE_FIN` time(6) NOT NULL,
  `ETAT` int(1) NOT NULL,
  `ID_COURS` int(255) NOT NULL,
  `ID_TYPE` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `seance`
--

INSERT INTO `seance` (`ID`, `SEMAINE`, `DATE`, `HEURE_DEBUT`, `HEURE_FIN`, `ETAT`, `ID_COURS`, `ID_TYPE`) VALUES
(1, 9, '2020-02-24', '15:30:00.000000', '17:00:00.000000', 1, 1, 1),
(2, 9, '2020-02-24', '17:15:00.000000', '18:45:00.000000', 1, 1, 1),
(3, 9, '2020-02-25', '08:30:00.000000', '10:00:00.000000', 1, 1, 1),
(4, 9, '2020-02-25', '10:15:00.000000', '11:45:00.000000', 1, 2, 2),
(5, 9, '2020-02-25', '13:45:00.000000', '15:15:00.000000', 1, 3, 3),
(6, 24, '2020-06-08', '13:45:00.000000', '15:15:00.000000', 1, 3, 1),
(7, 24, '2020-06-08', '15:30:00.000000', '17:00:00.000000', 1, 2, 1),
(8, 24, '2020-06-08', '10:15:00.000000', '11:45:00.000000', 1, 1, 2),
(9, 24, '2020-06-08', '08:30:00.000000', '10:00:00.000000', 1, 2, 4),
(11, 24, '2020-06-10', '08:30:00.000000', '10:00:00.000000', 1, 3, 4),
(10, 24, '2020-06-09', '10:15:00.000000', '11:45:00.000000', 1, 1, 2),
(12, 24, '2020-06-10', '15:30:00.000000', '17:00:00.000000', 1, 5, 4),
(13, 24, '2020-06-11', '08:30:00.000000', '10:00:00.000000', 1, 4, 1);

-- --------------------------------------------------------

--
-- Structure de la table `seances_enseignants`
--

DROP TABLE IF EXISTS `seances_enseignants`;
CREATE TABLE IF NOT EXISTS `seances_enseignants` (
  `ID_SEANCE` int(255) NOT NULL,
  `ID_ENSEIGNANT` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `seances_enseignants`
--

INSERT INTO `seances_enseignants` (`ID_SEANCE`, `ID_ENSEIGNANT`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 3),
(6, 4),
(7, 4),
(7, 1),
(8, 2),
(9, 4),
(10, 4),
(11, 4),
(12, 4),
(13, 1);

-- --------------------------------------------------------

--
-- Structure de la table `seances_groupes`
--

DROP TABLE IF EXISTS `seances_groupes`;
CREATE TABLE IF NOT EXISTS `seances_groupes` (
  `ID_SEANCE` int(255) NOT NULL,
  `ID_GROUPE` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `seances_groupes`
--

INSERT INTO `seances_groupes` (`ID_SEANCE`, `ID_GROUPE`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(7, 2),
(8, 2),
(9, 2),
(10, 3),
(11, 3),
(12, 3),
(13, 3);

-- --------------------------------------------------------

--
-- Structure de la table `seances_salles`
--

DROP TABLE IF EXISTS `seances_salles`;
CREATE TABLE IF NOT EXISTS `seances_salles` (
  `ID_SEANCE` int(255) NOT NULL,
  `ID_SALLE` int(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `seances_salles`
--

INSERT INTO `seances_salles` (`ID_SEANCE`, `ID_SALLE`) VALUES
(1, 1),
(2, 1),
(3, 5),
(4, 3),
(7, 5),
(5, 6),
(6, 1),
(7, 1),
(8, 2),
(9, 1),
(10, 3),
(11, 2),
(12, 2),
(13, 1);

-- --------------------------------------------------------

--
-- Structure de la table `site`
--

DROP TABLE IF EXISTS `site`;
CREATE TABLE IF NOT EXISTS `site` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `site`
--

INSERT INTO `site` (`ID`, `NOM`) VALUES
(1, 'Eiffeil1'),
(2, 'Eiffel2'),
(3, 'Eiffel3');

-- --------------------------------------------------------

--
-- Structure de la table `type_cours`
--

DROP TABLE IF EXISTS `type_cours`;
CREATE TABLE IF NOT EXISTS `type_cours` (
  `ID` int(255) NOT NULL,
  `NOM` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `type_cours`
--

INSERT INTO `type_cours` (`ID`, `NOM`) VALUES
(1, 'CM'),
(2, 'TP'),
(3, 'TD'),
(4, 'Examen');

-- --------------------------------------------------------

--
-- Structure de la table `utlisateur`
--

DROP TABLE IF EXISTS `utlisateur`;
CREATE TABLE IF NOT EXISTS `utlisateur` (
  `ID` int(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `PASSWD` varchar(255) NOT NULL,
  `NOM` varchar(255) NOT NULL,
  `PRENOM` varchar(255) NOT NULL,
  `DROIT` int(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utlisateur`
--

INSERT INTO `utlisateur` (`ID`, `EMAIL`, `PASSWD`, `NOM`, `PRENOM`, `DROIT`) VALUES
(11, 'hina@ece.fr', 'hina', 'Hina', 'Manolo', 1),
(2, 'pullicino@ece.fr', 'pullicino', 'Pullicino', 'Michel', 1),
(3, 'turzi@ece.fr', 'turzi', 'Turzi', 'Francesco', 1),
(4, 'delisle@ece.fr', 'delisle', 'Delisle', 'Laurent', 1),
(5, 'minot@ece.fr', 'minot', 'Minot', 'Robert', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
