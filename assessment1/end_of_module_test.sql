Task 1
Solution:

root@Lev-Virtualbox:/home/lev# cat > pets
dogs
cats
hamsters
root@Lev-Virtualbox:/home/lev# cat > pack_animals
horses
camels
donkeys
root@Lev-Virtualbox:/home/lev# cat pets pack_animals > all_animals
root@Lev-Virtualbox:/home/lev# cat all_animals 
dogs
cats
hamsters
horses
camels
donkeys
root@Lev-Virtualbox:/home/lev# mv all_animals mans_friends
-----------
Task 2
Solution:

root@Lev-Virtualbox:/home/lev# mkdir taskdir
root@Lev-Virtualbox:/home/lev# mv mans_friends taskdir/
root@Lev-Virtualbox:/home/lev# cd taskdir/
root@Lev-Virtualbox:/home/lev/taskdir# ll
total 12
drwxr-xr-x  2 root root 4096 Apr 12 19:54 ./
drwx------ 21 lev  lev  4096 Apr 12 19:54 ../
-rw-r--r--  1 root root   41 Apr 12 19:52 mans_friends
root@Lev-Virtualbox:/home/lev/taskdir# cat mans_friends 
dogs
cats
hamsters
horses
camels
donkeys
-----------
Task 3
Solution:

sudo apt update
sudo apt install mysql-server
sudo systemctl start mysql.service
sudo mysql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
exit

mysql -u root -p

mysql> CREATE DATABASE animals;
Query OK, 1 row affected (0.06 sec)

mysql> exit
Bye
-----------
Task 4
Solution:

sudo apt-get install -f
wget http://archive.ubuntu.com/ubuntu/pool/universe/v/vlc/vlc_3.0.16-1build7_amd64.deb
sudo dpkg -i home/lev/taskdir/vlc_3.0.16-1build7_amd64.deb
sudo dpkg -r vlc
-----------
Task 5
Solution:
Screenshots attached here: https://docs.google.com/document/d/17Ape2HUEJo6PyFKWysHrA7hJlBHfaMnAnEEhb9azcTA/edit?usp=sharing
-----------
Task 6
Solution:
Screenshots attached here: https://docs.google.com/document/d/17Ape2HUEJo6PyFKWysHrA7hJlBHfaMnAnEEhb9azcTA/edit?usp=sharing
-----------
Task 7
Solution:
mysql> CREATE DATABASE animals;
Query OK, 1 row affected (0.06 sec)

mysql> exit
Screenshots attached here: https://docs.google.com/document/d/17Ape2HUEJo6PyFKWysHrA7hJlBHfaMnAnEEhb9azcTA/edit?usp=sharing
-----------
Task 8
Solution:

CREATE TABLE animal_class (
    animal_id INT NOT NULL PRIMARY KEY
);

CREATE TABLE domestic_animals (
    domestic_id INT NOT NULL PRIMARY KEY,
    animal_type VARCHAR(20) NOT NULL,
    animal_id INT NOT NULL,

    FOREIGN KEY (animal_id) REFERENCES animal_class(animal_id)
);

CREATE TABLE pack_animals (
    pack_id INT NOT NULL PRIMARY KEY,
    animal_type VARCHAR(20) NOT NULL,
    animal_id INT NOT NULL,

    FOREIGN KEY (animal_id) REFERENCES animal_class(animal_id)
);


INSERT INTO animal_class (animal_id) VALUES (1);

INSERT INTO domestic_animals (domestic_id, animal_type, animal_id) 
    VALUES (1, 'dog', 1), (2, 'cat', 1), (3, 'hamster', 1);

INSERT INTO pack_animals (pack_id, animal_type, animal_id) 
    VALUES (1, 'horse', 1), (2, 'camel', 1), (3, 'donkey', 1);

-----------
Task 9
Solution:

CREATE TABLE dogs (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO dogs (id, name, date_of_birth, commands) 
    VALUES (1, 'Rex', '2010-01-01', 'sit');

CREATE TABLE cats (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO cats (id, name, date_of_birth, commands) 
    VALUES (2, 'Fluffy', '2015-03-12', 'meow');

CREATE TABLE hamsters (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO hamsters (id, name, date_of_birth, commands) 
    VALUES (3, 'Buddy', '2020-05-30', 'run');

CREATE TABLE horses (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO horses (id, name, date_of_birth, commands) 
    VALUES (1, 'Thunder', '2012-06-25', 'gallop');

CREATE TABLE camels (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO camels (id, name, date_of_birth, commands) 
    VALUES (2, 'Malboro', '2016-09-17', 'spit');

CREATE TABLE donkeys (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    commands VARCHAR(100) NOT NULL
);

INSERT INTO donkeys (id, name, date_of_birth, commands) 
    VALUES (3, 'Eddie', '2018-11-28', 'bray');

-----------
Task 10
Solution:

DROP TABLE camels;

CREATE TABLE horses_and_donkeys (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  date_of_birth DATE,
  commands VARCHAR(255),
  animal_type VARCHAR(50)
);

INSERT INTO horses_and_donkeys (id, name, date_of_birth, commands, animal_type)
SELECT id, name, date_of_birth, commands, 'horse' AS animal_type FROM horses
UNION ALL
SELECT id, name, date_of_birth, commands, 'donkey' AS animal_type FROM donkeys;

-----------
Task 11
Solution:

CREATE TABLE young_animals (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  date_of_birth DATE,
  commands VARCHAR(255)
);

ALTER TABLE young_animals ADD COLUMN age VARCHAR(50);

INSERT INTO young_animals (id, name, date_of_birth, commands, age)
SELECT id, name, date_of_birth, commands, CONCAT(FLOOR(DATEDIFF(NOW(), date_of_birth) / 365), ' years ', FLOOR((DATEDIFF(NOW(), date_of_birth) % 365) / 30), ' months') AS age
FROM hamsters --(dogs, cats, horses_and_donkeys)
WHERE date_of_birth <= DATE_SUB(NOW(), INTERVAL 1 YEAR)
AND date_of_birth >= DATE_SUB(NOW(), INTERVAL 3 YEAR);


CREATE TABLE all_animals (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  date_of_birth DATE NOT NULL,
  commands VARCHAR(255) NOT NULL,
  animal_type VARCHAR(255) NOT NULL,
  age DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO all_animals (name, date_of_birth, commands, animal_type, age)
SELECT name, date_of_birth, commands, 'dog' AS animal_type, (DATEDIFF(CURDATE(), date_of_birth) / 30) AS age FROM dogs
UNION ALL
SELECT name, date_of_birth, commands, 'cat' AS animal_type, (DATEDIFF(CURDATE(), date_of_birth) / 30) AS age FROM cats
UNION ALL
SELECT name, date_of_birth, commands, 'hamster' AS animal_type, (DATEDIFF(CURDATE(), date_of_birth) / 30) AS age FROM hamsters
UNION ALL
SELECT name, date_of_birth, commands, 'horse_and_donkey' AS animal_type, (DATEDIFF(CURDATE(), date_of_birth) / 30) AS age FROM horses_and_donkeys
UNION ALL
SELECT name, date_of_birth, commands, 'young_animal' AS animal_type, (DATEDIFF(CURDATE(), date_of_birth) / 30) AS age FROM young_animals;

ALTER TABLE all_animals
CHANGE COLUMN age age_in_months DECIMAL(6,2) NOT NULL;