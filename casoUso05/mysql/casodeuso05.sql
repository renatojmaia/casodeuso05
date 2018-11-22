-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 22-Nov-2018 às 13:58
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; 
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `casodeuso05`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `animal`
--

CREATE TABLE `animal` (
  `id_animal` int(11) NOT NULL,
  `especie` varchar(255) NOT NULL,
  `bioterio` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `grupo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `bioterio`
--

CREATE TABLE `bioterio` (
  `id_bioterio` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `local` varchar(255) NOT NULL,
  `curso` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `detalheprotocolo`
--

CREATE TABLE `detalheprotocolo` (
  `quantidade` int(11) NOT NULL,
  `id_protocolo` int(11) NOT NULL,
  `id_animal` int(11) NOT NULL,
  `id_bioterio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `docente`
--

CREATE TABLE `docente` (
  `id_docente` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `dataNasc` date NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `parecer`
--

CREATE TABLE `parecer` (
  `id_parecer` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  `parecer` varchar(255) NOT NULL,
  `status` enum('1','2') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `protocolo`
--

CREATE TABLE `protocolo` (
  `id_protocolo` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  `id_parecer` int(11) NOT NULL,
  `statusProtocolo` int(11) NOT NULL,
  `dataInicio` date NOT NULL,
  `dataTermino` date NOT NULL,
  `resumoSimples` text NOT NULL,
  `resumoProtocolo` text NOT NULL,
  `justificativa` text NOT NULL,
  `parecerFinal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `status`
--

CREATE TABLE `status` (
  `id_status` int(11) NOT NULL,
  `status` enum('1','2','3') NOT NULL,
  `justificativa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`id_animal`);

--
-- Indexes for table `bioterio`
--
ALTER TABLE `bioterio`
  ADD PRIMARY KEY (`id_bioterio`);

--
-- Indexes for table `detalheprotocolo`
--
ALTER TABLE `detalheprotocolo`
  ADD KEY `FK_detalheprotocolo_protocolo` (`id_protocolo`),
  ADD KEY `FK_detalheprotocolo_animal` (`id_animal`),
  ADD KEY `FK_detalheprotocolo_bioterio` (`id_bioterio`);

--
-- Indexes for table `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indexes for table `parecer`
--
ALTER TABLE `parecer`
  ADD PRIMARY KEY (`id_parecer`);

--
-- Indexes for table `protocolo`
--
ALTER TABLE `protocolo`
  ADD PRIMARY KEY (`id_protocolo`),
  ADD KEY `docente` (`id_docente`),
  ADD KEY `parecer` (`id_parecer`),
  ADD KEY `FK_protocolo_status` (`statusProtocolo`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id_status`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `animal`
--
ALTER TABLE `animal`
  MODIFY `id_animal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bioterio`
--
ALTER TABLE `bioterio`
  MODIFY `id_bioterio` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `docente`
--
ALTER TABLE `docente`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `parecer`
--
ALTER TABLE `parecer`
  MODIFY `id_parecer` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `protocolo`
--
ALTER TABLE `protocolo`
  MODIFY `id_protocolo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `detalheprotocolo`
--
ALTER TABLE `detalheprotocolo`
  ADD CONSTRAINT `FK_detalheprotocolo_animal` FOREIGN KEY (`id_animal`) REFERENCES `animal` (`id_animal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_detalheprotocolo_bioterio` FOREIGN KEY (`id_bioterio`) REFERENCES `bioterio` (`id_bioterio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_detalheprotocolo_protocolo` FOREIGN KEY (`id_protocolo`) REFERENCES `protocolo` (`id_protocolo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `protocolo`
--
ALTER TABLE `protocolo`
  ADD CONSTRAINT `FK_protocolo_status` FOREIGN KEY (`statusProtocolo`) REFERENCES `status` (`id_status`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `docente` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `parecer` FOREIGN KEY (`id_parecer`) REFERENCES `parecer` (`id_parecer`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
