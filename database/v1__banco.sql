-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.13 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Volcando estructura para tabla banco.entidadbancaria
DROP TABLE IF EXISTS `entidadbancaria`;
CREATE TABLE IF NOT EXISTS `entidadbancaria` (
  `idEntidad` int(10) DEFAULT NULL,
  `codigoEntidad` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL,
  `tipoEntidadBancaria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.entidadbancaria: ~14 rows (aproximadamente)
DELETE FROM `entidadbancaria`;
/*!40000 ALTER TABLE `entidadbancaria` DISABLE KEYS */;
INSERT INTO `entidadbancaria` (`idEntidad`, `codigoEntidad`, `nombre`, `cif`, `tipoEntidadBancaria`) VALUES
	(101, '23458765', 'Banner', '23456778', NULL),
	(102, '23267765', 'EpicGames', '27536968', NULL),
	(104, '28739876', 'Bethesda Softworks', '24534968', NULL),
	(103, '23263265', 'Rockstar', '37246968', NULL),
	(124, '87543276', 'New Haven', '23671263', 'BANCO'),
	(12345, '23674325', 'DrakkarCompany', '23666678', NULL),
	(23, '5555', '66666', '7777', NULL),
	(7, '13386789', 'Corleone', '35679873', 'BANCO'),
	(13, '23567823', 'JhonMarsthon', '66666666', NULL),
	(2, '123678245', 'abel', '1235678', 'BANCO'),
	(3, '12367893', 'aaron', '12347812', 'CAJADEAHORRO'),
	(1, '134567890', 'bankia', '34512398', 'BANCO'),
	(4, '16463638', 'Mickael', '14632468', 'CAJADEAHORRO'),
	(5, '76532145', 'Franklin', '33469643', 'BANCO');
/*!40000 ALTER TABLE `entidadbancaria` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
