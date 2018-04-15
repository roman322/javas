CREATE TABLE `telegram_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `chat_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `state` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `chat_id_UNIQUE` (`chat_id` ASC));

CREATE TABLE `vote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `problem_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `value` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `PROBLEM_ID` (`problem_id`),
  KEY `USER_ID` (`user_id`),
  CONSTRAINT `FK_USER_ID` FOREIGN KEY (`user_id`) REFERENCES `telegram_user` (`id`),
  CONSTRAINT `FK_PROBLEM_ID` FOREIGN KEY (`problem_id`) REFERENCES `problem_data` (`id`)
);