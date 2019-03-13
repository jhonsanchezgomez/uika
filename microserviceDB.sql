CREATE DATABASE  IF NOT EXISTS `db_microservice` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_microservice`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: db_microservice
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.37-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_mascotas`
--

DROP TABLE IF EXISTS `tbl_mascotas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_mascotas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `raza` varchar(45) NOT NULL,
  `tbl_tipo_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tbl_mascotas_tbl_tipo_idx` (`tbl_tipo_id`),
  CONSTRAINT `fk_tbl_mascotas_tbl_tipo` FOREIGN KEY (`tbl_tipo_id`) REFERENCES `tbl_tipo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mascotas`
--

LOCK TABLES `tbl_mascotas` WRITE;
/*!40000 ALTER TABLE `tbl_mascotas` DISABLE KEYS */;
INSERT INTO `tbl_mascotas` VALUES (1,'Federico','Macho',2,'Pitbull',2),(2,'Pepunia','Hembra',3,'Mini Rex',3);
/*!40000 ALTER TABLE `tbl_mascotas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tipo`
--

DROP TABLE IF EXISTS `tbl_tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_tipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tipo`
--

LOCK TABLES `tbl_tipo` WRITE;
/*!40000 ALTER TABLE `tbl_tipo` DISABLE KEYS */;
INSERT INTO `tbl_tipo` VALUES (1,'Gato'),(2,'Perro'),(3,'Conejo');
/*!40000 ALTER TABLE `tbl_tipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-13 10:53:26
