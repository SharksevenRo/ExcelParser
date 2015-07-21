package ppms.domain;

import java.util.Date;

/**
 * TbInnovation entity. @author MyEclipse Persistence Tools
 */
public class TbInnovation extends AbstractTbInnovation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbInnovation() {
	}

	/** minimal constructor */
	public TbInnovation(String innovationId) {
		super(innovationId);
	}

	/** full constructor */
	public TbInnovation(String innovationId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Integer employeeOrgId,
			String innovationContent, Date assessDate, String assessResult,
			String assessLevel, String encouragement, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(innovationId, organizationNj, tbEmployee, employeeOrgId,
				innovationContent, assessDate, assessResult, assessLevel,
				encouragement, createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
