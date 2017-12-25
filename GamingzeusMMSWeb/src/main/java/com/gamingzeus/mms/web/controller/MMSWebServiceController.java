package com.gamingzeus.mms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedRequest;
import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedResponse;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentRequest;
import com.gamingzeus.mms.api.GetChallengesSent.GetChallengesSentResponse;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeRequest;
import com.gamingzeus.mms.api.addOrUpdateChallenge.AddOrUpdateChallengeResponse;
import com.gamingzeus.mms.service.consolidator.IMMSConsolidatorService;

@RestController
@RequestMapping("/service/mms")
public class MMSWebServiceController {

	private static final Logger LOG = LoggerFactory
			.getLogger(MMSWebServiceController.class);

	@Autowired
	private IMMSConsolidatorService mmsConslidatorService;

	@RequestMapping("/addOrUpdateChallenge")
	public AddOrUpdateChallengeResponse addOrUpdateChallenge(
			@RequestBody AddOrUpdateChallengeRequest request) {
		AddOrUpdateChallengeResponse response = null;
		try {
			response =  mmsConslidatorService.addOrUpdateChallenge(request);
			response.setProtocol(request.getResponseProtocol());
			return response;
		} catch (Throwable e) {
			LOG.error("Something went wrong during addOrUpdateChallenge call");
			LOG.error("Exception", e);
			LOG.info("addOrUpdateChallenge error:" + e);
			response = new AddOrUpdateChallengeResponse();
			response.setCode("5");
			response.setMessage("Something is wrong");
			return response;
		}
	}
	
	@RequestMapping("/getChallengesReceived")
	public GetChallengesReceivedResponse getChallengesReceived(
			@RequestBody GetChallengesReceivedRequest request) {
		GetChallengesReceivedResponse response = null;
		try {
			response =  mmsConslidatorService.getChallengesReceived(request);
			response.setProtocol(request.getResponseProtocol());
			return response;
		} catch (Throwable e) {
			LOG.error("Something went wrong during getChallengesReceived call");
			LOG.error("Exception", e);
			LOG.info("getChallengesReceived error:" + e);
			response = new GetChallengesReceivedResponse();
			response.setCode("5");
			response.setMessage("Something is wrong");
			return response;
		}
	}
	
	@RequestMapping("/getChallengesSent")
	public GetChallengesSentResponse getChallengesSent(
			@RequestBody GetChallengesSentRequest request) {
		GetChallengesSentResponse response = null;
		try {
			response =  mmsConslidatorService.getChallengesSent(request);
			response.setProtocol(request.getResponseProtocol());
			return response;
		} catch (Throwable e) {
			LOG.error("Something went wrong during GetChallengesSentResponse call");
			LOG.error("Exception", e);
			LOG.info("GetChallengesSentResponse error:" + e);
			response = new GetChallengesSentResponse();
			response.setCode("5");
			response.setMessage("Something is wrong");
			return response;
		}
	}

}
