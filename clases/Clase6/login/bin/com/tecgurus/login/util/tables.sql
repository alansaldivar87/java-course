create table USER(
	Id int not null auto_increment,
    Name varchar(50) not null,
    Last_Name varchar(50) not null,
    Email varchar(50),
    Age int not null,
    Address varchar(100),
    Password varchar(100),
    
    primary key(Id)
)