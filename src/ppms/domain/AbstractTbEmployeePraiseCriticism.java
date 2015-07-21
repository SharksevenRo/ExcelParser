package ppms.domain;

import java.util.Date;

/**
 * AbstractTbEmployeePraiseCriticism entity provides the base persistence
 * definition of the TbEmployeePraiseCriticism entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbEmployeePraiseCriticism implements
		java.io.Serializable {

	// Fields

	private String praiseCriticismId;
	private TbEmployee tbEmployee;
	private Integer orgId;
	private String praiseCriticismType;
	private String cause;
	private Date praiseCriticismDate;
	private String praiseCriticismLevel;
	private String orgPraiseCriticmRelationId;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbEmployeePraiseCriticism() {
	}

	/** minimal constructor */
	public AbstractTbEmployeePraiseCriticism(String praiseCriticismId) {
		this.praiseCriticismId = praiseCriticismId;
	}

	/** full constructor */
	public AbstractTbEmployeePraiseCriticism(String praiseCriticismId,
			TbEmployee tbEmployee, Integer orgId, String praiseCriticismType,
			String cause, Date praiseCriticismDate,
			String praiseCriticismLevel, String orgPraiseCriticmRelationId,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.praiseCriticismId = praiseCriticismId;
		this.tbEmployee = tbEmployee;
		this.orgId = orgId;
		this.praiseCriticismType = praiseCriticismType;
		this.cause = cause;
		this.praiseCriticismDate = praiseCriticismDate;
		this.praiseCriticismLevel = praiseCriticismLevel;
		this.orgPraiseCriticmRelationId = orgPraiseCriticmRelationId;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getPraiseCriticismId() {
		return this.praiseCriticismId;
	}

	public void setPraiseCriticismId(String praiseCriticismId) {
		this.praiseCriticismId = praiseCriticismId;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getPraiseCriticismType() {
		return this.praiseCriticismType;
	}

	public void setPraiseCriticismType(String praiseCriticismType) {
		this.praiseCriticismType = praiseCriticismType;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Date getPraiseCriticismDate() {
		return this.praiseCriticismDate;
	}

	public void setPraiseCriticismDate(Date praiseCriticismDate) {
		this.praiseCriticismDate = praiseCriticismDate;
	}

	public String getPraiseCriticismLevel() {
		return this.praiseCriticismLevel;
	}

	public void setPraiseCriticismLevel(String praiseCriticismLevel) {
		this.praiseCriticismLevel = praiseCriticismLevel;
	}

	public String getOrgPraiseCriticmRelationId() {
		return this.orgPraiseCriticmRelationId;
	}

	public void setOrgPraiseCriticmRelationId(String orgPraiseCriticmRelationId) {
		this.orgPraiseCriticmRelationId = orgPraiseCriticmRelationId;
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