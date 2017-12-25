package com.gamingzeus.mms.dbaccess.mysql.match;

import com.gamingzeus.mms.core.entity.Match;

public interface IMatchDao {
	Match addOrUpdateMatch(Match match);
	Match getMatchByChallengeId(Long challengeId);
}
