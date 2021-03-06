package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * CUserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.CUserInfo
 * @author MyEclipse Persistence Tools
 */
public class CUserInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CUserInfoDAO.class);
	// property constants
	public static final String OPER_NAME = "operName";
	public static final String OPER_PASS = "operPass";
	public static final String ROLE_ID = "roleId";
	public static final String ORG_ID = "orgId";
	public static final String ZW_ID = "zwId";

	public void save(CUserInfo transientInstance) {
		log.debug("saving CUserInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CUserInfo persistentInstance) {
		log.debug("deleting CUserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CUserInfo findById(java.math.BigDecimal id) {
		log.debug("getting CUserInfo instance with id: " + id);
		try {
			CUserInfo instance = (CUserInfo) getSession().get(
					"ppms.domain.CUserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CUserInfo instance) {
		log.debug("finding CUserInfo instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.CUserInfo")
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
		log.debug("finding CUserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CUserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOperName(Object operName) {
		return findByProperty(OPER_NAME, operName);
	}

	public List findByOperPass(Object operPass) {
		return findByProperty(OPER_PASS, operPass);
	}

	public List findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List findByOrgId(Object orgId) {
		return findByProperty(ORG_ID, orgId);
	}

	public List findByZwId(Object zwId) {
		return findByProperty(ZW_ID, zwId);
	}

	public List findAll() {
		log.debug("finding all CUserInfo instances");
		try {
			String queryString = "from CUserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CUserInfo merge(CUserInfo detachedInstance) {
		log.debug("merging CUserInfo instance");
		try {
			CUserInfo result = (CUserInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CUserInfo instance) {
		log.debug("attaching dirty CUserInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CUserInfo instance) {
		log.debug("attaching clean CUserInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}