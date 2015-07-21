package ppms.domain;

import java.util.Date;

/**
 * TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeOrgHistory extends AbstractTbChangeOrgHistory implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbChangeOrgHistory() {
	}

	/** minimal constructor */
	public TbChangeOrgHistory(String orgHistoryId) {
		super(orgHistoryId);
	}

	/** full constructor */
	public TbChangeOrgHistory(String orgHistoryId,
			OrganizationNj organizationNj, String employeeId, Integer inOrgId,
			Date changeDate, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(orgHistoryId, organizationNj, employeeId, inOrgId, changeDate,
				createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
