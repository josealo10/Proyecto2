create database if not exists Activos;

use Activos;

create table if not exists Dependencia(
	id varchar(10) not null primary key,
	nombre varchar(50) not null 
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
	dependencia varchar(10) not null,
	foreign key (dependencia) references Dependencia (id),
	foreign key (puesto) references Usuario (id)
);

create table if not exists Solicitud(
	numero int not null auto_increment primary key,
    funcionario varchar(10) not null,
    dependencia varchar(50) not null,
    registrador varchar(10),
    fecha timestamp not null default current_timestamp on update current_timestamp not null,
    estado varchar(10) not null,
    foreign key (funcionario) references Funcionario (id),
    foreign key (dependencia) references Dependencia (id),
    foreign key (registrador) references Funcionario (id)
);

create table if not exists Bien(
	codigo int not null auto_increment primary key,
	marca varchar(15) not null,
	modelo varchar(15) not null,
    precio int not null,
    tipo varchar(8) not null,
    descripcion varchar(25) not null,
	solicitud int not null,
	cantidad int not null,
	foreign key (solicitud) references Solicitud (numero)
);

create table if not exists Activo(
	codigo int(11) not null auto_increment primary key,
	marca varchar(15) not null,
	modelo varchar(15) not null,
    precio int not null,
    categoria varchar(30) not null,
    foreign key (categoria) references Categoria (nombre)
);

create table if not exists Categoria(
	categoria varchar(15) not null primary key
);