use activos;

create table Catalogo(
	codigo int auto_increment not null primary key
);

CREATE TABLE `activo` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `bien` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `bien` (`bien`),
  CONSTRAINT `activo_ibfk_1` FOREIGN KEY (`bien`) REFERENCES `bien` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `bien` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `solicitud` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `solicitud` (`solicitud`),
  CONSTRAINT `bien_ibfk_1` FOREIGN KEY (`solicitud`) REFERENCES `solicitud` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `catalogo` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `dependencia` (
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `funcionario` (
  `id` varchar(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `puesto` varchar(30) NOT NULL,
  `dependencia` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `dependencia` (`dependencia`),
  KEY `puesto` (`puesto`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`dependencia`) REFERENCES `dependencia` (`nombre`),
  CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`puesto`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `solicitud` (
  numero int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `usuario` (
  id varchar(10) NOT NULL,
  clave varchar(15) NOT NULL,
  permiso varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ;



