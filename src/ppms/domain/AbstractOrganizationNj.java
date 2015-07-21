package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrganizationNj entity provides the base persistence definition of the
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrganizationNj implements java.io.Serializable {

	// Fields

	private Integer orgId;
	private String orgName;
	private String address;
	private Date expireTime;
	private Integer superiorId;
	private Boolean status;
	private String contactName;
	private String contactTel;
	private BigDecimal userCounty;
	private Byte type;
	private Integer regionId;
	private String channelType;
	private Set tbChangeOrgHistories = new HashSet(0);
	private Set tbStandardChecks = new HashSet(0);
	private Set tbSubAreaOrgRelations = new HashSet(0);
	private Set tbOperationChecks = new HashSet(0);
	private Set tbFreshEmployeeExams = new HashSet(0);
	private Set tbMonthExams = new HashSet(0);
	private Set tbMonitorChecks = new HashSet(0);
	private Set tbMountGuardExams = new HashSet(0);
	private Set tbPerformances = new HashSet(0);
	private Set tbVisitChecks = new HashSet(0);
	private Set tbInnovations = new HashSet(0);
	private Set tbOrgPraiseCriticisms = new HashSet(0);
	private Set tbEmployees = new HashSet(0);
	private Set tbPromotionTrainings = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrganizationNj() {
	}

	/** minimal constructor */
	public AbstractOrganizationNj(Integer orgId) {
		this.orgId = orgId;
	}

	/** full constructor */
	public AbstractOrganizationNj(Integer orgId, String orgName,
			String address, Date expireTime, Integer superiorId,
			Boolean status, String contactName, String contactTel,
			BigDecimal userCounty, Byte type, Integer regionId,
			String channelType, Set tbChangeOrgHistories, Set tbStandardChecks,
			Set tbSubAreaOrgRelations, Set tbOperationChecks,
			Set tbFreshEmployeeExams, Set tbMonthExams, Set tbMonitorChecks,
			Set tbMountGuardExams, Set tbPerformances, Set tbVisitChecks,
			Set tbInnovations, Set tbOrgPraiseCriticisms, Set tbEmployees,
			Set tbPromotionTrainings) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.address = address;
		this.expireTime = expireTime;
		this.superiorId = superiorId;
		this.status = status;
		this.contactName = contactName;
		this.contactTel = contactTel;
		this.userCounty = userCounty;
		this.type = type;
		this.regionId = regionId;
		this.channelType = channelType;
		this.tbChangeOrgHistories = tbChangeOrgHistories;
		this.tbStandardChecks = tbStandardChecks;
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
		this.tbOperationChecks = tbOperationChecks;
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
		this.tbMonthExams = tbMonthExams;
		this.tbMonitorChecks = tbMonitorChecks;
		this.tbMountGuardExams = tbMountGuardExams;
		this.tbPerformances = tbPerformances;
		this.tbVisitChecks = tbVisitChecks;
		this.tbInnovations = tbInnovations;
		this.tbOrgPraiseCriticisms = tbOrgPraiseCriticisms;
		this.tbEmployees = tbEmployees;
		this.tbPromotionTrainings = tbPromotionTrainings;
	}

	// Property accessors

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getSuperiorId() {
		return this.superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public BigDecimal getUserCounty() {
		return this.userCounty;
	}

	public void setUserCounty(BigDecimal userCounty) {
		this.userCounty = userCounty;
	}

	public Byte getType() {
		return this.type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Set getTbChangeOrgHistories() {
		return this.tbChangeOrgHistories;
	}

	public void setTbChangeOrgHistories(Set tbChangeOrgHistories) {
		this.tbChangeOrgHistories = tbChangeOrgHistories;
	}

	public Set getTbStandardChecks() {
		return this.tbStandardChecks;
	}

	public void setTbStandardChecks(Set tbStandardChecks) {
		this.tbStandardChecks = tbStandardChecks;
	}

	public Set getTbSubAreaOrgRelations() {
		return this.tbSubAreaOrgRelations;
	}

	public void setTbSubAreaOrgRelations(Set tbSubAreaOrgRelations) {
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
	}

	public Set getTbOperationChecks() {
		return this.tbOperationChecks;
	}

	public void setTbOperationChecks(Set tbOperationChecks) {
		this.tbOperationChecks = tbOperationChecks;
	}

	public Set getTbFreshEmployeeExams() {
		return this.tbFreshEmployeeExams;
	}

	public void setTbFreshEmployeeExams(Set tbFreshEmployeeExams) {
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
	}

	public Set getTbMonthExams() {
		return this.tbMonthExams;
	}

	public void setTbMonthExams(Set tbMonthExams) {
		this.tbMonthExams = tbMonthExams;
	}

	public Set getTbMonitorChecks() {
		return this.tbMonitorChecks;
	}

	public void setTbMonitorChecks(Set tbMonitorChecks) {
		this.tbMonitorChecks = tbMonitorChecks;
	}

	public Set getTbMountGuardExams() {
		return this.tbMountGuardExams;
	}

	public void setTbMountGuardExams(Set tbMountGuardExams) {
		this.tbMountGuardExams = tbMountGuardExams;
	}

	public Set getTbPerformances() {
		return this.tbPerformances;
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

	public Set getTbVisitChecks() {
		return this.tbVisitChecks;
	}

	public void setTbVisitChecks(Set tbVisitChecks) {
		this.tbVisitChecks = tbVisitChecks;
	}

	public Set getTbInnovations() {
		return this.tbInnovations;
	}

	public void setTbInnovations(Set tbInnovations) {
		this.tbInnovations = tbInnovations;
	}

	public Set getTbOrgPraiseCriticisms() {
		return this.tbOrgPraiseCriticisms;
	}

	public void setTbOrgPraiseCriticisms(Set tbOrgPraiseCriticisms) {
		this.tbOrgPraiseCriticisms = tbOrgPraiseCriticisms;
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbPromotionTrainings() {
		return this.tbPromotionTrainings;
	}

	public void setTbPromotionTrainings(Set tbPromotionTrainings) {
		this.tbPromotionTrainings = tbPromotionTrainings;
	}

}