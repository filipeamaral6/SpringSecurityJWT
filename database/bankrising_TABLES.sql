DROP TABLE IF exists withdraw;
DROP TABLE IF exists account_client;
DROP TABLE IF exists deposit;
DROP TABLE IF exists transfer;
DROP TABLE IF exists payment;
DROP TABLE IF exists `transaction`;
DROP TABLE IF exists account;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS user;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `status` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `nif` int(11) NOT NULL,
  `client_cc` int(11) NOT NULL,
  `birthdate` date NOT NULL,
  `phone_number` bigint(20) DEFAULT NULL,
  `mobile_number` bigint(20) DEFAULT NULL,
  `address` varchar(255) NOT NULL,
  `zip_code` varchar(100) NOT NULL,
  `county` varchar(100) NOT NULL,
  `country` varchar(255) NOT NULL,
  `nationality` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL DEFAULT 'ACTIVE',
  `notification` varchar(100) NOT NULL DEFAULT 'TRUE',
  `transaction_password` varchar(255) NOT NULL,
  `created_at` date NOT NULL DEFAULT curdate(),
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `client_user_fk` (`user_id`),
  CONSTRAINT `client_user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_user_fk` (`user_id`),
  CONSTRAINT `employee_user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `iban` varchar(255) NOT NULL,
  `account_number` bigint(20) NOT NULL,
  `balance` double NOT NULL DEFAULT 500,
  `interest` double NOT NULL DEFAULT 0.02,
  `status` varchar(100) NOT NULL DEFAULT 'ACTIVE',
  `created_at` date NOT NULL DEFAULT curdate(),
  `employee_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_un_iban` (`iban`),
  UNIQUE KEY `account_un_acc_number` (`account_number`),
  KEY `account_employee_fk` (`employee_id`),
  CONSTRAINT `account_employee_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `account_client` (
  `account_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  KEY `account_client_account_fk` (`account_id`),
  KEY `account_client_user_fk` (`user_id`),
  CONSTRAINT `account_client_account_fk` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `account_client_user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` double NOT NULL,
  `account_iban` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp(),
  `user_id` int(11) DEFAULT NULL,
  `type` varchar(100) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `transaction_account_fk` (`account_iban`),
  KEY `transaction_user_fk` (`user_id`),
  KEY `transaction_fk` (`account_id`),
  CONSTRAINT `transaction_account_fk` FOREIGN KEY (`account_iban`) REFERENCES `account` (`iban`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transaction_fk` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transaction_user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `deposit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  `depositer_name` varchar(255) NOT NULL,
  `depositer_cc_number` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `deposit_employee_fk` (`employee_id`),
  KEY `deposit_transaction_fk` (`transaction_id`),
  CONSTRAINT `deposit_employee_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `deposit_transaction_fk` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entity` int(11) NOT NULL,
  `reference` int(11) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `payment_transaction_fk` (`transaction_id`),
  CONSTRAINT `payment_transaction_fk` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `transfer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `destination_iban` varchar(255) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `transfer_transaction_fk` (`transaction_id`),
  KEY `transfer_employee_fk` (`employee_id`),
  CONSTRAINT `transfer_employee_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transfer_transaction_fk` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `withdraw` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `withdraw_transaction_fk` (`transaction_id`),
  KEY `withdraw_employee_fk` (`employee_id`),
  CONSTRAINT `withdraw_employee_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `withdraw_transaction_fk` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


