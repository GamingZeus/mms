use mms:

CREATE TABLE `games` (
  `id` int(10) NOT NULL,
  `games` VARCHAR(1024) NOT NULL,
  `created` datetime NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
  PRIMARY KEY (`id`),
  KEY `idx_games` (`games`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

