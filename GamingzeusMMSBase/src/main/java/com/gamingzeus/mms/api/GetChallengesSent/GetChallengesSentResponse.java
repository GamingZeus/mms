package com.gamingzeus.mms.api.GetChallengesSent;

import io.protostuff.Tag;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gamingzeus.base.transport.ServiceResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetChallengesSentResponse extends ServiceResponse {

	private static final long serialVersionUID = -701987217289968154L;

	@Tag(100)
	private List<ChallengesSent> challengeList;

	public GetChallengesSentResponse() {
		super();
	}

	public GetChallengesSentResponse(List<ChallengesSent> challengeList) {
		super();
		this.challengeList = challengeList;
	}

	public List<ChallengesSent> getChallengeList() {
		return challengeList;
	}

	public void setChallengeList(List<ChallengesSent> challengeList) {
		this.challengeList = challengeList;
	}

	@Override
	public String toString() {
		return "GetChallengesSentResponse [challengeList=" + challengeList
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
		GetChallengesSentResponse other = (GetChallengesSentResponse) obj;
		if (challengeList == null) {
			if (other.challengeList != null)
				return false;
		} else if (!challengeList.equals(other.challengeList))
			return false;
		return true;
	}
}
