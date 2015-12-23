DROP TABLE person IF EXISTS;
CREATE TABLE person  (
    ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    firstName VARCHAR(20),
    lastName VARCHAR(20)
);


insert into account(account_number, amount, person_id) values( 'BX123456789', 1000,12345609 );
insert into account(account_number, amount, person_id) values( 'AB432625234', 2050, 34523441);
insert into account(account_number, amount, person_id) values( 'ZQ42469001', 3000, 123467835);

insert into person( ID, firstName, lastName ) values ( 12345609, 'Peter', 'Nox');
insert into person(ID, firstName, lastName ) values ( 34523441, 'Jame', 'Schmidt');
insert into person(ID, firstName, lastName ) values ( 123467835, 'Julia', 'Jhonson');
