package com.gamingzeus.mms.api.GetChallengesReceived;

import io.protostuff.Tag;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gamingzeus.base.transport.ServiceResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetChallengesReceivedResponse extends ServiceResponse {

	private static final long serialVersionUID = -7599823826696064015L;

	@Tag(100)
	private List<ChallengesReceived> challengeList;

	public GetChallengesReceivedResponse() {
		super();
	}

	public GetChallengesReceivedResponse(List<ChallengesReceived> challengeList) {
		super();
		this.challengeList = challengeList;
	}

	public List<ChallengesReceived> getChallengeList() {
		return challengeList;
	}

	public void setChallengeList(List<ChallengesReceived> challengeList) {
		this.challengeList = challengeList;
	}

	@Override
	public String toString() {
		return "GetChallengesReceivedResponse [challengeList=" + challengeList
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((challengeList == null) ? 0 : challengeList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetChallengesReceivedResponse other = (GetChallengesReceivedResponse) obj;
		if (challengeList == null) {
			if (other.challengeList != null)
				return false;
		} else if (!challengeList.equals(other.challengeList))
			return false;
		return true;
	}
}
