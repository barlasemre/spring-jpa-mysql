# Spring - Mysql example with JPA


# Mysql setup

Open Mysql CLI and write these commands:

mysql> create database challange; 

mysql> create user 'wagawin'@'localhost' identified by 'password'; 

mysql> grant all on challange.* to 'wagawin'@'localhost';



# Endpoints:

/child/info/{id} : returns the parent and favorite meal of given child.

/child/color/{id} :  returns bicycle or hair color for given children.

/house/{id} : returns the house of given person.



