package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */
public class TbAreaOrgRelation extends AbstractTbAreaOrgRelation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbAreaOrgRelation() {
	}

	/** minimal constructor */
	public TbAreaOrgRelation(Integer areaOrgId) {
		super(areaOrgId);
	}

	/** full constructor */
	public TbAreaOrgRelation(Integer areaOrgId, BigDecimal areaId,
			Integer orgId, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(areaOrgId, areaId, orgId, createdBy, createdTime, modifiedBy,
				modifiedTime);
	}

}
