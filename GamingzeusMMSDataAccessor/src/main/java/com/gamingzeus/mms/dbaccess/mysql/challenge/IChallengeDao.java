package com.gamingzeus.mms.dbaccess.mysql.challenge;

import java.util.List;

import com.gamingzeus.mms.core.entity.Challenge;

public interface IChallengeDao {

	Challenge addOrUpdateChallenge(Challenge challenge);
	List<Challenge> getChallengesSent(String userId, int page, int size);
	List<Challenge> getChallengesReceived(String userId, int page, int size);
	Challenge getChallengeById(Long challengeId);
}
