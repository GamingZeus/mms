package com.gamingzeus.mms.service.consolidator.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamingzeus.base.exception.FocusWSErrorCode;
import com.gamingzeus.base.utils.DateUtils;
import com.gamingzeus.mms.api.GetChallengesReceived.ChallengesReceived;
import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedRequest;
import com.gamingzeus.mms.api.GetChallengesReceived.GetChallengesReceivedResponse;
import com.gamingzeus.mms.api.GetChallengesSent.ChallengesSent;
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
import com.gamingzeus.mms.core.entity.Challenge;
import com.gamingzeus.mms.core.entity.Match;
import com.gamingzeus.mms.service.challenge.IChallengeService;
import com.gamingzeus.mms.service.consolidator.IMMSConsolidatorService;
import com.gamingzeus.mms.service.match.IMatchService;

@Service("mmsConsolidatorService")
public class MMSConsolidatorServiceImpl implements IMMSConsolidatorService {

	@Autowired
	private IChallengeService challengeService;

	@Autowired
	private IMatchService matchService;

	@Override
	public AddOrUpdateChallengeResponse addOrUpdateChallenge(
			AddOrUpdateChallengeRequest request) {
		AddOrUpdateChallengeResponse response = new AddOrUpdateChallengeResponse();
		Challenge challenge = new Challenge();
		if (!StringUtils.isEmpty(request.getChallengeId())) {
			challenge = challengeService.getChallengeById(Long.valueOf(request
					.getChallengeId()));
		}
		if (challenge == null) {
			challenge = new Challenge();
		}
		challenge.setBidAmount(request.getBidAmount());
		if (challenge.getCreated() == null) {
			challenge.setCreated(DateUtils.getCurrentTime());
		}
		challenge.setGameId(request.getGameId());
		challenge.setPlatform(request.getPlatform());
		challenge.setStatus(request.getStatus());
		challenge.setUpdated(DateUtils.getCurrentTime());
		challenge.setUserId1(request.getUserId1());
		challenge.setUserId2(request.getUserId2());
		challenge.setVisibility(request.getVisibility());
		challenge = challengeService.addOrUpdateChallenge(challenge);
		response.setChallengeId(String.valueOf(challenge.getChallengeId()));
		response.setBidAmount(request.getBidAmount());
		response.setCreated(DateUtils.getCurrentTime());
		response.setGameId(request.getGameId());
		response.setPlatform(request.getPlatform());
		response.setStatus(request.getStatus());
		response.setUserId1(request.getUserId1());
		response.setUserId2(request.getUserId2());
		response.setVisibility(request.getVisibility());
		response.setCode("0");
		return response;
	}

	@Override
	public GetChallengesReceivedResponse getChallengesReceived(
			GetChallengesReceivedRequest request) {
		GetChallengesReceivedResponse response = new GetChallengesReceivedResponse();
		if (StringUtils.isEmpty(request.getUserId())) {
			response.setCode(FocusWSErrorCode.INVALID_REQUEST.getCode());
			response.setMessage("Request Validation Failed");
			return response;
		}

		List<Challenge> challengeList = challengeService.getChallengesReceived(
				request.getUserId(), request.getPage(), request.getSize());
		if (challengeList != null && !challengeList.isEmpty()) {
			List<ChallengesReceived> challengesReceivedList = new ArrayList<ChallengesReceived>();
			for (Challenge c : challengeList) {
				ChallengesReceived cr = new ChallengesReceived();
				cr.setBidAmount(c.getBidAmount());
				cr.setChallengeId(String.valueOf(c.getChallengeId()));
				cr.setGameId(c.getGameId());
				cr.setPlatform(c.getPlatform());
				cr.setStatus(c.getStatus());
				cr.setUserId1(c.getUserId1());
				cr.setUserId2(c.getUserId2());
				cr.setVisibility(c.getVisibility());
				cr.setCreated(c.getCreated());
				challengesReceivedList.add(cr);
			}
			response.setChallengeList(challengesReceivedList);
		}
		response.setCode("0");
		return response;
	}

