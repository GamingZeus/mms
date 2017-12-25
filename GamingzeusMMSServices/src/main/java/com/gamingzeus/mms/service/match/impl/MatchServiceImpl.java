package com.gamingzeus.mms.service.match.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamingzeus.mms.core.entity.Match;
import com.gamingzeus.mms.dbaccess.mysql.match.IMatchDao;
import com.gamingzeus.mms.service.match.IMatchService;

@Service("matchService")
public class MatchServiceImpl implements IMatchService{

	@Autowired
	private IMatchDao matchDao;
	
	@Override
	@Transactional
	public Match addOrUpdateMatch(Match match) {
		return matchDao.addOrUpdateMatch(match);
	}

	@Override
	@Transactional(readOnly=true)
	public Match getMatchByChallengeId(Long challengeId) {
		return matchDao.getMatchByChallengeId(challengeId);
	}

}
