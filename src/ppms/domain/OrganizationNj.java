package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */
public class OrganizationNj extends AbstractOrganizationNj implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrganizationNj() {
	}

	/** minimal constructor */
	public OrganizationNj(Integer orgId) {
		super(orgId);
	}

	/** full constructor */
	public OrganizationNj(Integer orgId, String orgName, String address,
			Date expireTime, Integer superiorId, Boolean status,
			String contactName, String contactTel, BigDecimal userCounty,
			Byte type, Integer regionId, String channelType,
			Set tbChangeOrgHistories, Set tbStandardChecks,
			Set tbSubAreaOrgRelations, Set tbOperationChecks,
			Set tbFreshEmployeeExams, Set tbMonthExams, Set tbMonitorChecks,
			Set tbMountGuardExams, Set tbPerformances, Set tbVisitChecks,
			Set tbInnovations, Set tbOrgPraiseCriticisms, Set tbEmployees,
			Set tbPromotionTrainings) {
		super(orgId, orgName, address, expireTime, superiorId, status,
				contactName, contactTel, userCounty, type, regionId,
				channelType, tbChangeOrgHistories, tbStandardChecks,
				tbSubAreaOrgRelations, tbOperationChecks, tbFreshEmployeeExams,
				tbMonthExams, tbMonitorChecks, tbMountGuardExams,
				tbPerformances, tbVisitChecks, tbInnovations,
				tbOrgPraiseCriticisms, tbEmployees, tbPromotionTrainings);
	}

}
