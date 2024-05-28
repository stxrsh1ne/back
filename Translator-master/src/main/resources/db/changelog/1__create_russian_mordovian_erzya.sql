--liquibase formatted sql

--changeset artem.shegurov:1 enddelimiter:/
create table russians(
    id serial primary key,
    word varchar(255),
    mordovian_translate varchar(255) array,
    erzya_translate varchar(255) array
);

create table mordovians(
    id serial primary key,
    word varchar(255),
    russian_translate varchar(255) array,
    erzya_translate varchar(255) array
);

create table erzyas(
    id serial primary key,
    word varchar(255),
    russian_translate varchar(255) array,
    mordovian_translate varchar(255) array
);