	@Override
	public GetChallengesSentResponse getChallengesSent(
			GetChallengesSentRequest request) {
		GetChallengesSentResponse response = new GetChallengesSentResponse();
		if (StringUtils.isEmpty(request.getUserId())) {
			response.setCode(FocusWSErrorCode.INVALID_REQUEST.getCode());
			response.setMessage("Request Validation Failed");
			return response;
		}

		List<Challenge> challengeList = challengeService.getChallengesSent(
				request.getUserId(), request.getPage(), request.getSize());
		if (challengeList != null && !challengeList.isEmpty()) {
			List<ChallengesSent> challengesReceivedList = new ArrayList<ChallengesSent>();
			for (Challenge c : challengeList) {
				ChallengesSent cs = new ChallengesSent();
				cs.setBidAmount(c.getBidAmount());
				cs.setChallengeId(String.valueOf(c.getChallengeId()));
				cs.setGameId(c.getGameId());
				cs.setPlatform(c.getPlatform());
				cs.setStatus(c.getStatus());
				cs.setUserId1(c.getUserId1());
				cs.setUserId2(c.getUserId2());
				cs.setVisibility(c.getVisibility());
				cs.setCreated(c.getCreated());
				challengesReceivedList.add(cs);
			}
			response.setChallengeList(challengesReceivedList);
		}
		response.setCode("0");
		return response;
	}

	@Override
	public GetChallengeResponse getChallenge(GetChallengeRequest request) {
		GetChallengeResponse response = new GetChallengeResponse();
		if (StringUtils.isEmpty(request.getChallengeId())) {
			response.setCode(FocusWSErrorCode.INVALID_REQUEST.getCode());
			response.setMessage("Request Validation Failed");
			return response;
		}
		Challenge c = challengeService.getChallengeById(Long.valueOf(request
				.getChallengeId()));
		if (c != null) {
			response.setBidAmount(c.getBidAmount());
			response.setChallengeId(String.valueOf(c.getChallengeId()));
			response.setGameId(c.getGameId());
			response.setPlatform(c.getPlatform());
			response.setStatus(c.getStatus());
			response.setUserId1(c.getUserId1());
			response.setUserId2(c.getUserId2());
			response.setVisibility(c.getVisibility());
			response.setCreated(c.getCreated());
		}
		response.setCode("0");
		return response;
	}

	@Override
	public AddOrUpdateMatchResponse addOrUpdateMatch(
			AddOrUpdateMatchRequest request) {
		AddOrUpdateMatchResponse response = new AddOrUpdateMatchResponse();
		Match match = new Match();
		if (!StringUtils.isEmpty(request.getChallengeId())) {
			match = matchService.getMatchByChallengeId(Long.valueOf(request
					.getChallengeId()));
		}
		match.setChallengeId(Long.valueOf(request.getChallengeId()));
		match.setC1ReportedScore(request.getC1ReportedScore());
		match.setC1ReportedTime(request.getC1ReportedTime());
		match.setC1ReportedWinner(request.getC1ReportedWinner());
		match.setC2ReportedScore(request.getC2ReportedScore());
		match.setC2ReportedTime(request.getC2ReportedTime());
		match.setC2ReportedWinner(request.getC2ReportedWinner());
		if (match.getCreated() == null) {
			match.setCreated(DateUtils.getCurrentTime());
		}
		match.setUpdated(DateUtils.getCurrentTime());
		match = matchService.addOrUpdateMatch(match);
		response.setChallengeId(Long.valueOf(request.getChallengeId()));
		response.setC1ReportedScore(request.getC1ReportedScore());
		response.setC1ReportedTime(request.getC1ReportedTime());
		response.setC1ReportedWinner(request.getC1ReportedWinner());
		response.setC2ReportedScore(request.getC2ReportedScore());
		response.setC2ReportedTime(request.getC2ReportedTime());
		response.setC2ReportedWinner(request.getC2ReportedWinner());
		response.setCreated(DateUtils.getCurrentTime());
		return response;

	}

	@Override
	public GetMatchResponse getMatch(GetMatchRequest request) {
		GetMatchResponse response = new GetMatchResponse();
		if (StringUtils.isEmpty(request.getChallengeId())) {
			response.setCode(FocusWSErrorCode.INVALID_REQUEST.getCode());
			response.setMessage("Request Validation Failed");
			return response;
		}
		Match m = matchService.getMatchByChallengeId(Long.valueOf(request
				.getChallengeId()));
		if (m != null) {
			response.setChallengeId(Long.valueOf(m.getChallengeId()));
			response.setC1ReportedScore(m.getC1ReportedScore());
			response.setC1ReportedTime(m.getC1ReportedTime());
			response.setC1ReportedWinner(m.getC1ReportedWinner());
			response.setC2ReportedScore(m.getC2ReportedScore());
			response.setC2ReportedTime(m.getC2ReportedTime());
			response.setC2ReportedWinner(m.getC2ReportedWinner());
			response.setCreated(DateUtils.getCurrentTime());
			response.setCreated(m.getCreated());
		}
		response.setCode("0");
		return response;
	}

}
