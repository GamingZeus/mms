/* status: OPEN, ACTIVE, DECIDED, EXPIRED */

use mms:

CREATE TABLE `games` (
  `id` int(11) NOT NULL,
  `challenge_id` int(11) NOT NULL,
  `status` VARCHAR(10) NOT NULL
  `created` datetime NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
  PRIMARY KEY (`id`),
  KEY `idx_games` (``)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

