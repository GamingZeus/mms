package com.gamingzeus.mms.service.challenge.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamingzeus.mms.core.entity.Challenge;
import com.gamingzeus.mms.service.challenge.IChallengeService;

@Service("challengeService")
public class ChallengeServiceImpl implements IChallengeService {

	@Autowired
	private IChallengeService challengeService;

	@Override
	public Challenge addOrUpdateChallenge(Challenge challenge) {
		return challengeService.addOrUpdateChallenge(challenge);
	}

	@Override
	public List<Challenge> getChallengesSent(String userId, int page, int size) {
		return challengeService.getChallengesSent(userId, page, size);
	}

	@Override
	public List<Challenge> getChallengesReceived(String userId, int page,
			int size) {
		return challengeService.getChallengesReceived(userId, page, size);
	}

}
