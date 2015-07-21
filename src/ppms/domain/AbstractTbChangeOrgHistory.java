package ppms.domain;

import java.util.Date;

/**
 * AbstractTbChangeOrgHistory entity provides the base persistence definition of
 * the TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeOrgHistory implements
		java.io.Serializable {

	// Fields

	private String orgHistoryId;
	private OrganizationNj organizationNj;
	private String employeeId;
	private Integer inOrgId;
	private Date changeDate;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbChangeOrgHistory() {
	}

	/** minimal constructor */
	public AbstractTbChangeOrgHistory(String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
	}

	/** full constructor */
	public AbstractTbChangeOrgHistory(String orgHistoryId,
			OrganizationNj organizationNj, String employeeId, Integer inOrgId,
			Date changeDate, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.orgHistoryId = orgHistoryId;
		this.organizationNj = organizationNj;
		this.employeeId = employeeId;
		this.inOrgId = inOrgId;
		this.changeDate = changeDate;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getOrgHistoryId() {
		return this.orgHistoryId;
	}

	public void setOrgHistoryId(String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getInOrgId() {
		return this.inOrgId;
	}

	public void setInOrgId(Integer inOrgId) {
		this.inOrgId = inOrgId;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
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