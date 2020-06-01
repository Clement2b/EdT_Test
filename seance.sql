-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 01 juin 2020 à 10:48
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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
