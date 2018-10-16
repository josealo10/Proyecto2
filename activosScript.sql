use activos;

create table Solicitud (
	numero int auto_increment not null primary key
);

create table Bien (
	codigo int auto_increment primary key,
	marca varchar(15) not null,
    modelo varchar(15) not null,
    solicitud int not null,
    cantidad int not null,
    foreign key(solicitud) references Solicitud(numero)
);

create table Dependencia (
	nombre varchar(50) not null primary key
);

create table Funcionario (
    id varchar(10)  not null primary key,
    nombre varchar(30) not null,
    puesto varchar(30) not null,
    dependencia varchar(50) not null,
    foreign key(dependencia) references Dependencia(nombre),
    foreign key(puesto) references Usuario(id)
);

create table Usuario (
	id varchar(10) not null primary key,
    clave varchar(15) not null,
    permiso varchar(20) not null
);
















