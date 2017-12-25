package com.gamingzeus.mms.service.challenge;

import java.util.List;

import com.gamingzeus.mms.core.entity.Challenge;

public interface IChallengeService {
	Challenge addOrUpdateChallenge(Challenge challenge);
	List<Challenge> getChallengesSent(String userId, int page, int size);
	List<Challenge> getChallengesReceived(String userId, int page, int size);
}
