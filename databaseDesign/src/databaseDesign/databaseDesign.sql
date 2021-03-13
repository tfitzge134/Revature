-- We are dropping the foreign key constraint on dependant table (in other case it will prevent us from updating the values)
ALTER TABLE foo_table DROP CONSTRAINT fk_e52ffdeea76ed395;

-- Then, we're swapping values in foreign key column from id to another_id
UPDATE foo_table T SET user_id = (SELECT another_id FROM users WHERE id = T.user_id);

-- And finally we're creating new foreign key constraint pointing to the another_id instead of id
ALTER TABLE foo_table ADD CONSTRAINT fk_e52ffdeea76ed395 FOREIGN KEY (user_id) REFERENCES users (another_id) ON DELETE CASCADE;

ALTER TABLE person DROP CONSTRAINT fk_e52ffdeea76ed395;
CREATE SCHEMA person;
CREATE TABLE hollywood.films (title text, release date, awards text[]);
CREATE VIEW hollywood.winners AS
    SELECT title, release FROM hollywood.films WHERE awards IS NOT NULL;

 CREATE SCHEMA person;  
CREATE TABLE person.person (
  personId serial PRIMARY KEY,
  firstName varchar(20),
 lastName varchar(20),
 email varchar(20),
 phoneNumber varchar(14),
occupation varchar(20),
dob date,
isEmployee boolean not NULL)
;
select * from person.person 
insert into person.person
(firstName, lastName, email, phoneNumber, occupation, dob, isEmployee) values ('Ros', 'Peter', '133@bank', '1-413-212-8202', 'Teacher', '12-12-1988', FALSE),
('Maria', 'Bermudez', '1433@bank', '1-413-212-8902', 'Programmer', '12-12-1988', True)

//create customer
INSERT INTO person.person(
	personid, firstname, lastname, email, phonenumber, occupation, dob, isemployee, password)
	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);
INSERT INTO person.customer(
	customerid, customertype, personid)
	VALUES (?, ?, ?);
INSERT INTO person.address(
	addressid, address, city, state, country, personid)
	VALUES (?, ?, ?, ?, ?, ?);
INSERT INTO bank.branch(
	branchid, bname, baddress, bcity, branchstate, branchcountry, branchnumber)
	INSERT INTO account.checking(
	acnumber, accountnumber, branchid, openingbalance, balance, opendingdate, accstatus, deposit, withdrawl, interestrate, customerid)
	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
	VALUES (?, ?, ?, ?, ?, ?, ?);

alter table person.person 
add column isCustomer boolean


CREATE TABLE person.address
  (addressId serial primary key,
  address varchar(20),
  city varchar(20),
State varchar(2),
country varchar(20),
personId serial,
  FOREIGN KEY (personId)
  REFERENCES person.person (personId)
);
select * from person.address 
select * from person.person p 

insert into person.address(address, city, state, country) values ('Calle Principal', 'Westfield', 'MA', 'USA'), ('University Park', 'Holyoke', 'PA', 'USA'),
('Main', 'Blue Ville', 'FL', 'USA')



 CREATE TABLE person.customer (
  customerId serial primary key,
  customerType varchar(20),
  personid serial,
  FOREIGN KEY (personId)
      REFERENCES person.person(personId),

);
select * from person.customer

insert into person.customer (customertype) values ('Business'), ('Prefered customer'), ('Prefered customer')

create schema bank
CREATE TABLE bank.branch
   (
    branchId serial,
    bname VARCHAR(20),
    baddress varchar(20),
    bcity VARCHAR(20),
    branchState varchar(4),
    branchCountry varchar(10),
    branchNumber int,
    CONSTRAINT branchId PRIMARY KEY(branchId) 
   )
   
   select * from bank.branch 
   insert into bank.branch (bname, baddress, bcity, branchState, branchCountry, branchNumber)
   values('Bank of USA', 'First North', 'Austin', 'Tx', 'USA', 1),('Bank of USA', 'Main St', 'Austin', 'Tx', 'USA',2),
   ('Bank of USA', 'Congress Ave', 'Austin','USA', 'Tx', 3);

   create schema account

drop table account.checking 
CREATE TABLE account.Checking
   (
      acnumber serial primary key,
      AccountNumber varchar(10),
      branchId serial,
      openingBalance money,
      Balance int,
      OpendingDate Date,
      accStatus VARCHAR(10),
      deposit money,
      withdrawl money,
      interestRate  money,
	   customerId serial,
      CONSTRAINT customerId FOREIGN KEY(customerId) REFERENCES person.customer(customerId), 
      CONSTRAINT branchId FOREIGN KEY(branchId) REFERENCES bank.branch(branchId) 
    );
   
   insert into account.checking (accountnumber , openingbalance , balance , opendingdate , accstatus , deposit, withdrawl, interestrate ) 
   values ('2-12345677', 100000, 1000, '10-10-2002', 'active', 0, 0,  2.2),
   ('3-12345674', 10000, 9000, '10-10-2002', 'active', 0, 0,  2.2)
   
   select * from account.checking c 
   
  CREATE TABLE account.savings
   (
      acSavingId serial primary key,
      AccountNumber varchar(10),
      branchId serial,
      openingBalance int,
      Balance int,
      OpendingDate Date,
      accStatus VARCHAR(10),
      deposit money,
      depositDate date,
      withdrawl money,
      withdate date,
      interestRate  money,
	   customerId serial,
      CONSTRAINT fkbranchId FOREIGN KEY(branchId) REFERENCES bank.branch(branchId) ,
       CONSTRAINT fkcustomerId FOREIGN KEY(customerId) REFERENCES person.customer(customerId) 
    )
   insert into account.savings (accountnumber , openingbalance , balance , opendingdate , accstatus , deposit, withdrawl, interestrate ) 
   values ('S-1666666', 100000, 1000, '10-10-2002', 'active', 0, 0,  2.2),
   ('S-7777777', 10000, 9000, '10-10-2002', 'active', 0, 0,  2.2),
    ('S-8888888', 10000, 9000, '10-10-2002', 'active', 0, 0,  2.2)

   select * from account.savings
   
    drop table bank.transfer 

  CREATE TABLE bank.transfer
    (   
     transNumber  serial,
     dot DATE,
     sourceAccountNumber varchar(10),
     destinationAccountNumber varchar(10),
     transactionAmount MONEY, 
     acSavingId serial,
     acnumber serial,
     CONSTRAINT transNumber PRIMARY KEY(transNumber),
     CONSTRAINT fkacSavingId FOREIGN KEY(acSavingId) REFERENCES account.savings(acSavingId),
     CONSTRAINT fkacnumber FOREIGN KEY(acnumber) REFERENCES account.checking(acnumber)  
     
    );
select * from bank.transfer t 