package ppms.domain;

import java.util.Date;

/**
 * AbstractOperatorNj entity provides the base persistence definition of the
 * OperatorNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOperatorNj implements java.io.Serializable {

	// Fields

	private Integer operatorId;
	private String name;
	private Boolean sex;
	private Integer orgId;
	private String addr;
	private String telephone;
	private String office;
	private Date createTime;
	private Date invalidTime;
	private Boolean statusId;
	private Byte maxLoginTimes;
	private Byte currLoginTimes;
	private Integer empNo;
	private Boolean type;
	private String mobile;
	private Date changeDate;

	// Constructors

	/** default constructor */
	public AbstractOperatorNj() {
	}

	/** minimal constructor */
	public AbstractOperatorNj(Integer operatorId) {
		this.operatorId = operatorId;
	}

	/** full constructor */
	public AbstractOperatorNj(Integer operatorId, String name, Boolean sex,
			Integer orgId, String addr, String telephone, String office,
			Date createTime, Date invalidTime, Boolean statusId,
			Byte maxLoginTimes, Byte currLoginTimes, Integer empNo,
			Boolean type, String mobile, Date changeDate) {
		this.operatorId = operatorId;
		this.name = name;
		this.sex = sex;
		this.orgId = orgId;
		this.addr = addr;
		this.telephone = telephone;
		this.office = office;
		this.createTime = createTime;
		this.invalidTime = invalidTime;
		this.statusId = statusId;
		this.maxLoginTimes = maxLoginTimes;
		this.currLoginTimes = currLoginTimes;
		this.empNo = empNo;
		this.type = type;
		this.mobile = mobile;
		this.changeDate = changeDate;
	}

	// Property accessors

	public Integer getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getInvalidTime() {
		return this.invalidTime;
	}

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}

	public Boolean getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Boolean statusId) {
		this.statusId = statusId;
	}

	public Byte getMaxLoginTimes() {
		return this.maxLoginTimes;
	}

	public void setMaxLoginTimes(Byte maxLoginTimes) {
		this.maxLoginTimes = maxLoginTimes;
	}

	public Byte getCurrLoginTimes() {
		return this.currLoginTimes;
	}

	public void setCurrLoginTimes(Byte currLoginTimes) {
		this.currLoginTimes = currLoginTimes;
	}

	public Integer getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

}