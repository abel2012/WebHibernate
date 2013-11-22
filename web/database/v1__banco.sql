-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.22 - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2013-10-14 23:38:24
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for banco
DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Dumping structure for table banco.cuentabancaria
DROP TABLE IF EXISTS `cuentabancaria`;
CREATE TABLE IF NOT EXISTS `cuentabancaria` (
  `idCuentaBancaria` int(10) DEFAULT NULL,
  `sucursalBancaria` varchar(10) DEFAULT NULL,
  `numeroCuenta` varchar(10) DEFAULT NULL,
  `dc` varchar(10) DEFAULT NULL,
  `saldo` double unsigned DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.


-- Dumping structure for table banco.entidadbancaria
DROP TABLE IF EXISTS `entidadbancaria`;
CREATE TABLE IF NOT EXISTS `entidadbancaria` (
  `idEntidad` int(10) DEFAULT NULL,
  `codigoEntidad` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL,
  `tipoEntidadBancaria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.


-- Dumping structure for table banco.movimientobancario
DROP TABLE IF EXISTS `movimientobancario`;
CREATE TABLE IF NOT EXISTS `movimientobancario` (
  `idMovimientoBancario` int(10) DEFAULT NULL,
  `tipoMovimientoBancario` varchar(50) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `saldoTotal` int(11) DEFAULT NULL,
  `concepto` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.


-- Dumping structure for table banco.sucursalbancaria
DROP TABLE IF EXISTS `sucursalbancaria`;
CREATE TABLE IF NOT EXISTS `sucursalbancaria` (
  `idSucursalBancaria` int(10) DEFAULT NULL,
  `entidadBancaria` varchar(50) DEFAULT NULL,
  `codigoSucursal` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
