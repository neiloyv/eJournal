-- Table: users
DROP TABLE IF EXISTS `users`;
CREATE TABLE users (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- Table: roles
DROP TABLE IF EXISTS `roles`;
CREATE TABLE roles (
  id    INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;

-- Table for mapping user and roles: user_roles
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id),
  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;
-- Insert data
INSERT INTO users VALUES (1, 'adminadmin', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG');
INSERT INTO roles VALUES (1, 'USER');
INSERT INTO roles VALUES (2, 'ADMIN');
INSERT INTO user_roles VALUES (1, 2);

-- Table: clients
DROP TABLE IF EXISTS `clients`;
CREATE TABLE `clients` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `surname` varchar(255) NOT NULL,
                         `name` varchar(255) NOT NULL,
                         `birthday` varchar(45) NOT NULL,
                         `parent` varchar(255) NOT NULL,
                         `phone` varchar(45) NOT NULL,
                         `group` varchar(255) NOT NULL,
                         PRIMARY KEY (`id`,`group`),
                         KEY `group_idx` (`group`),
                         KEY `title_idx` (`group`),
                         CONSTRAINT `Groups_fk` FOREIGN KEY (`group`) REFERENCES `groups` (`title`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table: groups
DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `title` varchar(255) NOT NULL,
                        PRIMARY KEY (`id`),
                        KEY `GROUPS_ID_idx` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
