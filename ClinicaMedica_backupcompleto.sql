CREATE DATABASE  IF NOT EXISTS `clinicamedica` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `clinicamedica`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: clinicamedica
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `Medico_cpfMedico` varchar(11) NOT NULL,
  `Paciente_cpfPaciente` varchar(11) NOT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `fk_Consulta_Medico_idx` (`Medico_cpfMedico`),
  KEY `fk_Consulta_Paciente1_idx` (`Paciente_cpfPaciente`),
  CONSTRAINT `fk_Consulta_Medico` FOREIGN KEY (`Medico_cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Consulta_Paciente1` FOREIGN KEY (`Paciente_cpfPaciente`) REFERENCES `paciente` (`cpfPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultorio`
--

DROP TABLE IF EXISTS `consultorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultorio` (
  `numConsultorio` int(10) unsigned NOT NULL,
  `corredor` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`numConsultorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultorio`
--

LOCK TABLES `consultorio` WRITE;
/*!40000 ALTER TABLE `consultorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exame`
--

DROP TABLE IF EXISTS `exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exame` (
  `idExame` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  `valor` double unsigned NOT NULL,
  PRIMARY KEY (`idExame`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame`
--

LOCK TABLES `exame` WRITE;
/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `cpfMedico` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `especialidade` varchar(45) NOT NULL,
  `Consultorio_numConsultorio` int(10) unsigned NOT NULL,
  PRIMARY KEY (`cpfMedico`),
  UNIQUE KEY `cpfMedico_UNIQUE` (`cpfMedico`),
  KEY `fk_Medico_Consultorio1_idx` (`Consultorio_numConsultorio`),
  CONSTRAINT `fk_Medico_Consultorio1` FOREIGN KEY (`Consultorio_numConsultorio`) REFERENCES `consultorio` (`numConsultorio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_exame`
--

DROP TABLE IF EXISTS `medico_exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico_exame` (
  `Medico_cpfMedico` varchar(11) NOT NULL,
  `Exame_idExame` int(11) NOT NULL,
  PRIMARY KEY (`Medico_cpfMedico`,`Exame_idExame`),
  KEY `fk_Medico_has_Exame_Exame1_idx` (`Exame_idExame`),
  KEY `fk_Medico_has_Exame_Medico1_idx` (`Medico_cpfMedico`),
  CONSTRAINT `fk_Medico_has_Exame_Exame1` FOREIGN KEY (`Exame_idExame`) REFERENCES `exame` (`idExame`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Medico_has_Exame_Medico1` FOREIGN KEY (`Medico_cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_exame`
--

LOCK TABLES `medico_exame` WRITE;
/*!40000 ALTER TABLE `medico_exame` DISABLE KEYS */;
/*!40000 ALTER TABLE `medico_exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `cpfPaciente` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `Medico_cpfMedico` varchar(11) NOT NULL,
  PRIMARY KEY (`cpfPaciente`),
  UNIQUE KEY `cpfPaciente_UNIQUE` (`cpfPaciente`),
  KEY `fk_Paciente_Medico1_idx` (`Medico_cpfMedico`),
  CONSTRAINT `fk_Paciente_Medico1` FOREIGN KEY (`Medico_cpfMedico`) REFERENCES `medico` (`cpfMedico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente_exame`
--

DROP TABLE IF EXISTS `paciente_exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente_exame` (
  `Paciente_cpfPaciente` varchar(11) NOT NULL,
  `Exame_idExame` int(11) NOT NULL,
  PRIMARY KEY (`Paciente_cpfPaciente`,`Exame_idExame`),
  KEY `fk_Paciente_has_Exame_Exame1_idx` (`Exame_idExame`),
  KEY `fk_Paciente_has_Exame_Paciente1_idx` (`Paciente_cpfPaciente`),
  CONSTRAINT `fk_Paciente_has_Exame_Exame1` FOREIGN KEY (`Exame_idExame`) REFERENCES `exame` (`idExame`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Paciente_has_Exame_Paciente1` FOREIGN KEY (`Paciente_cpfPaciente`) REFERENCES `paciente` (`cpfPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente_exame`
--

LOCK TABLES `paciente_exame` WRITE;
/*!40000 ALTER TABLE `paciente_exame` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente_exame` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-02 17:03:11
