CREATE TABLE findsport.stadium_details (
    stadium_id INT NOT NULL AUTO_INCREMENT,
    stadium_name VARCHAR(20),
    stadium_longitude FLOAT(10 , 6 ),
    stadium_latitide FLOAT(10 , 6 ),
    stadium_phoneno VARCHAR(10),
    stadium_adress VARCHAR(40),
    PRIMARY KEY (stadium_id)
);

CREATE TABLE findsport.stadium_sport (
    stadium_id INT NOT NULL,
    sport_id INT(2),
    court_count INT(2),
    PRIMARY KEY (stadium_id , sport_id)
);

CREATE TABLE findsport.sport_details (
    sport_id INT(2),
    sport_name VARCHAR(20),
    PRIMARY KEY (sport_id)
);

CREATE TABLE findsport.court_availability (
    stadium_id LONG NOT NULL,
    court_id INT(2),
    booked_date DATE,
    booked_from TIME,
    booked_till TIME
);

CREATE TABLE findsport.stadium_address (
    address_id INT NOT NULL AUTO_INCREMENT,
    street_name varchar(225),
    city_name varchar(50),
    land_mark varchar(50),
    state VARCHAR(50),
    country VARCHAR(50),
    PRIMARY KEY (address_id)
);