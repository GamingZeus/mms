package com.gamingzeus.mms.service.match;

import java.util.List;

import com.gamingzeus.mms.core.entity.Challenge;
import com.gamingzeus.mms.core.entity.Match;

public interface IMatchService {
	Match addOrUpdateMatch(Match match);
	Match getMatchByChallengeId(Long challengeId);
}
