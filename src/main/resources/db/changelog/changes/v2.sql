drop table "product";
create table "product" (
  id SERIAL,
  producttype varchar(100) not null,
  productname varchar(100) not null,
  primary key (id)
);