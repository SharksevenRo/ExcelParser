package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractTbAreaOrgRelation entity provides the base persistence definition of
 * the TbAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbAreaOrgRelation implements java.io.Serializable {

	// Fields

	private Integer areaOrgId;
	private BigDecimal areaId;
	private Integer orgId;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbAreaOrgRelation() {
	}

	/** minimal constructor */
	public AbstractTbAreaOrgRelation(Integer areaOrgId) {
		this.areaOrgId = areaOrgId;
	}

	/** full constructor */
	public AbstractTbAreaOrgRelation(Integer areaOrgId, BigDecimal areaId,
			Integer orgId, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.areaOrgId = areaOrgId;
		this.areaId = areaId;
		this.orgId = orgId;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Integer getAreaOrgId() {
		return this.areaOrgId;
	}

	public void setAreaOrgId(Integer areaOrgId) {
		this.areaOrgId = areaOrgId;
	}

	public BigDecimal getAreaId() {
		return this.areaId;
	}

	public void setAreaId(BigDecimal areaId) {
		this.areaId = areaId;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
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