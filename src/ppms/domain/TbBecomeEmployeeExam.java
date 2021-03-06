package ppms.domain;

import java.util.Date;

/**
 * TbBecomeEmployeeExam entity. @author MyEclipse Persistence Tools
 */
public class TbBecomeEmployeeExam extends AbstractTbBecomeEmployeeExam
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbBecomeEmployeeExam() {
	}

	/** minimal constructor */
	public TbBecomeEmployeeExam(String examId) {
		super(examId);
	}

	/** full constructor */
	public TbBecomeEmployeeExam(String examId, String employeeId,
			Integer orgId, Date examDate, Double examScore,
			Short chinesePrintCount, Short numberPrintCount, String remark,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(examId, employeeId, orgId, examDate, examScore,
				chinesePrintCount, numberPrintCount, remark, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
