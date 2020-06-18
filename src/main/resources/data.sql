
DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

INSERT INTO USERS (first_name, last_name, email) VALUES
  ('Smitha', 'sanehalli', 'abc@gmail.com'),
  ('Deja', 'Vu', 'xyz@email.com'),
  ('Ben', 'miller', 'ben@miller.com');