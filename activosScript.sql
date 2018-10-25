create database if not exists Activos;

use Activos;

create table if not exists Dependencia(
	nombre varchar(50) not null primary key
);

create table if not exists Usuario(
	id varchar(10) not null primary key,
	clave varchar(15) not null,
	permiso varchar(20) not null
);

create table if not exists Funcionario(
	id varchar(10) not null primary key,
	nombre varchar(30) not null,
	puesto varchar(30) not null,
	dependencia varchar(50) not null,
	foreign key (dependencia) references Dependencia (nombre),
	foreign key (puesto) references Usuario (id)
);

create table if not exists Solicitud(
	numero int not null auto_increment primary key,
    funcionario varchar(10) not null,
    fecha date not null,
    foreign key (funcionario) references Funcionario (id)
);

create table if not exists Bien(
	codigo int not null auto_increment primary key,
	marca varchar(15) not null,
	modelo varchar(15) not null,
	solicitud int not null,
	cantidad int not null,
	foreign key (solicitud) references Solicitud (numero)
);

create table if not exists Activo(
	codigo int(11) not null auto_increment primary key,
	marca varchar(15) not null,
	modelo varchar(15) not null,
	bien int(11) not null,
	foreign key (bien) references bien (codigo)
);