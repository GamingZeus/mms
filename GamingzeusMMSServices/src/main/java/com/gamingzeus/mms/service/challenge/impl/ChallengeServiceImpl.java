package com.gamingzeus.mms.service.challenge.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamingzeus.mms.core.entity.Challenge;
import com.gamingzeus.mms.dbaccess.mysql.challenge.IChallengeDao;
import com.gamingzeus.mms.service.challenge.IChallengeService;

@Service("challengeService")
public class ChallengeServiceImpl implements IChallengeService {

	@Autowired
	private IChallengeDao challengeDao;

	@Override
	public Challenge addOrUpdateChallenge(Challenge challenge) {
		return challengeDao.addOrUpdateChallenge(challenge);
	}

	@Override
	public List<Challenge> getChallengesSent(String userId, int page, int size) {
		return challengeDao.getChallengesSent(userId, page, size);
	}

	@Override
	public List<Challenge> getChallengesReceived(String userId, int page,
			int size) {
		return challengeDao.getChallengesReceived(userId, page, size);
	}

	@Override
	public Challenge getChallengeById(Long challengeId) {
		return challengeDao.getChallengeById(challengeId);
	}

}
