-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-05-2026 a las 22:57:25
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `evaluacion_springboot_relaciones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auditoria_log`
--

CREATE TABLE `auditoria_log` (
  `id` bigint(20) NOT NULL,
  `accion` varchar(255) DEFAULT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `metodo` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `clase` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `auditoria_log`
--

INSERT INTO `auditoria_log` (`id`, `accion`, `fecha`, `metodo`, `usuario`, `clase`) VALUES
(2, 'EJECUCION', '2026-05-23 15:00:02.000000', 'listar', 'admin', 'ClienteServiceImpl'),
(3, 'GET CLIENTES', '2026-05-23 15:03:09.000000', 'listar', 'admin', 'ClienteServiceImpl'),
(4, 'POST CLIENTES', '2026-05-23 15:03:09.000000', 'guardar', 'admin', 'ClienteServiceImpl'),
(5, 'PUT CLIENTES', '2026-05-23 15:03:09.000000', 'actualizar', 'admin', 'ClienteServiceImpl'),
(6, 'GET PRODUCTOS', '2026-05-23 15:03:09.000000', 'listar', 'admin', 'ProductoServiceImpl'),
(7, 'POST PRODUCTOS', '2026-05-23 15:03:09.000000', 'guardar', 'admin', 'ProductoServiceImpl'),
(8, 'PUT PRODUCTOS', '2026-05-23 15:03:09.000000', 'actualizar', 'admin', 'ProductoServiceImpl'),
(9, 'REGISTRO PEDIDO', '2026-05-23 15:03:09.000000', 'registrar', 'admin', 'PedidoServiceImpl'),
(10, 'DISMINUCION STOCK', '2026-05-23 15:03:09.000000', 'actualizarStock', 'admin', 'PedidoServiceImpl'),
(11, 'VALIDACION CLIENTE', '2026-05-23 15:03:09.000000', 'guardar', 'admin', 'ClienteServiceImpl'),
(12, 'SEGURIDAD LOGIN', '2026-05-23 15:03:09.000000', 'autenticar', 'admin', 'SecurityConfig'),
(13, 'ACCESO DENEGADO', '2026-05-23 15:03:09.000000', 'forbidden', 'user', 'ProductoController'),
(14, 'EJECUCION', '2026-05-23 15:09:29.000000', 'listar', 'admin', 'ClienteServiceImpl'),
(15, 'EJECUCION', '2026-05-23 15:10:07.000000', 'guardar', 'admin', 'ClienteServiceImpl'),
(16, 'EJECUCION', '2026-05-23 15:10:47.000000', 'listar', 'admin', 'ProductoServiceImpl'),
(17, 'EJECUCION', '2026-05-23 15:11:30.000000', 'registrar', 'admin', 'PedidoServiceImpl'),
(18, 'EJECUCION', '2026-05-23 15:12:08.000000', 'guardar', 'admin', 'ClienteServiceImpl');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `nombre`) VALUES
(1, 'Tecnologia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `nombres` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `rol` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `apellidos`, `correo`, `direccion`, `nombres`, `telefono`, `rol`) VALUES
(1, 'Huaytalla', 'piero@gmail.com', 'Lima', 'Piero', '999999999', 'ADMIN'),
(3, 'Dionicio', 'luis@gmail.com', 'Lima', 'Luis', '987654321', 'USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `id` bigint(20) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `pedido_id` bigint(20) DEFAULT NULL,
  `producto_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`id`, `cantidad`, `subtotal`, `pedido_id`, `producto_id`) VALUES
(1, 2, 7000, 1, 1),
(2, 2, 7000, 2, 1),
(3, 1, 3500, 3, 1),
(4, 1, 3500, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id` bigint(20) NOT NULL,
  `fecha` date DEFAULT NULL,
  `total` double DEFAULT NULL,
  `cliente_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id`, `fecha`, `total`, `cliente_id`) VALUES
(1, '2026-05-22', 7000, 1),
(2, '2026-05-23', 7000, 1),
(3, '2026-05-23', 3500, 1),
(4, '2026-05-23', 3500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `precio` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `categoria_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `nombre`, `precio`, `stock`, `categoria_id`) VALUES
(1, 'i7 16GB', 'Laptop Lenovo', 3500, 14, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `cliente_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `password`, `username`, `cliente_id`) VALUES
(1, '1234', 'admin01', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auditoria_log`
--
ALTER TABLE `auditoria_log`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKk6i2j3upwar1uora4mgiol6b` (`correo`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgqvba9e7dildyw45u0usdj1k2` (`pedido_id`),
  ADD KEY `FK2yc3nts8mdyqf6dw6ndosk67a` (`producto_id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK30s8j2ktpay6of18lbyqn3632` (`cliente_id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKodqr7965ok9rwquj1utiamt0m` (`categoria_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKluqkmdj3wgkusw4s4e3xth69s` (`cliente_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `auditoria_log`
--
ALTER TABLE `auditoria_log`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `FK2yc3nts8mdyqf6dw6ndosk67a` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `FKgqvba9e7dildyw45u0usdj1k2` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `FK30s8j2ktpay6of18lbyqn3632` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FKodqr7965ok9rwquj1utiamt0m` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FKp3dqdf5mc3lqr5y9p3b0omjl9` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
