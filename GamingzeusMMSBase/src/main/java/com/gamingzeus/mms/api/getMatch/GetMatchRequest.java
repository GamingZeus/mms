package com.gamingzeus.mms.api.getMatch;

import io.protostuff.Tag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gamingzeus.base.transport.ServiceRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetMatchRequest extends ServiceRequest {

	private static final long serialVersionUID = -6384650472067921909L;
	
	@Tag(100)
	private String challengeId;

	public GetMatchRequest(String challengeId) {
		super();
		this.challengeId = challengeId;
	}

	public GetMatchRequest() {
		super();
	}

	public String getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(String challengeId) {
		this.challengeId = challengeId;
	}

	@Override
	public String toString() {
		return "GetChallengeRequest [challengeId=" + challengeId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((challengeId == null) ? 0 : challengeId.hashCode());
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
		GetMatchRequest other = (GetMatchRequest) obj;
		if (challengeId == null) {
			if (other.challengeId != null)
				return false;
		} else if (!challengeId.equals(other.challengeId))
			return false;
		return true;
	}
}
