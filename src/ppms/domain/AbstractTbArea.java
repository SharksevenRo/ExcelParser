package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractTbArea entity provides the base persistence definition of the TbArea
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbArea implements java.io.Serializable {

	// Fields

	private BigDecimal areaId;
	private BigDecimal subAreaId;
	private String areaDesc;
	private Boolean status;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbArea() {
	}

	/** minimal constructor */
	public AbstractTbArea(BigDecimal areaId) {
		this.areaId = areaId;
	}

	/** full constructor */
	public AbstractTbArea(BigDecimal areaId, BigDecimal subAreaId,
			String areaDesc, Boolean status, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.areaId = areaId;
		this.subAreaId = subAreaId;
		this.areaDesc = areaDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public BigDecimal getAreaId() {
		return this.areaId;
	}

	public void setAreaId(BigDecimal areaId) {
		this.areaId = areaId;
	}

	public BigDecimal getSubAreaId() {
		return this.subAreaId;
	}

	public void setSubAreaId(BigDecimal subAreaId) {
		this.subAreaId = subAreaId;
	}

	public String getAreaDesc() {
		return this.areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}