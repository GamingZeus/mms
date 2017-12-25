package com.gamingzeus.mms.dbaccess.mysql.challenge.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gamingzeus.mms.core.entity.Challenge;
import com.gamingzeus.mms.dbaccess.mysql.challenge.IChallengeDao;

public class ChallengeDaoImpl implements IChallengeDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Challenge addOrUpdateChallenge(Challenge challenge) {
		return (Challenge) sessionFactory.getCurrentSession().merge(challenge);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Challenge> getChallengesSent(String userId, int page, int size) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Challenge where userId1=:userId");
		query.setParameter("userId", userId);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Challenge> getChallengesReceived(String userId, int page,
			int size) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Challenge where userId2=:userId");
		query.setParameter("userId", userId);
		return query.list();
	}

	@Override
	public Challenge getChallengeById(Long challengeId) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Challenge where challengeId=:challengeId");
		query.setParameter("challengeId", challengeId);
		return (Challenge)query.uniqueResult();
	}

}
