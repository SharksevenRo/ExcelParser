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
 * TbMonitorCheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbMonitorCheck
 * @author MyEclipse Persistence Tools
 */
public class TbMonitorCheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonitorCheckDAO.class);
	// property constants
	public static final String CHECK_TYPE = "checkType";
	public static final String DETAIL = "detail";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbMonitorCheck transientInstance) {
		log.debug("saving TbMonitorCheck instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonitorCheck persistentInstance) {
		log.debug("deleting TbMonitorCheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonitorCheck findById(java.lang.String id) {
		log.debug("getting TbMonitorCheck instance with id: " + id);
		try {
			TbMonitorCheck instance = (TbMonitorCheck) getSession().get(
					"ppms.domain.TbMonitorCheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbMonitorCheck instance) {
		log.debug("finding TbMonitorCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonitorCheck")
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
		log.debug("finding TbMonitorCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMonitorCheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCheckType(Object checkType) {
		return findByProperty(CHECK_TYPE, checkType);
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbMonitorCheck instances");
		try {
			String queryString = "from TbMonitorCheck";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbMonitorCheck merge(TbMonitorCheck detachedInstance) {
		log.debug("merging TbMonitorCheck instance");
		try {
			TbMonitorCheck result = (TbMonitorCheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMonitorCheck instance) {
		log.debug("attaching dirty TbMonitorCheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonitorCheck instance) {
		log.debug("attaching clean TbMonitorCheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}