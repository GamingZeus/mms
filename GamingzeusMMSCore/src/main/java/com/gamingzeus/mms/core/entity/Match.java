package com.gamingzeus.mms.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "match", catalog = "mms")
public class Match implements Serializable {

	private static final long serialVersionUID = 1706645922578797882L;

	@Column(name = "challenge_id")
	@Id
	private Long challengeId;

	@Column(name = "c1_reported_score")
	private String c1ReportedScore;

	@Column(name = "c2_reported_score")
	private String c2ReportedScore;

	@Column(name = "c1_reported_winner")
	private String c1ReportedWinner;

	@Column(name = "c2_reported_winner")
	private String c2ReportedWinner;

	@Column(name = "c1_reported_time")
	private Date c1ReportedTime;

	@Column(name = "c2_reported_time")
	private Date c2ReportedTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, updatable = false)
	private Date created;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated", nullable = false, updatable = false, insertable = false)
	private Date updated;

	public Match() {
		super();
	}


	public Match(Long challengeId, String c1ReportedScore,
			String c2ReportedScore, String c1ReportedWinner,
			String c2ReportedWinner, Date c1ReportedTime, Date c2ReportedTime,
			Date created, Date updated) {
		super();
		this.challengeId = challengeId;
		this.c1ReportedScore = c1ReportedScore;
		this.c2ReportedScore = c2ReportedScore;
		this.c1ReportedWinner = c1ReportedWinner;
		this.c2ReportedWinner = c2ReportedWinner;
		this.c1ReportedTime = c1ReportedTime;
		this.c2ReportedTime = c2ReportedTime;
		this.created = created;
		this.updated = updated;
	}

	public Long getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(Long challengeId) {
		this.challengeId = challengeId;
	}

	public String getC1ReportedScore() {
		return c1ReportedScore;
	}

	public void setC1ReportedScore(String c1ReportedScore) {
		this.c1ReportedScore = c1ReportedScore;
	}

	public String getC2ReportedScore() {
		return c2ReportedScore;
	}

	public void setC2ReportedScore(String c2ReportedScore) {
		this.c2ReportedScore = c2ReportedScore;
	}

	public String getC1ReportedWinner() {
		return c1ReportedWinner;
	}

	public void setC1ReportedWinner(String c1ReportedWinner) {
		this.c1ReportedWinner = c1ReportedWinner;
	}

	public String getC2ReportedWinner() {
		return c2ReportedWinner;
	}

	public void setC2ReportedWinner(String c2ReportedWinner) {
		this.c2ReportedWinner = c2ReportedWinner;
	}

	public Date getC1ReportedTime() {
		return c1ReportedTime;
	}

	public void setC1ReportedTime(Date c1ReportedTime) {
		this.c1ReportedTime = c1ReportedTime;
	}

	public Date getC2ReportedTime() {
		return c2ReportedTime;
	}

	public void setC2ReportedTime(Date c2ReportedTime) {
		this.c2ReportedTime = c2ReportedTime;
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
		return "Match [challengeId=" + challengeId + ", c1ReportedScore="
				+ c1ReportedScore + ", c2ReportedScore=" + c2ReportedScore
				+ ", c1ReportedWinner=" + c1ReportedWinner
				+ ", c2ReportedWinner=" + c2ReportedWinner
				+ ", c1ReportedTime=" + c1ReportedTime + ", c2ReportedTime="
				+ c2ReportedTime + ", created=" + created + ", updated="
				+ updated + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((c1ReportedScore == null) ? 0 : c1ReportedScore.hashCode());
		result = prime * result
				+ ((c1ReportedTime == null) ? 0 : c1ReportedTime.hashCode());
		result = prime
				* result
				+ ((c1ReportedWinner == null) ? 0 : c1ReportedWinner.hashCode());
		result = prime * result
				+ ((c2ReportedScore == null) ? 0 : c2ReportedScore.hashCode());
		result = prime * result
				+ ((c2ReportedTime == null) ? 0 : c2ReportedTime.hashCode());
		result = prime
				* result
				+ ((c2ReportedWinner == null) ? 0 : c2ReportedWinner.hashCode());
		result = prime * result
				+ ((challengeId == null) ? 0 : challengeId.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
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
		Match other = (Match) obj;
		if (c1ReportedScore == null) {
			if (other.c1ReportedScore != null)
				return false;
		} else if (!c1ReportedScore.equals(other.c1ReportedScore))
			return false;
		if (c1ReportedTime == null) {
			if (other.c1ReportedTime != null)
				return false;
		} else if (!c1ReportedTime.equals(other.c1ReportedTime))
			return false;
		if (c1ReportedWinner == null) {
			if (other.c1ReportedWinner != null)
				return false;
		} else if (!c1ReportedWinner.equals(other.c1ReportedWinner))
			return false;
		if (c2ReportedScore == null) {
			if (other.c2ReportedScore != null)
				return false;
		} else if (!c2ReportedScore.equals(other.c2ReportedScore))
			return false;
		if (c2ReportedTime == null) {
			if (other.c2ReportedTime != null)
				return false;
		} else if (!c2ReportedTime.equals(other.c2ReportedTime))
			return false;
		if (c2ReportedWinner == null) {
			if (other.c2ReportedWinner != null)
				return false;
		} else if (!c2ReportedWinner.equals(other.c2ReportedWinner))
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
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		return true;
	}
}
