create table users (
    id bigint unique not null,
    name varchar(500),
    date_of_birth date,
    password varchar(500),

    primary key(id)
);

create table account (
    id bigint unique not null,
    user_id bigint unique not null,
    balance decimal not null,

    primary key(id),
    foreign key(user_id) references users(id)
);

create table email_data (
    id bigint unique not null,
    user_id bigint not null,
    email varchar(200) unique,

    primary key(id),
    foreign key(user_id) references users(id)
);

create table phone_data (
    id bigint unique not null,
    user_id bigint not null,
    phone varchar(13) unique,

    primary key(id),
    foreign key(user_id) references users(id)
);
