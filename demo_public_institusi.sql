create table institusi
(
    id             bigserial not null
        constraint institusi_pk
            primary key,
    kode_institusi varchar,
    nama           varchar,
    nama_singkat   varchar,
    flag_aktif     boolean
);

