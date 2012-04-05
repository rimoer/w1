CREATE TABLE `t_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `column1` varchar(200) DEFAULT NULL,
  `column2` varchar(200) DEFAULT NULL,
  `column3` varchar(200) DEFAULT NULL,
  `column4` varchar(200) DEFAULT NULL,
  `column5` varchar(200) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `last_update_by` varchar(30) DEFAULT NULL,
  `last_update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

