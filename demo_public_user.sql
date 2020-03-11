create table "user"
(
    id           bigserial not null
        constraint user_pk
            primary key,
    username     varchar,
    password     varchar,
    id_institusi bigint,
    role         varchar
);

create unique index user_id_uindex
    on "user" (id);

create unique index user_username_uindex
    on "user" (username);

