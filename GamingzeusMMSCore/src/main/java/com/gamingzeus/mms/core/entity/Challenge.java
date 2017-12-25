package com.gamingzeus.mms.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "challenge", catalog = "")
public class Challenge {
	
	@Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long              challengeId;
	
	@Column(name="user_id_1")
	private String userId1;
	
	@Column(name="user_id_2")
	private String userId2;
	
	@Column(name="status")
	private String status;
	
	@Column(name="bid_amount")
	private Double bidAmount;
	
	@Column(name="platform")
	private String platform;
	
	@Column(name="game_id")
	private Double gameId;
	
	@Column(name="visibility")
	private String visibility;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false, updatable = false)
    private Date created;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false, updatable = false, insertable = false)
    private Date updated;
    
    public Challenge() {
		super();
	}

	public Challenge(Long challengeId, String userId1, String userId2,
			String status, Double bidAmount, String platform, Double gameId,
			String visibility, Date created, Date updated) {
		super();
		this.challengeId = challengeId;
		this.userId1 = userId1;
		this.userId2 = userId2;
		this.status = status;
		this.bidAmount = bidAmount;
		this.platform = platform;
		this.gameId = gameId;
		this.visibility = visibility;
		this.created = created;
		this.updated = updated;
	}

	public Long getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(Long challengeId) {
		this.challengeId = challengeId;
	}

	public String getUserId1() {
		return userId1;
	}

	public void setUserId1(String userId1) {
		this.userId1 = userId1;
	}

	public String getUserId2() {
		return userId2;
	}

	public void setUserId2(String userId2) {
		this.userId2 = userId2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Double getGameId() {
		return gameId;
	}

	public void setGameId(Double gameId) {
		this.gameId = gameId;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

      public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

	@Override
	public String toString() {
		return "Challenge [challengeId=" + challengeId + ", userId1=" + userId1
				+ ", userId2=" + userId2 + ", status=" + status
				+ ", bidAmount=" + bidAmount + ", platform=" + platform
				+ ", gameId=" + gameId + ", visibility=" + visibility
				+ ", created=" + created + ", updated=" + updated + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bidAmount == null) ? 0 : bidAmount.hashCode());
		result = prime * result
				+ ((challengeId == null) ? 0 : challengeId.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result
				+ ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((userId1 == null) ? 0 : userId1.hashCode());
		result = prime * result + ((userId2 == null) ? 0 : userId2.hashCode());
		result = prime * result
				+ ((visibility == null) ? 0 : visibility.hashCode());
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
		Challenge other = (Challenge) obj;
		if (bidAmount == null) {
			if (other.bidAmount != null)
				return false;
		} else if (!bidAmount.equals(other.bidAmount))
			return false;
		if (challengeId == null) {
			if (other.challengeId != null)
				return false;
		} else if (!challengeId.equals(other.challengeId))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (userId1 == null) {
			if (other.userId1 != null)
				return false;
		} else if (!userId1.equals(other.userId1))
			return false;
		if (userId2 == null) {
			if (other.userId2 != null)
				return false;
		} else if (!userId2.equals(other.userId2))
			return false;
		if (visibility == null) {
			if (other.visibility != null)
				return false;
		} else if (!visibility.equals(other.visibility))
			return false;
		return true;
	}
}
