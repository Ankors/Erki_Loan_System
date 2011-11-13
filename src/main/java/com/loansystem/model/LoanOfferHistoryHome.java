package com.loansystem.model;

// default package
// Generated Nov 13, 2011 9:49:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class LoanOfferHistory.
 * @see .LoanOfferHistory
 * @author Hibernate Tools
 */
public class LoanOfferHistoryHome {

	private static final Log log = LogFactory.getLog(LoanOfferHistoryHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LoanOfferHistory transientInstance) {
		log.debug("persisting LoanOfferHistory instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LoanOfferHistory instance) {
		log.debug("attaching dirty LoanOfferHistory instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LoanOfferHistory instance) {
		log.debug("attaching clean LoanOfferHistory instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LoanOfferHistory persistentInstance) {
		log.debug("deleting LoanOfferHistory instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LoanOfferHistory merge(LoanOfferHistory detachedInstance) {
		log.debug("merging LoanOfferHistory instance");
		try {
			LoanOfferHistory result = (LoanOfferHistory) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LoanOfferHistory findById(java.lang.String id) {
		log.debug("getting LoanOfferHistory instance with id: " + id);
		try {
			LoanOfferHistory instance = (LoanOfferHistory) sessionFactory.getCurrentSession().get("LoanOfferHistory",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LoanOfferHistory instance) {
		log.debug("finding LoanOfferHistory instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("LoanOfferHistory")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
