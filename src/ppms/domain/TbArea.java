package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbArea entity. @author MyEclipse Persistence Tools
 */
public class TbArea extends AbstractTbArea implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbArea() {
	}

	/** minimal constructor */
	public TbArea(BigDecimal areaId) {
		super(areaId);
	}

	/** full constructor */
	public TbArea(BigDecimal areaId, BigDecimal subAreaId, String areaDesc,
			Boolean status, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(areaId, subAreaId, areaDesc, status, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
