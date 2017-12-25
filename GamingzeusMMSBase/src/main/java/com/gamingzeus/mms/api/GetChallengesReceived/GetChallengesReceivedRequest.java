package com.gamingzeus.mms.api.GetChallengesReceived;

import io.protostuff.Tag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gamingzeus.base.transport.ServiceRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetChallengesReceivedRequest extends ServiceRequest {

	private static final long serialVersionUID = -6384650472067921909L;
	
	@Tag(100)
	private String userId;
	
	@Tag(101)
	private int page;
	
	@Tag(102)
	private int size;

	public GetChallengesReceivedRequest(String userId, int page, int size) {
		super();
		this.userId = userId;
		this.page = page;
		this.size = size;
	}

	public GetChallengesReceivedRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "GetChallengesSentRequest [userId=" + userId + ", page=" + page
				+ ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + page;
		result = prime * result + size;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		GetChallengesReceivedRequest other = (GetChallengesReceivedRequest) obj;
		if (page != other.page)
			return false;
		if (size != other.size)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
}
