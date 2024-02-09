-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: qa
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `currency`
--

DROP TABLE IF EXISTS `currency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `currency` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `from_currency` varchar(255) DEFAULT NULL,
  `name_from` varchar(255) DEFAULT NULL,
  `nameto` varchar(255) DEFAULT NULL,
  `to_currency` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currency`
--

LOCK TABLES `currency` WRITE;
/*!40000 ALTER TABLE `currency` DISABLE KEYS */;
INSERT INTO `currency` VALUES (1,'AED','United Arab Emirates Dirham','United Arab Emirates Dirham','AED'),(2,'AFN','Afghan Afghani','Afghan Afghani','AFN'),(3,'ALL','Albanian Lek','Albanian Lek','ALL'),(4,'AMD','Armenian Dram','Armenian Dram','AMD'),(5,'ANG','Netherlands Antillian Guilder','Netherlands Antillian Guilder','ANG'),(6,'AOA','Angolan Kwanza','Angolan Kwanza','AOA'),(7,'ARS','Argentine Peso','Argentine Peso','ARS'),(8,'AWG','Aruban Florin','Aruban Florin','AWG'),(9,'AZN','Azerbaijani Manat','Azerbaijani Manat','AZN'),(10,'BAM','Bosnia and Herzegovina Mark','Bosnia and Herzegovina Mark','BAM'),(11,'BBD','Barbados Dollar','Barbados Dollar','BBD'),(12,'BDT','Bangladeshi Taka','Bangladeshi Taka','BDT'),(13,'BGN','Bulgarian Lev','Bulgarian Lev','BGN'),(14,'BHD','Bahraini Dinar','Bahraini Dinar','BHD'),(15,'BIF','Burundian Franc','Burundian Franc','BIF'),(16,'BMD','Bermudian Dollar','Bermudian Dollar','BMD'),(17,'BND','Brunei Dollar','Brunei Dollar','BND'),(18,'BOB','Bolivian Boliviano','Bolivian Boliviano','BOB'),(19,'BRL','Brazilian Real','Brazilian Real','BRL'),(20,'BSD','Bahamian Dollar','Bahamian Dollar','BSD'),(21,'BTN','Bhutanese Ngultrum','Bhutanese Ngultrum','BTN'),(22,'BYN','Belarusian Ruble','Belarusian Ruble','BYN'),(23,'BZD','Belize Dollar','Belize Dollar','BZD'),(24,'CAD','Canadian Dollar','Canadian Dollar','CAD'),(25,'CDF','Congolese Franc','Congolese Franc','CDF'),(26,'CHF','Swiss Franc','Swiss Franc','CHF'),(27,'CLP','Chilean Peso','Chilean Peso','CLP'),(28,'CNY','Chinese Renminbi','Chinese Renminbi','CNY'),(29,'COP','Colombian Peso','Colombian Peso','COP'),(30,'CRC','Costa Rican Colon','Costa Rican Colon','CRC'),(31,'CUP','Cuban Peso','Cuban Peso','CUP'),(32,'CVE','Cape Verdean Escudo','Cape Verdean Escudo','CVE'),(33,'CZK','Czech Koruna','Czech Koruna','CZK'),(34,'DJF','Djiboutian Franc','Djiboutian Franc','DJF'),(35,'DKK','Danish Krone','Danish Krone','DKK'),(36,'DOP','Dominican Peso','Dominican Peso','DOP'),(37,'DZD','Algerian Dinar','Algerian Dinar','DZD'),(38,'EGP','Egyptian Pound','Egyptian Pound','EGP'),(39,'ERN','Eritrean Nakfa','Eritrean Nakfa','ERN'),(40,'ETB','Ethiopian Birr','Ethiopian Birr','ETB'),(41,'EUR','Euro','Euro','EUR'),(42,'FJD','Fiji Dollar','Fiji Dollar','FJD'),(43,'FKP','Falkland Islands Pound','Falkland Islands Pound','FKP'),(44,'FOK','Faroese Króna','Faroese Króna','FOK'),(45,'GBP','Pound Sterling','Pound Sterling','GBP'),(46,'GEL','Georgian Lari','Georgian Lari','GEL'),(47,'GGP','Guernsey Pound','Guernsey Pound','GGP'),(48,'GHS','Ghanaian Cedi','Ghanaian Cedi','GHS'),(49,'GIP','Gibraltar Pound','Gibraltar Pound','GIP'),(50,'GMD','Gambian Dalasi','Gambian Dalasi','GMD'),(51,'GNF','Guinean Franc','Guinean Franc','GNF'),(52,'GTQ','Guatemalan Quetzal','Guatemalan Quetzal','GTQ'),(53,'GYD','Guyanese Dollar','Guyanese Dollar','GYD'),(54,'HKD','Hong Kong Dollar','Hong Kong Dollar','HKD'),(55,'HNL','Honduran Lempira','Honduran Lempira','HNL'),(56,'HRK','Croatian Kuna','Croatian Kuna','HRK'),(57,'HTG','Haitian Gourde','Haitian Gourde','HTG'),(58,'HUF','Hungarian Forint','Hungarian Forint','HUF'),(59,'IDR','Indonesian Rupiah','Indonesian Rupiah','IDR'),(60,'ILS','Israeli New Shekel','Israeli New Shekel','ILS'),(61,'IMP','Manx Pound','Manx Pound','IMP'),(62,'INR','Indian Rupee','Indian Rupee','INR'),(63,'IQD','Iraqi Dinar','Iraqi Dinar','IQD'),(64,'IRR','Iranian Rial','Iranian Rial','IRR'),(65,'ISK','Icelandic Króna','Icelandic Króna','ISK'),(66,'JEP','Jersey Pound','Jersey Pound','JEP'),(67,'JMD','Jamaican Dollar','Jamaican Dollar','JMD'),(68,'JOD','Jordanian Dinar','Jordanian Dinar','JOD'),(69,'JPY','Japanese Yen','Japanese Yen','JPY'),(70,'KES','Kenyan Shilling','Kenyan Shilling','KES'),(71,'KGS','Kyrgyzstani Som','Kyrgyzstani Som','KGS'),(72,'KHR','Cambodian Riel','Cambodian Riel','KHR'),(73,'KID','Kiribati Dollar','Kiribati Dollar','KID'),(74,'KMF','Comorian Franc','Comorian Franc','KMF'),(75,'KRW','South Korean Won','South Korean Won','KRW'),(76,'KWD','Kuwaiti Dinar','Kuwaiti Dinar','KWD'),(77,'KYD','Cayman Islands Dollar','Cayman Islands Dollar','KYD'),(78,'KZT','Kazakhstani Tenge','Kazakhstani Tenge','KZT'),(79,'LAK','Lao Kip','Lao Kip','LAK'),(80,'LBP','Lebanese Pound','Lebanese Pound','LBP'),(81,'LKR','Sri Lankan Rupee','Sri Lankan Rupee','LKR'),(82,'LRD','Liberian Dollar','Liberian Dollar','LRD'),(83,'LSL','Lesotho Loti','Lesotho Loti','LSL'),(84,'LYD','Libyan Dinar','Libyan Dinar','LYD'),(85,'MAD','Moroccan Dirham','Moroccan Dirham','MAD'),(86,'MDL','Moldovan Leu','Moldovan Leu','MDL'),(87,'MGA','Malagasy Ariary','Malagasy Ariary','MGA'),(88,'MKD','Macedonian Denar','Macedonian Denar','MKD'),(89,'MMK','Burmese Kyat','Burmese Kyat','MMK'),(90,'MNT','Mongolian Tögrög','Mongolian Tögrög','MNT'),(91,'MOP','Macanese Pataca','Macanese Pataca','MOP'),(92,'MRU','Mauritanian Ouguiya','Mauritanian Ouguiya','MRU'),(93,'MUR','Mauritian Rupee','Mauritian Rupee','MUR'),(94,'MVR','Maldivian Rufiyaa','Maldivian Rufiyaa','MVR'),(95,'MWK','Malawian Kwacha','Malawian Kwacha','MWK'),(96,'MXN','Mexican Peso','Mexican Peso','MXN'),(97,'MYR','Malaysian Ringgit','Malaysian Ringgit','MYR'),(98,'MZN','Mozambican Metical','Mozambican Metical','MZN'),(99,'NAD','Namibian Dollar','Namibian Dollar','NAD'),(100,'NGN','Nigerian Naira','Nigerian Naira','NGN'),(101,'NIO','Nicaraguan Córdoba','Nicaraguan Córdoba','NIO'),(102,'NOK','Norwegian Krone','Norwegian Krone','NOK'),(103,'NPR','Nepalese Rupee','Nepalese Rupee','NPR'),(104,'NZD','New Zealand Dollar','New Zealand Dollar','NZD'),(105,'OMR','Omani Rial','Omani Rial','OMR'),(106,'PAB','Panamanian Balboa','Panamanian Balboa','PAB'),(107,'PEN','Peruvian Sol','Peruvian Sol','PEN'),(108,'PGK','Papua New Guinean Kina','Papua New Guinean Kina','PGK'),(109,'PHP','Philippine Peso','Philippine Peso','PHP'),(110,'PKR','Pakistani Rupee','Pakistani Rupee','PKR'),(111,'PLN','Polish Złoty','Polish Złoty','PLN'),(112,'PYG','Paraguayan Guarani','Paraguayan Guarani','PYG'),(113,'QAR','Qatari Riyal','Qatari Riyal','QAR'),(114,'RON','Romanian Leu','Romanian Leu','RON'),(115,'RSD','Serbian Dinar','Serbian Dinar','RSD'),(116,'RUB','Russian Ruble','Russian Ruble','RUB'),(117,'RWF','Rwandan Franc','Rwandan Franc','RWF'),(118,'SAR','Saudi Riyal','Saudi Riyal','SAR'),(119,'SBD','Solomon Islands Dollar','Solomon Islands Dollar','SBD'),(120,'SCR','Seychellois Rupee','Seychellois Rupee','SCR'),(121,'SDG','Sudanese Pound','Sudanese Pound','SDG'),(122,'SEK','Swedish Krona','Swedish Krona','SEK'),(123,'SGD','Singapore Dollar','Singapore Dollar','SGD'),(124,'SHP','Saint Helena Pound','Saint Helena Pound','SHP'),(125,'SLL','Sierra Leonean Leone','Sierra Leonean Leone','SLL'),(126,'SOS','Somali Shilling','Somali Shilling','SOS'),(127,'SRD','Surinamese Dollar','Surinamese Dollar','SRD'),(128,'SSP','South Sudanese Pound','South Sudanese Pound','SSP'),(129,'SYP','Syrian Pound','Syrian Pound','SYP'),(130,'SZL','Swazi Lilangeni','Swazi Lilangeni','SZL'),(131,'THB','Thai Baht','Thai Baht','THB'),(132,'TJS','Tajikistani Somoni','Tajikistani Somoni','TJS'),(133,'TMT','Turkmenistan Manat','Turkmenistan Manat','TMT'),(134,'TND','Tunisian Dinar','Tunisian Dinar','TND'),(135,'TOP','Tongan Paʻanga','Tongan Paʻanga','TOP'),(136,'TRY','Turkish Lira','Turkish Lira','TRY'),(137,'TTD','Trinidad and Tobago Dollar','Trinidad and Tobago Dollar','TTD'),(138,'TWD','New Taiwan Dollar','New Taiwan Dollar','TWD'),(139,'TZS','Tanzanian Shilling','Tanzanian Shilling','TZS'),(140,'UAH','Ukrainian Hryvnia','Ukrainian Hryvnia','UAH'),(141,'UGX','Ugandan Shilling','Ugandan Shilling','UGX'),(142,'USD','United States Dollar','United States Dollar','USD'),(143,'UYU','Uruguayan Peso','Uruguayan Peso','UYU'),(144,'UZS','Uzbekistan Som','Uzbekistan Som','UZS'),(145,'VES','Venezuelan Bolívar','Venezuelan Bolívar','VES'),(146,'VND','Vietnamese Đồng','Vietnamese Đồng','VND'),(147,'VUV','Vanuatu Vatu','Vanuatu Vatu','VUV'),(148,'WST','Samoan Tala','Samoan Tala','WST'),(149,'XAF','Central African CFA Franc','Central African CFA Franc','XAF'),(150,'XCD','East Caribbean Dollar','East Caribbean Dollar','XCD'),(151,'XOF','West African CFA franc','West African CFA franc','XOF'),(152,'XPF','CFA Franc','CFA Franc','XPF'),(153,'YER','Yemeni Rial','Yemeni Rial','YER'),(154,'ZAR','South African Rand','South African Rand','ZAR'),(155,'ZMW','Zambian Kwacha','Zambian Kwacha','ZMW'),(156,'ZWL','Zimbabwean Dollar','Zimbabwean Dollar','ZWL');
/*!40000 ALTER TABLE `currency` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-19 19:43:56
