-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-08-2022 a las 04:15:03
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `puertosoft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `IdBol` int(7) NOT NULL,
  `VentBol` int(7) NOT NULL,
  `IdCliBol` int(4) DEFAULT NULL,
  `NumBol` varchar(11) NOT NULL,
  `FechBol` timestamp NOT NULL DEFAULT current_timestamp(),
  `EstRegBol` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `IdCat` int(2) NOT NULL,
  `NomCat` varchar(20) NOT NULL,
  `EstRegCat` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`IdCat`, `NomCat`, `EstRegCat`) VALUES
(1, 'CEVICHES Y FRIOS', 'A'),
(2, 'PIQUEOS', 'A'),
(3, 'CHICHARRONES Y PESCA', 'A'),
(4, 'ARROCES Y PASTAS', 'A'),
(5, 'CRIOLLO', 'A'),
(6, 'CALDOS Y CHUPES', 'A'),
(7, 'BEBIDAS', 'A'),
(8, 'BAR', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCli` int(4) NOT NULL,
  `NomCli` varchar(20) NOT NULL,
  `ApeCli` varchar(40) NOT NULL,
  `DirCli` varchar(60) NOT NULL,
  `DniCli` varchar(8) NOT NULL,
  `RaSoCli` varchar(20) NOT NULL,
  `RucFacCli` varchar(11) NOT NULL,
  `EmailCli` varchar(20) NOT NULL,
  `TelCli` varchar(10) NOT NULL,
  `EstRegCli` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`IdCli`, `NomCli`, `ApeCli`, `DirCli`, `DniCli`, `RaSoCli`, `RucFacCli`, `EmailCli`, `TelCli`, `EstRegCli`) VALUES
