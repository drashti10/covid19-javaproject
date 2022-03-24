-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2020 at 07:26 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `corona_statistics`
--

-- --------------------------------------------------------

--
-- Table structure for table `statistic`
--

CREATE TABLE `statistic` (
  `State` varchar(40) DEFAULT NULL,
  `TotalCases` int(7) DEFAULT NULL,
  `NewCases` int(4) DEFAULT NULL,
  `TotalDeaths` int(5) DEFAULT NULL,
  `NewDeaths` int(2) DEFAULT NULL,
  `TotalRecovered` int(6) DEFAULT NULL,
  `ActiveCases` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `statistic`
--

INSERT INTO `statistic` (`State`, `TotalCases`, `NewCases`, `TotalDeaths`, `NewDeaths`, `TotalRecovered`, `ActiveCases`) VALUES
('Maharashtra', 1145840, 10, 31351, 0, 812354, 301752),
('Andhra Pradesh', 601462, 10, 5177, 0, 508088, 88197),
('Tamil Nadu', 525420, 10, 8618, 0, 470192, 46610),
('Karnataka', 494356, 10, 7629, 0, 383077, 103631),
('Uttar Pradesh', 336294, 10, 4771, 0, 263288, 68235),
('Delhi', 234701, 10, 4877, 0, 198103, 31721),
('West Bengal', 215580, 10, 4183, 0, 187061, 24336),
('Odisha', 167161, 10, 722, 0, 133466, 32973),
('Telangana', 167046, 2043, 1016, 11, 135357, 30673),
('Bihar', 164224, 10, 855, 0, 149722, 13646),
('Assam', 150349, 10, 528, 0, 121610, 28208),
('Kerala', 122216, 10, 490, 0, 87341, 34315),
('Gujarat', 119088, 10, 3271, 0, 99908, 15909),
('Rajasthan', 109473, 10, 1293, 0, 90685, 17495),
('Haryana', 103773, 10, 1069, 0, 81690, 21014),
('Madhya Pradesh', 97906, 10, 1877, 0, 74398, 21631),
('Punjab', 90032, 10, 2646, 0, 65818, 21568),
('Chhattisgarh', 77775, 10, 628, 0, 41111, 36036),
('Jharkhand', 67100, 10, 590, 0, 52807, 13703),
('Jammu and Kashmir', 59711, 10, 951, 0, 38521, 20239),
('Uttarakhand', 37139, 10, 460, 0, 24810, 11714),
('Goa', 26783, 10, 327, 0, 20844, 5612),
('Puducherry', 21428, 10, 431, 0, 16253, 4744),
('Tripura', 20969, 273, 228, 6, 13559, 7160),
('Himachal Pradesh', 11190, 10, 97, 0, 6919, 4144),
('Chandigarh', 9256, 10, 106, 0, 6062, 3085),
('Manipur', 8430, 10, 51, 0, 6539, 1840),
('Arunachal Pradesh', 6851, 10, 13, 0, 4967, 1871),
('Nagaland', 5306, 10, 10, 0, 4079, 1193),
('Meghalaya', 4357, 10, 32, 0, 2342, 1983),
('Andaman and Nicobar Islands', 3604, 10, 52, 0, 3378, 174),
('Ladakh', 3576, 10, 47, 0, 2558, 971),
('Dadra and Nagar Haveli and Daman and Diu', 2827, 10, 2, 0, 2588, 210),
('Sikkim', 2274, 10, 23, 0, 1789, 462),
('Mizoram', 1534, 28, 0, 0, 949, 585),
('Dadra and Nagar Haveli', 1, 1, 0, 0, 0, 1),
('Daman and Diu', 0, 10, 0, 0, 0, 0),
('Lakshadweep', 0, 10, 0, 0, 0, 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
