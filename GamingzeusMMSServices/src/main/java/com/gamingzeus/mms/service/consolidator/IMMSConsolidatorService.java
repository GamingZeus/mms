package com.gamingzeus.mms.service.consolidator;

import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedRequest;
import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedResponse;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentRequest;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentResponse;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeRequest;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeResponse;

public interface IMMSConsolidatorService {

	AddOrUpdateChallengeResponse addOrUpdateChallenge(AddOrUpdateChallengeRequest request);
	GetChallengesReceivedResponse getChallengesReceived(GetChallengesReceivedRequest request);
	GetChallengesSentResponse getChallengesSent(GetChallengesSentRequest request);
	
}