(1, 'PRuebaaa', 'Prueba2', 'Asd', '46125312', 'ASd', '512331222', 'ASd@gmai.com', '461232', 'A'),
(2, 'Franco', 'asd', '0303033', 'prueba', 'asd@gmail.com', 'a1033000', 'asdad@gmail.com', 'asdad', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_mesa`
--

CREATE TABLE `estado_mesa` (
  `EstMesCod` int(1) NOT NULL,
  `EstMesDes` varchar(10) NOT NULL,
  `EstMesEstReg` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_mesa`
--

INSERT INTO `estado_mesa` (`EstMesCod`, `EstMesDes`, `EstMesEstReg`) VALUES
(1, 'Disponible', 'A'),
(2, 'EnCocina', 'A'),
(3, 'Despachada', 'A'),
(4, 'Indisuesta', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_pedido`
--

CREATE TABLE `estado_pedido` (
  `EstPedCod` int(1) NOT NULL,
  `EstPedDes` varchar(10) NOT NULL,
  `EstPedEstReg` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_pedido`
--

INSERT INTO `estado_pedido` (`EstPedCod`, `EstPedDes`, `EstPedEstReg`) VALUES
(1, 'EnCocina', 'A'),
(2, 'EnMesa', 'A'),
(3, 'Cobrado', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_registro`
--

CREATE TABLE `estado_registro` (
  `EstRegCod` varchar(1) NOT NULL,
  `EstRegDes` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_registro`
--

INSERT INTO `estado_registro` (`EstRegCod`, `EstRegDes`) VALUES
('*', 'Eliminado'),
('A', 'Activo'),
('I', 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `IdFac` int(7) NOT NULL,
  `VentFac` int(7) NOT NULL,
  `NumFac` varchar(11) NOT NULL,
  `IdCliFac` int(4) DEFAULT NULL,
  `FechFac` timestamp NOT NULL DEFAULT current_timestamp(),
  `EstRegFac` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `IdMe` int(2) NOT NULL,
  `NumMe` varchar(7) NOT NULL,
  `EstMe` int(1) DEFAULT NULL,
  `EstRegMe` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`IdMe`, `NumMe`, `EstMe`, `EstRegMe`) VALUES
(1, 'L1', 3, 'A'),
(2, 'L2', 3, 'A'),
(3, 'L3', 1, 'A'),
(4, 'L4', 1, 'A'),
(5, 'L5', 1, 'A'),
(6, 'L6', 1, 'A'),
(7, 'L7', 1, 'A'),
(8, 'L8', 1, 'A'),
(9, 'L9', 1, 'A'),
(10, 'L10', 1, 'A'),
(11, 'L11', 1, 'A'),
(12, 'L12', 1, 'A'),
(13, 'L13', 1, 'A'),
(14, 'L14', 1, 'A'),
(15, 'L15', 1, 'A'),
(16, 'P1', 1, 'A'),
(17, 'P2', 1, 'A'),
(18, 'P3', 1, 'A'),
(19, 'P4', 1, 'A'),
(20, 'P5', 1, 'A'),
(21, 'P6', 1, 'A'),
(22, 'P7', 1, 'A'),
(23, 'P8', 1, 'A'),
(24, 'P9', 1, 'A'),
(25, 'P10', 1, 'A'),
(26, 'T1', 1, 'A'),
(27, 'T2', 1, 'A'),
(28, 'T3', 1, 'A'),
(29, 'T4', 1, 'A'),
(30, 'T5', 1, 'A'),
(31, 'T6', 1, 'A'),
(32, 'T7', 1, 'A'),
(33, 'T8', 1, 'A'),
(34, 'T9', 1, 'A'),
(35, 'T10', 1, 'A'),
(36, 'P11', 1, 'A'),
(37, 'P12', 1, 'A'),
(38, 'P13', 1, 'A'),
(39, 'P14', 1, 'A'),
(40, 'P15', 1, 'A'),
(41, 'T11', 1, 'A'),
(42, 'T12', 1, 'A'),
(43, 'T13', 1, 'A'),
(44, 'T14', 1, 'A'),
(45, 'T15', 1, 'A'),
(46, 'T16', 1, 'A'),
(47, 'T17', 1, 'A'),
(48, 'T18', 3, 'A'),
(49, 'SALLE', 1, 'A'),
(50, 'NEGRA', 1, 'A'),
(51, 'DOSYDO', 1, 'A'),
(52, 'BLUSKN', 1, 'A'),
(53, 'PLECHE', 1, 'A'),
(54, 'TOTTEM', 1, 'A'),
(55, 'JUNIOR', 1, 'A'),
(56, 'PIBES', 1, 'A'),
(57, 'DIFESU', 1, 'A'),
(58, 'SIGMA', 1, 'A'),
(59, 'TRIBUN', 1, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota_venta`
--

CREATE TABLE `nota_venta` (
  `CodNotVen` int(7) NOT NULL,
  `IdVenNotVen` int(7) DEFAULT NULL,
  `FecNotVen` timestamp NOT NULL DEFAULT current_timestamp(),
  `EstRegNotVen` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `IdPed` int(7) NOT NULL,
  `TotalPed` decimal(11,2) NOT NULL,
  `VenPed` int(7) DEFAULT NULL,
  `MesaPed` int(2) DEFAULT NULL,
  `UsuPed` int(3) DEFAULT NULL,
  `EstPed` int(1) NOT NULL,
  `MozoPed` varchar(10) NOT NULL,
  `EspPed` varchar(150) NOT NULL,
  `EstRegPed` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`IdPed`, `TotalPed`, `VenPed`, `MesaPed`, `UsuPed`, `EstPed`, `MozoPed`, `EspPed`, `EstRegPed`) VALUES
(141, '28.00', 63, NULL, NULL, 3, 'juan', '', 'A'),
(142, '28.00', 65, NULL, NULL, 3, 'juan2', '', 'A'),
(143, '27.00', 62, NULL, NULL, 3, 'juan', '', 'A'),
(144, '56.00', 67, NULL, NULL, 3, 'juan', '', 'A'),
(145, '27.00', 1000, NULL, NULL, 3, 'asd', '', 'A'),
(146, '55.00', 57, NULL, NULL, 3, 'juan', '', 'A'),
(147, '10.00', 58, NULL, NULL, 3, 'JOJO', '', 'A'),
(148, '81.00', 59, NULL, NULL, 3, 'juan', '', 'A'),
(149, '45.00', 66, NULL, NULL, 3, 'paul', '1\n2\n3\n4\n5\n6\n7', 'A'),
(150, '27.00', 61, NULL, NULL, 3, 'paul', '1\n2\n3\n4\n5\n6\n7\n8\n', 'A'),
(151, '27.00', 60, NULL, NULL, 3, 'paul', 'Ceviche con pesacado \nCebvicha cob mariscos\nCeviche con trasteros\nCeviche con agua \nCeviche con sal', 'A'),
(152, '27.00', 64, NULL, NULL, 3, 'asd', 'ddddddddddddddddddddddddddddddddddddddddd45dd', 'A'),
(153, '56.00', 1003, NULL, NULL, 3, 'papa', 'sdfasdasdad\nadadasdsadasd\n\nasdasdsad\nasdasdasdasd\nasdasdasd\nasdasdasd', 'A'),
(154, '45.00', 1001, NULL, NULL, 3, 'p', '', 'A'),
(155, '36.00', 1002, NULL, NULL, 3, 'w', '', 'A'),
(156, '28.00', 1004, NULL, NULL, 3, 'cris', '', 'A'),
(157, '28.00', 1005, NULL, NULL, 3, 'oapa', '', 'A'),
(158, '54.00', 1006, NULL, NULL, 2, 'jasper', '', 'A'),
(159, '17.00', NULL, 1, NULL, 2, 'Pipo', '', 'A'),
(160, '27.00', NULL, 48, NULL, 2, 'paolo', '', 'A'),
(161, '27.00', NULL, 2, NULL, 2, 'pablo', 'QUiero pastra\nadicionales a favot\nen contra\n1\n2\n3\n4\n45\n6\n7\n', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_detalle`
--

CREATE TABLE `pedido_detalle` (
  `DetPedId` int(7) NOT NULL,
  `IdDetPed` int(7) NOT NULL,
  `IdProDetPed` int(3) NOT NULL,
  `CantDetPed` int(3) NOT NULL,
  `ValDetPed` decimal(11,2) NOT NULL,
  `FecDetPed` timestamp NOT NULL DEFAULT current_timestamp(),
  `EstRegDetPed` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido_detalle`
--

INSERT INTO `pedido_detalle` (`DetPedId`, `IdDetPed`, `IdProDetPed`, `CantDetPed`, `ValDetPed`, `FecDetPed`, `EstRegDetPed`) VALUES
(189, 141, 3, 1, '28.00', '2022-03-31 15:53:45', 'A'),
(190, 142, 3, 1, '28.00', '2022-03-31 15:54:36', 'A'),
(191, 143, 4, 1, '27.00', '2022-03-31 15:56:17', 'A'),
(192, 144, 3, 1, '28.00', '2022-03-31 16:00:07', 'A'),
(193, 144, 6, 1, '28.00', '2022-03-31 16:00:07', 'A'),
(194, 145, 7, 1, '27.00', '2022-03-31 16:01:34', 'A'),
(197, 146, 4, 1, '27.00', '2022-03-31 18:15:22', 'A'),
(198, 146, 8, 1, '28.00', '2022-03-31 18:15:22', 'A'),
(200, 147, 64, 5, '10.00', '2022-03-31 20:27:59', 'A'),
(201, 148, 4, 1, '27.00', '2022-04-12 19:12:24', 'A'),
(202, 148, 6, 1, '28.00', '2022-04-12 19:12:24', 'A'),
(203, 148, 1, 1, '26.00', '2022-04-12 19:12:24', 'A'),
(204, 149, 2, 1, '17.00', '2022-04-13 16:08:59', 'A'),
(205, 149, 6, 1, '28.00', '2022-04-13 16:08:59', 'A'),
(206, 150, 4, 1, '27.00', '2022-04-13 16:10:54', 'A'),
(207, 151, 4, 1, '27.00', '2022-04-13 16:12:11', 'A'),
(208, 152, 4, 1, '27.00', '2022-04-13 16:14:12', 'A'),
(209, 153, 6, 1, '28.00', '2022-04-13 16:48:08', 'A'),
(210, 153, 8, 1, '28.00', '2022-04-13 16:48:08', 'A'),
(211, 154, 5, 1, '18.00', '2022-05-07 15:30:19', 'A'),
(212, 154, 7, 1, '27.00', '2022-05-07 15:30:19', 'A'),
(213, 155, 5, 1, '18.00', '2022-05-07 15:31:16', 'A'),
(214, 155, 5, 1, '18.00', '2022-05-07 15:31:16', 'A'),
(215, 155, 4, 1, '27.00', '2022-05-07 15:51:17', 'A'),
(216, 156, 3, 1, '28.00', '2022-05-07 15:53:19', 'A'),
(217, 157, 3, 1, '28.00', '2022-05-07 16:12:01', 'A'),
(218, 158, 4, 1, '27.00', '2022-05-07 16:12:51', 'A'),
(219, 158, 7, 1, '27.00', '2022-05-07 16:12:51', 'A'),
(220, 159, 2, 1, '17.00', '2022-06-06 12:32:55', 'A'),
(221, 160, 4, 1, '27.00', '2022-06-06 12:45:38', 'A'),
(222, 161, 4, 1, '27.00', '2022-06-06 12:54:19', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `IdPro` int(3) NOT NULL,
  `NomPro` varchar(50) NOT NULL,
  `DesPro` varchar(60) NOT NULL,
  `PrecPro` decimal(11,2) NOT NULL,
  `CatProCod` int(2) DEFAULT NULL,
  `EstRegPro` varchar(1) NOT NULL,
  `StockPro` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`IdPro`, `NomPro`, `DesPro`, `PrecPro`, `CatProCod`, `EstRegPro`, `StockPro`) VALUES
(1, 'CEVICHE PESCADO', '', '26.00', 1, 'A', 0),
(2, 'CEVICHE DE PESCADO JUNIOR', '', '17.00', 1, 'A', 0),
(3, 'CEVICHE PESCADO EN CREMAS', '', '28.00', 1, 'A', 0),
(4, 'CEVICHE MIXTO', '', '27.00', 1, 'A', 0),
(5, 'CEVICHE MIXTO JUNIOR', '', '18.00', 1, 'A', 0),
(6, 'CEVICHE MIXTO EN CREMAS', '', '28.00', 1, 'A', 0),
(7, 'TIRADITO NIKEY', '', '27.00', 1, 'A', 0),
(8, 'TIRADITO EN CREMAS', '', '28.00', 1, 'A', 0),
(9, 'LECHE DE TIGRE (12 ONZAS)', '', '16.00', 1, 'A', 0),
(10, 'JUNIOR (8 ONZAS)', '', '9.00', 1, 'A', 0),
(11, 'RONDA FRIA (CEVICHE, TIRADITO Y CAUSAS)', '', '45.00', 2, 'A', 0),
(12, 'PULPO AL OLIVO', '', '27.00', 2, 'A', 0),
(13, 'CHORITOS A LA CHALACA', '', '17.00', 2, 'A', 0),
(14, 'TEQUEÑOS DE MARISCO', '', '24.00', 2, 'A', 0),
(15, 'TEQUEÑOS DE QUESO', '', '22.00', 2, 'A', 0),
(16, 'YUCAS FRITAS CROCANTES', '', '15.00', 2, 'A', 0),
(17, 'CAUSA CROCANTE CON PULPO AL OLIVO', '', '32.00', 2, 'A', 0),
(18, 'CAUSA DE PESCADO', '', '24.00', 2, 'A', 0),
(19, 'RONDA CALIENTE (PARA 4)', '', '55.00', 2, 'A', 0),
(20, 'AMERICANO MARINO (PARA 5)', '', '85.00', 2, 'A', 0),
(21, 'DOBLE MARINO (AL GUSTO)', '', '32.00', 2, 'A', 0),
(22, 'TRIPLE MARINO', '', '45.00', 2, 'A', 0),
(23, 'CHICHARRON DE CALAMAR', '', '30.00', 3, 'A', 0),
(24, 'CHICHARRON DE PESCADO', '', '26.00', 3, 'A', 0),
(25, 'CHICHARRON MIXTO', '', '28.00', 3, 'A', 0),
(26, 'PESCADO FRITO', '', '24.00', 3, 'A', 0),
(27, 'PESCADO AL AJO', '', '30.00', 3, 'A', 0),
(28, 'PESCADO A LA MEUNIERE', '', '30.00', 3, 'A', 0),
(29, 'PESCADO ALA CHORRILLANA', '', '30.00', 3, 'A', 0),
(30, 'PESCADO A LO MACHO', '', '34.00', 3, 'A', 0),
(31, 'PESCADO SALTADO', '', '26.00', 3, 'A', 0),
(32, 'ARROZ DE MARISCO', '', '27.00', 4, 'A', 0),
(33, 'MEDIO ARROZ DE MARISCO', '', '18.00', 4, 'A', 0),
(34, 'CHAUFA DE PESCADO', '', '25.00', 4, 'A', 0),
(35, 'MEDIO CHAUFA DE PESCADO', '', '17.00', 4, 'A', 0),
(36, 'CHAUFA DE MARISCOS', '', '28.00', 4, 'A', 0),
(37, 'FETUCCINI CON MARISCOS', '', '30.00', 4, 'A', 0),
(38, 'FETUCCINI CON LOMO SALTADO', '', '32.00', 4, 'A', 0),
(39, 'LOMO SALTADO PUERTO SOL', '', '28.00', 5, 'A', 0),
(40, 'MILANESA DE POLLO PUERTO SOL', '', '26.00', 5, 'A', 0),
(41, 'PARIHUELA PUERTO SOL', '', '33.00', 6, 'A', 0),
(42, 'SUDADO DE PESCADO', '', '30.00', 6, 'A', 0),
(43, 'CHILCANO', '', '23.00', 6, 'A', 0),
(44, 'LIMONADA', '', '14.00', 7, 'A', 0),
(45, 'CHICHA MORADA', '', '14.00', 7, 'A', 0),
(46, 'PISCO SOUR', '', '15.00', 7, 'A', 0),
(47, 'LIMONADA FROZEN', '', '16.00', 7, 'A', 0),
(48, 'CHILCANO PISCO', '', '14.00', 7, 'A', 0),
(49, 'GASEOSA PERSONAL ', '', '2.00', 8, 'A', 0),
(50, 'GASEOSA 1/2 L', '', '3.00', 8, 'A', 0),
(51, 'GASEOSA ZERO', '', '3.50', 8, 'A', 0),
(52, 'CERVEZA PILSEN GRANDE', '', '7.50', 8, 'A', -1),
(53, 'CERVEZA AREQUIPEÑA GRANDE', '', '7.50', 8, 'A', 0),
(54, 'CERVEZA CUZQUEÑA TRIGO', '', '8.00', 8, 'A', -4),
(55, 'CERVEZA MALTA GRANDE', '', '9.00', 8, 'A', -2),
(56, 'CERVEZA ARTESANAL', '', '15.00', 8, 'A', -2),
(57, 'AGUA DE 1/2 L', '', '1.60', 8, 'A', 0),
(58, 'COCA COLA DE 1L', '', '7.00', 8, 'A', -4),
(59, 'INCA KOLA DE 1L', '', '7.00', 8, 'A', 0),
(60, 'GASEOSAS DE 2L ', '', '12.00', 8, 'A', 0),
(61, 'ESCOCESA DE 1.5L', '', '11.00', 8, 'A', 0),
(62, 'PILSEN PERSONAL ', '', '5.00', 8, 'A', 0),
(63, 'MALTA PERSONAL ', '', '5.50', 8, 'A', 0),
(64, 'CIGARRO', '', '2.00', 8, 'A', 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regcaja`
--

CREATE TABLE `regcaja` (
  `IdReg` int(3) NOT NULL,
  `CantReg` double(11,2) NOT NULL,
  `FechReg` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regstock`
--

CREATE TABLE `regstock` (
  `IdStock` int(4) NOT NULL,
  `IdProStock` int(3) NOT NULL,
  `CantStock` int(3) NOT NULL,
  `FechStock` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `regstock`
--

INSERT INTO `regstock` (`IdStock`, `IdProStock`, `CantStock`, `FechStock`) VALUES
(7, 64, 50, '2022-03-31 20:26:49');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `IdRol` int(2) NOT NULL,
  `DesRol` varchar(20) NOT NULL,
  `EstRegRol` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`IdRol`, `DesRol`, `EstRegRol`) VALUES
(1, 'Administrador', 'A'),
(2, 'Cajero', 'A'),
(3, 'Cocinero ', 'A'),
(4, 'Mozo', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago`
--

CREATE TABLE `tipo_pago` (
  `CodTiPa` int(4) NOT NULL,
  `NomTiPa` varchar(20) NOT NULL,
  `IdVenTiPa` int(7) NOT NULL,
  `CantTiPa` double(11,2) NOT NULL,
  `EstRegTiPa` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_pago`
--

INSERT INTO `tipo_pago` (`CodTiPa`, `NomTiPa`, `IdVenTiPa`, `CantTiPa`, `EstRegTiPa`) VALUES
(30, 'EFECTIVO', 57, 55.00, 'A'),
(31, 'EFECTIVO', 58, 10.00, 'A'),
(32, 'EFECTIVO', 59, 81.00, 'A'),
(33, 'EFECTIVO', 61, 27.00, 'A'),
(34, 'EFECTIVO', 60, 27.00, 'A'),
(35, 'VISA', 62, 27.00, 'A'),
(37, 'VISA', 63, 28.00, 'A'),
(38, 'EFECTIVO', 64, 27.00, 'A'),
(39, 'EFECTIVO', 65, 28.00, 'A'),
(40, 'EFECTIVO', 66, 45.00, 'A'),
(41, 'EFECTIVO', 1001, 45.00, 'A'),
(42, 'EFECTIVO', 1002, 36.00, 'A'),
(43, 'EFECTIVO', 1003, 56.00, 'A'),
(44, 'EFECTIVO', 1004, 28.00, 'A'),
(45, 'EFECTIVO', 1005, 28.00, 'A'),
(46, 'EFECTIVO', 1006, 54.00, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `IdUsu` int(3) NOT NULL,
  `NomUsu` varchar(20) NOT NULL,
  `ApeUsu` varchar(40) DEFAULT NULL,
  `DirUsu` varchar(60) DEFAULT NULL,
  `DniUsu` varchar(8) NOT NULL,
  `EmaUsu` varchar(50) DEFAULT NULL,
  `IdLogUsu` varchar(20) NOT NULL,
  `ContrUsu` varchar(255) NOT NULL,
  `RolUsu` int(2) DEFAULT NULL,
  `EstRegUsu` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`IdUsu`, `NomUsu`, `ApeUsu`, `DirUsu`, `DniUsu`, `EmaUsu`, `IdLogUsu`, `ContrUsu`, `RolUsu`, `EstRegUsu`) VALUES
(1, 'Administrador', NULL, NULL, '12345678', NULL, 'admin', 'puertosol123', 1, 'A'),
(2, 'Cajero1', NULL, NULL, '44455544', NULL, 'cajero1', 'cajero1', 2, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `IdVent` int(7) NOT NULL,
  `FechaVent` timestamp NOT NULL DEFAULT current_timestamp(),
  `PrecTotVent` decimal(11,2) NOT NULL,
  `UsuVent` int(3) DEFAULT NULL,
  `DescVent` double(11,2) DEFAULT NULL,
  `EstRegVent` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`IdVent`, `FechaVent`, `PrecTotVent`, `UsuVent`, `DescVent`, `EstRegVent`) VALUES
(57, '2022-03-31 18:15:37', '55.00', NULL, 0.00, 'A'),
(58, '2022-03-31 20:28:27', '10.00', NULL, 0.00, 'A'),
(59, '2022-04-12 19:15:33', '81.00', NULL, 0.00, 'A'),
(60, '2022-04-13 16:16:34', '27.00', NULL, 0.00, 'A'),
(61, '2022-04-13 16:17:14', '27.00', NULL, 0.00, 'A'),
(62, '2022-04-13 16:18:21', '27.00', NULL, 0.00, 'A'),
(63, '2022-04-13 16:40:50', '28.00', NULL, 0.00, 'A'),
(64, '2022-04-13 16:45:26', '27.00', NULL, 0.00, 'A'),
(65, '2022-04-13 16:48:35', '28.00', NULL, 0.00, 'A'),
(66, '2022-04-13 16:48:50', '45.00', NULL, 0.00, 'A'),
(67, '2022-05-07 14:49:54', '56.00', NULL, 0.00, 'A'),
(1000, '2022-05-07 14:54:14', '27.00', NULL, 0.00, 'A'),
(1001, '2022-05-07 16:09:58', '45.00', NULL, 0.00, 'A'),
(1002, '2022-05-07 16:10:09', '36.00', NULL, 0.00, 'A'),
(1003, '2022-05-07 16:10:26', '56.00', NULL, 0.00, 'A'),
(1004, '2022-05-07 16:10:37', '28.00', NULL, 0.00, 'A'),
(1005, '2022-05-07 16:12:13', '28.00', NULL, 0.00, 'A'),
(1006, '2022-05-07 16:13:06', '54.00', NULL, 0.00, 'A');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`IdBol`),
  ADD KEY `VentBol` (`VentBol`),
  ADD KEY `IdCliBol` (`IdCliBol`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`IdCat`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCli`);

--
-- Indices de la tabla `estado_mesa`
--
ALTER TABLE `estado_mesa`
  ADD PRIMARY KEY (`EstMesCod`);

--
-- Indices de la tabla `estado_pedido`
--
ALTER TABLE `estado_pedido`
  ADD PRIMARY KEY (`EstPedCod`);

--
-- Indices de la tabla `estado_registro`
--
ALTER TABLE `estado_registro`
  ADD PRIMARY KEY (`EstRegCod`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`IdFac`),
  ADD KEY `VentFac` (`VentFac`),
  ADD KEY `IdCliFac` (`IdCliFac`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`IdMe`),
  ADD KEY `EstMe` (`EstMe`);

--
-- Indices de la tabla `nota_venta`
--
ALTER TABLE `nota_venta`
  ADD PRIMARY KEY (`CodNotVen`),
  ADD KEY `IdVenNotVen` (`IdVenNotVen`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`IdPed`),
  ADD KEY `VenPed` (`VenPed`),
  ADD KEY `MesaPed` (`MesaPed`),
  ADD KEY `UsuPed` (`UsuPed`),
  ADD KEY `EstPed` (`EstPed`);

--
-- Indices de la tabla `pedido_detalle`
--
ALTER TABLE `pedido_detalle`
  ADD PRIMARY KEY (`DetPedId`),
  ADD KEY `IdDetPed` (`IdDetPed`),
  ADD KEY `IdProDetPed` (`IdProDetPed`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`IdPro`),
  ADD KEY `CatProCod` (`CatProCod`);

--
-- Indices de la tabla `regcaja`
--
ALTER TABLE `regcaja`
  ADD PRIMARY KEY (`IdReg`);

--
-- Indices de la tabla `regstock`
--
ALTER TABLE `regstock`
  ADD PRIMARY KEY (`IdStock`),
  ADD KEY `IdProStock` (`IdProStock`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`IdRol`);

--
-- Indices de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD PRIMARY KEY (`CodTiPa`),
  ADD KEY `IdVenTiPa` (`IdVenTiPa`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`IdUsu`),
  ADD KEY `RolUsu` (`RolUsu`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`IdVent`),
  ADD KEY `UsuVent` (`UsuVent`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `IdCat` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IdCli` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estado_mesa`
--
ALTER TABLE `estado_mesa`
  MODIFY `EstMesCod` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `estado_pedido`
--
ALTER TABLE `estado_pedido`
  MODIFY `EstPedCod` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `IdMe` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT de la tabla `nota_venta`
--
ALTER TABLE `nota_venta`
  MODIFY `CodNotVen` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `IdPed` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=162;

--
-- AUTO_INCREMENT de la tabla `pedido_detalle`
--
ALTER TABLE `pedido_detalle`
  MODIFY `DetPedId` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=223;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `IdPro` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT de la tabla `regcaja`
--
ALTER TABLE `regcaja`
  MODIFY `IdReg` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `regstock`
--
ALTER TABLE `regstock`
  MODIFY `IdStock` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `IdRol` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  MODIFY `CodTiPa` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `IdUsu` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `IdVent` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1007;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `boleta_ibfk_1` FOREIGN KEY (`VentBol`) REFERENCES `venta` (`IdVent`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `boleta_ibfk_2` FOREIGN KEY (`IdCliBol`) REFERENCES `cliente` (`IdCli`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`VentFac`) REFERENCES `venta` (`IdVent`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`IdCliFac`) REFERENCES `cliente` (`IdCli`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD CONSTRAINT `mesa_ibfk_1` FOREIGN KEY (`EstMe`) REFERENCES `estado_mesa` (`EstMesCod`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `nota_venta`
--
ALTER TABLE `nota_venta`
  ADD CONSTRAINT `nota_venta_ibfk_1` FOREIGN KEY (`IdVenNotVen`) REFERENCES `venta` (`IdVent`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`MesaPed`) REFERENCES `mesa` (`IdMe`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`EstPed`) REFERENCES `estado_pedido` (`EstPedCod`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`UsuPed`) REFERENCES `usuario` (`IdUsu`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_ibfk_4` FOREIGN KEY (`VenPed`) REFERENCES `venta` (`IdVent`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedido_detalle`
--
ALTER TABLE `pedido_detalle`
  ADD CONSTRAINT `pedido_detalle_ibfk_1` FOREIGN KEY (`IdProDetPed`) REFERENCES `producto` (`IdPro`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_detalle_ibfk_2` FOREIGN KEY (`IdDetPed`) REFERENCES `pedido` (`IdPed`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`CatProCod`) REFERENCES `categoria` (`IdCat`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `regstock`
--
ALTER TABLE `regstock`
  ADD CONSTRAINT `regstock_ibfk_1` FOREIGN KEY (`IdProStock`) REFERENCES `producto` (`IdPro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD CONSTRAINT `tipo_pago_ibfk_1` FOREIGN KEY (`IdVenTiPa`) REFERENCES `venta` (`IdVent`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`RolUsu`) REFERENCES `rol` (`IdRol`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`UsuVent`) REFERENCES `usuario` (`IdUsu`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
