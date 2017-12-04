/* status: PENDING, EXPIRED, LOCKED */
use mms;

CREATE TABLE `challenges` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id_1` VARCHAR(64) NOT NULL,
  `user_id_2` VARCHAR(64) NOT NULL,
  `status` VARCHAR(10) NOT NULL,
  `platform` VARCHAR(10) NOT NULL,
  `bid_amount` int (10) NOT NULL,
  `game_id` int (10),
  `created` datetime NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
  PRIMARY KEY (`id`),
  KEY `idx_c_ui1` (`user_id_1`),
  KEY `idx_c_ui2` (`user_id_2`),
  KEY `idx_c_gid` (`game_id`),
  KEY `idx_c_ba` (`bid_amount`),
  KEY `idx_c_p` (`platform`),
  KEY `idx_c_st` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
