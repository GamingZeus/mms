package com.gamingzeus.mms.dbaccess.mysql.match.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gamingzeus.mms.core.entity.Match;
import com.gamingzeus.mms.dbaccess.mysql.match.IMatchDao;
class MatchDaoImpl implements IMatchDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Match addOrUpdateMatch(Match match) {
		return (Match) sessionFactory.getCurrentSession().merge(match);
	}

	@Override
	public Match getMatchByChallengeId(Long challengeId) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Match where challengeId=:challengeId");
		query.setParameter("challengeId", challengeId);
		return (Match)query.uniqueResult();
	}

}
