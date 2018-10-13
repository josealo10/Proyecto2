use activos;

create table Bien (
	codigo int auto_increment primary key,
	marca varchar(15) not null,
    modelo varchar(15) not null
);

create table Dependencia (
	nombre varchar(50) not null primary key
);

create table Administrador (
    id varchar(10)  not null primary key,
    nombre varchar(30) not null,
    dependencia varchar(50) not null,
    foreign key(dependencia) references Dependencia(nombre)
);