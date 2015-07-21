package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbEmployee entity. @author MyEclipse Persistence Tools
 */
public class TbEmployee extends AbstractTbEmployee implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbEmployee() {
	}

	/** minimal constructor */
	public TbEmployee(String employeeId) {
		super(employeeId);
	}

	/** full constructor */
	public TbEmployee(String employeeId, OrganizationNj organizationNj,
			TbJob tbJob, TbRole tbRole, TbPost tbPost, String employeeName,
			String employeeCode, String idNumber, String idPassword,
			String orgType, Boolean sex, Date birthday, String bankName,
			String bankNumber, Boolean status, String academicDegree,
			String addressArea, String address, String mobileNumber,
			String shortMobileNumber, String schoolName, String specialization,
			String tel, Date enterTime, Boolean frontBackFlag,
			String backJobComment, Boolean telecomLevel, Boolean mobileLevel,
			String employeeType, String qualification, Date jobStartDate,
			Date operatorPassDate, Short operatorExpire,
			Boolean operatorValidFlag, Date auditPassDate, Short auditExpire,
			Boolean auditValidFlag, String remark, Date lastLoginTime,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Set tbMountGuardExams, Set tbMonthExams,
			Set tbInnovations, Set tbFreshEmployeeExams, Set tbPerformances,
			Set tbOperationChecks, Set tbPoints, Set tbChangeJobHistories,
			Set tbEmployeePraiseCriticisms, Set tbPromotionTrainings) {
		super(employeeId, organizationNj, tbJob, tbRole, tbPost, employeeName,
				employeeCode, idNumber, idPassword, orgType, sex, birthday,
				bankName, bankNumber, status, academicDegree, addressArea,
				address, mobileNumber, shortMobileNumber, schoolName,
				specialization, tel, enterTime, frontBackFlag, backJobComment,
				telecomLevel, mobileLevel, employeeType, qualification,
				jobStartDate, operatorPassDate, operatorExpire,
				operatorValidFlag, auditPassDate, auditExpire, auditValidFlag,
				remark, lastLoginTime, createdBy, createdTime, modifiedBy,
				modifiedTime, tbMountGuardExams, tbMonthExams, tbInnovations,
				tbFreshEmployeeExams, tbPerformances, tbOperationChecks,
				tbPoints, tbChangeJobHistories, tbEmployeePraiseCriticisms,
				tbPromotionTrainings);
	}

}
