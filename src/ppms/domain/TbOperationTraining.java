package ppms.domain;

import java.util.Date;

/**
 * TbOperationTraining entity. @author MyEclipse Persistence Tools
 */
public class TbOperationTraining extends AbstractTbOperationTraining implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbOperationTraining() {
	}

	/** minimal constructor */
	public TbOperationTraining(String trainingId) {
		super(trainingId);
	}

	/** full constructor */
	public TbOperationTraining(String trainingId, String employeeId,
			Integer orgId, Date trainingDate, String trainingLevel,
			String trainingContent, Double trainingScore, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(trainingId, employeeId, orgId, trainingDate, trainingLevel,
				trainingContent, trainingScore, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
