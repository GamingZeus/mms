/* status: OPEN, ACTIVE, DECIDED, EXPIRED */

use mms:

CREATE TABLE `matches` (
  `id` int(11) NOT NULL,
  `challenge_id` int(11) NOT NULL,
  `c1_reported_score` VARCHAR(20),
  `c2_reported_score` VARCHAR(20),
  `c1_reported_winner` VARCHAR(20),
  `c2_reported_winner` VARCHAR(20),
  `c1_reported_time` datetime,
  `c2_reported_time` datetime,
  `status` VARCHAR(10) NOT NULL,
  `created` datetime NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
  PRIMARY KEY (`id`),
  KEY `idx_games` (``)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

