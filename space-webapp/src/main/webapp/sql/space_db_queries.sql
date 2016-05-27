create database space;

use space;

CREATE TABLE university (
	id INT SERIAL,
	name varchar(256) NOT NULL Unique,
    email_domain varchar(256) NOT NULL Unique,
	PRIMARY KEY(id)
);


CREATE TABLE department (
	id INT SERIAL NOT NULL,
	name varchar(256) NOT NULL,
	university_id INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (university_id) REFERENCES university(id),
    CONSTRAINT UK__name UNIQUE (university_id,name)
);


CREATE TABLE student (
	id INT SERIAL ,
	email_id varchar(256) NOT NULL UNIQUE,
	name varchar(256) NOT NULL,
	department_id INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE faculty (
	id INT SERIAL ,
	name varchar(256) NOT NULL UNIQUE,
	email_id varchar(256) NOT NULL,
	title varchar(256) NOT NULL,
	location varchar(256) NOT NULL,
	phone INT NOT NULL,
	fax INT NOT NULL,
	mail_code INT NOT NULL,
	department_id INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE class (
	id INT AUTO_INCREMENT NOT NULL,
	department_id INT NOT NULL,
	name varchar(256) NOT NULL,
    code varchar(256) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (department_id) REFERENCES department(id),
    CONSTRAINT UK__code UNIQUE (department_id,code)
);

CREATE TABLE private_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	location VARCHAR(256) NOT NULL,
	picture blob,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE private_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES private_space(id)
);


CREATE TABLE study_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	class_id INT NOT NULL,
    other_class VARCHAR(256) NULL,
    faculty_id INT NOT NULL,
    other_faculty VARCHAR(256) NULL,
	location VARCHAR(256) NOT NULL,
	picture blob,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (class_id) REFERENCES class(id),
    FOREIGN KEY (faculty_id) REFERENCES faculty(id)
);
CREATE TABLE study_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES study_space(id)
);



CREATE TABLE project_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	field VARCHAR(256) NOT NULL,
	picture blob,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE project_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES project_space(id)
);



CREATE TABLE sport_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	sport VARCHAR(256) NOT NULL,
	picture blob,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE sport_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES sport_space(id)
);


CREATE TABLE event_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	event VARCHAR(256) NOT NULL,
	picture blob,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE event_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES event_space(id)
);


CREATE TABLE housing_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	room_type VARCHAR(256) NOT NULL,
	picture blob,
	price float NOT NULL,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE housing_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES housing_space(id)
);


CREATE TABLE tutor_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	class_id INT NOT NULL,
    other_class VARCHAR(256) NULL,
	picture blob,
	price float NOT NULL,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (class_id) REFERENCES class(id)
);
CREATE TABLE tutor_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    is_tutor BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES tutor_space(id)
);


CREATE TABLE textbook_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	class_id INT NOT NULL,
    other_class VARCHAR(256) NULL,
	picture blob,
	price float NOT NULL,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (class_id) REFERENCES class(id)
);
CREATE TABLE textbook_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES textbook_space(id)
);



CREATE TABLE carpool_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	picture blob,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE carpool_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES carpool_space(id)
);


CREATE TABLE crew_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	picture blob,
	dance_type VARCHAR(256) NOT NULL,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE crew_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES crew_space(id)
);


CREATE TABLE lost_and_found_space (
	id INT AUTO_INCREMENT NOT NULL,
	title VARCHAR(256) NOT NULL,
	picture blob,
	item_type VARCHAR(256) NOT NULL,
	location VARCHAR(256) NOT NULL,
	public_description VARCHAR(256) NOT NULL,
	ingroup_description VARCHAR(256) NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE lost_and_found_space_members (
	space_id INT NOT NULL,
	email_id VARCHAR(256) NOT NULL,
    is_creator BIT NOT NULL,
    FOREIGN KEY (space_id) REFERENCES lost_and_found_space(id)
);
