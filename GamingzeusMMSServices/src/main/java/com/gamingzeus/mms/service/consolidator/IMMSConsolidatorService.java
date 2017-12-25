package com.gamingzeus.mms.service.consolidator;

import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedRequest;
import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedResponse;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentRequest;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentResponse;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeRequest;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeResponse;
import com.gamingzeus.mms.api.addOrUpdateMatch.AddOrUpdateMatchRequest;
import com.gamingzeus.mms.api.addOrUpdateMatch.AddOrUpdateMatchResponse;
import com.gamingzeus.mms.api.getChallenge.GetChallengeRequest;
import com.gamingzeus.mms.api.getChallenge.GetChallengeResponse;
import com.gamingzeus.mms.api.getMatch.GetMatchRequest;
import com.gamingzeus.mms.api.getMatch.GetMatchResponse;

public interface IMMSConsolidatorService {

	AddOrUpdateChallengeResponse addOrUpdateChallenge(AddOrUpdateChallengeRequest request);
	GetChallengesReceivedResponse getChallengesReceived(GetChallengesReceivedRequest request);
	GetChallengesSentResponse getChallengesSent(GetChallengesSentRequest request);
	GetChallengeResponse getChallenge(GetChallengeRequest request);
	AddOrUpdateMatchResponse addOrUpdateMatch(AddOrUpdateMatchRequest request);
	GetMatchResponse getMatch(GetMatchRequest request);
}
