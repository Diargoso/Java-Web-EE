-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Хост: localhost
-- Время создания: Мар 24 2025 г., 11:44
-- Версия сервера: 5.7.11
-- Версия PHP: 5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `potanin25`
--
CREATE DATABASE IF NOT EXISTS `potanin25` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `potanin25`;

-- --------------------------------------------------------

--
-- Структура таблицы `aouth`
--

CREATE TABLE `aouth` (
  `id` int(11) NOT NULL,
  `salutation` int(11) NOT NULL,
  `firstName` int(11) NOT NULL,
  `lastName` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `email` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `lico`
--

CREATE TABLE `lico` (
  `id` int(11) NOT NULL,
  `F` text NOT NULL,
  `I` text NOT NULL,
  `O` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `lico`
--

INSERT INTO `lico` (`id`, `F`, `I`, `O`) VALUES
(15, 'ewf', 'ewfwef', 'e'),
(25, 'rgrg', 'rg', 'grgr'),
(26, 'gr', 'gr', 'rg'),
(27, 'gr', 'rg', 'rg'),
(28, '3', '3', '13'),
(29, 'tb', 'tb', 'tb'),
(30, 'wef', 'wef', 'efw'),
(31, '???', '???', '???'),
(32, 'asf', 'afs', 'fas'),
(33, 'asf', 'asf', 'asf');

-- --------------------------------------------------------

--
-- Структура таблицы `sborochnie_komplectuyshie`
--

CREATE TABLE `sborochnie_komplectuyshie` (
  `id` int(11) NOT NULL,
  `Nomber_Techniki` text NOT NULL,
  `Motherboard` text NOT NULL,
  `GPU` text NOT NULL,
  `HDDSSDCD` text NOT NULL,
  `Procesor` text NOT NULL,
  `Korpus` text,
  `OZY` text NOT NULL,
  `Battery` text,
  `Cooling` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `sborochnie_komplectuyshie`
--

INSERT INTO `sborochnie_komplectuyshie` (`id`, `Nomber_Techniki`, `Motherboard`, `GPU`, `HDDSSDCD`, `Procesor`, `Korpus`, `OZY`, `Battery`, `Cooling`) VALUES
(3, '1', '1', '1', '1', '1', '', '1', '1', '1');

-- --------------------------------------------------------

--
-- Структура таблицы `spisok_komplektyushix`
--

CREATE TABLE `spisok_komplektyushix` (
  `id` int(11) NOT NULL,
  `Komplektuyshie` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `spisok_komplektyushix`
--

INSERT INTO `spisok_komplektyushix` (`id`, `Komplektuyshie`) VALUES
(9, 'dfb'),
(10, 'dfb'),
(16, 'svs'),
(17, 'svs'),
(18, 'svd'),
(19, 'svd'),
(20, 'svd'),
(21, 'vdsdsv'),
(22, 'vdsdsv'),
(25, '111'),
(26, '111'),
(28, 'gww'),
(29, 'gww'),
(30, 'vdvsz'),
(31, 'vdvsz'),
(32, 'sfsdf'),
(33, 'rg'),
(34, 'fe'),
(35, 'a'),
(36, '1'),
(37, '1234'),
(38, 'fe'),
(40, 'rgr'),
(41, 'u'),
(42, 'u'),
(43, '1'),
(44, '1'),
(45, '1');

-- --------------------------------------------------------

--
-- Структура таблицы `tehnika_tip`
--

CREATE TABLE `tehnika_tip` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `type` text NOT NULL,
  `Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tehnika_tip`
--

INSERT INTO `tehnika_tip` (`id`, `name`, `type`, `Date`) VALUES
(8, 'ef', 'fe', NULL),
(10, '???', '??', NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `type_gadjet`
--

CREATE TABLE `type_gadjet` (
  `id` int(11) NOT NULL,
  `Type` varchar(20) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `type_gadjet`
--

INSERT INTO `type_gadjet` (`id`, `Type`) VALUES
(2, 'Факс'),
(3, 'Принтер'),
(4, 'копир'),
(5, 'ноутбук'),
(6, 'сканер'),
(7, 'dg'),
(8, 'ef');

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `F` text,
  `name` text,
  `user` text NOT NULL,
  `pass` text NOT NULL,
  `email` text,
  `adress` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `F`, `name`, `user`, `pass`, `email`, `adress`) VALUES
(26, NULL, NULL, '', '', NULL, NULL),
(30, NULL, NULL, '', '', NULL, NULL),
(31, NULL, NULL, '123', '123', NULL, NULL),
(32, NULL, NULL, 'Fuga', '123', NULL, NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `ychet`
--

CREATE TABLE `ychet` (
  `id` int(11) NOT NULL,
  `Nomber_Techniki` text,
  `CabNum` text,
  `depreciation` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `ychet`
--

INSERT INTO `ychet` (`id`, `Nomber_Techniki`, `CabNum`, `depreciation`) VALUES
(53, 'fe', 'ef', 'fe'),
(54, '1', '1', '1'),
(55, '', '', ''),
(56, '1', '1', '4'),
(57, '1', '1', '24'),
(58, '41', '14', '41');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `aouth`
--
ALTER TABLE `aouth`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `lico`
--
ALTER TABLE `lico`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `sborochnie_komplectuyshie`
--
ALTER TABLE `sborochnie_komplectuyshie`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `spisok_komplektyushix`
--
ALTER TABLE `spisok_komplektyushix`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `tehnika_tip`
--
ALTER TABLE `tehnika_tip`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `type_gadjet`
--
ALTER TABLE `type_gadjet`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `ychet`
--
ALTER TABLE `ychet`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `aouth`
--
ALTER TABLE `aouth`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `lico`
--
ALTER TABLE `lico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT для таблицы `sborochnie_komplectuyshie`
--
ALTER TABLE `sborochnie_komplectuyshie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT для таблицы `spisok_komplektyushix`
--
ALTER TABLE `spisok_komplektyushix`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
--
-- AUTO_INCREMENT для таблицы `tehnika_tip`
--
ALTER TABLE `tehnika_tip`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT для таблицы `type_gadjet`
--
ALTER TABLE `type_gadjet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT для таблицы `ychet`
--
ALTER TABLE `ychet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
