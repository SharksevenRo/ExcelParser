package ppms.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbEmployeePraiseCriticism entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see ppms.domain.TbEmployeePraiseCriticism
 * @author MyEclipse Persistence Tools
 */
public class TbEmployeePraiseCriticismDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbEmployeePraiseCriticismDAO.class);
	// property constants
	public static final String ORG_ID = "orgId";
	public static final String PRAISE_CRITICISM_TYPE = "praiseCriticismType";
	public static final String CAUSE = "cause";
	public static final String PRAISE_CRITICISM_LEVEL = "praiseCriticismLevel";
	public static final String ORG_PRAISE_CRITICM_RELATION_ID = "orgPraiseCriticmRelationId";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbEmployeePraiseCriticism transientInstance) {
		log.debug("saving TbEmployeePraiseCriticism instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbEmployeePraiseCriticism persistentInstance) {
		log.debug("deleting TbEmployeePraiseCriticism instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbEmployeePraiseCriticism findById(java.lang.String id) {
		log.debug("getting TbEmployeePraiseCriticism instance with id: " + id);
		try {
			TbEmployeePraiseCriticism instance = (TbEmployeePraiseCriticism) getSession()
					.get("ppms.domain.TbEmployeePraiseCriticism", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbEmployeePraiseCriticism instance) {
		log.debug("finding TbEmployeePraiseCriticism instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbEmployeePraiseCriticism")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbEmployeePraiseCriticism instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbEmployeePraiseCriticism as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrgId(Object orgId) {
		return findByProperty(ORG_ID, orgId);
	}

	public List findByPraiseCriticismType(Object praiseCriticismType) {
		return findByProperty(PRAISE_CRITICISM_TYPE, praiseCriticismType);
	}

	public List findByCause(Object cause) {
		return findByProperty(CAUSE, cause);
	}

	public List findByPraiseCriticismLevel(Object praiseCriticismLevel) {
		return findByProperty(PRAISE_CRITICISM_LEVEL, praiseCriticismLevel);
	}

	public List findByOrgPraiseCriticmRelationId(
			Object orgPraiseCriticmRelationId) {
		return findByProperty(ORG_PRAISE_CRITICM_RELATION_ID,
				orgPraiseCriticmRelationId);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbEmployeePraiseCriticism instances");
		try {
			String queryString = "from TbEmployeePraiseCriticism";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbEmployeePraiseCriticism merge(
			TbEmployeePraiseCriticism detachedInstance) {
		log.debug("merging TbEmployeePraiseCriticism instance");
		try {
			TbEmployeePraiseCriticism result = (TbEmployeePraiseCriticism) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbEmployeePraiseCriticism instance) {
		log.debug("attaching dirty TbEmployeePraiseCriticism instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbEmployeePraiseCriticism instance) {
		log.debug("attaching clean TbEmployeePraiseCriticism instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}