package com.tyhj.travel.entity;

import java.sql.Date;

import com.tyhj.travel.base.entity.Entity;

public class Account extends Entity {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountName;
	private String accountPwd;
	private String accountPwd2;
	private Integer accountLevel;
	private Integer isDelete;
	private Date createDate;
	private String accountPhone;
	private String accountEmail;
	private String accountUuid;
	private String roleId;
	private String accountType;

	// Constructors

	
	
	public String getAccountName() {
		return accountName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPwd() {
		return accountPwd;
	}

	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}

	public String getAccountPwd2() {
		return accountPwd2;
	}

	public void setAccountPwd2(String accountPwd2) {
		this.accountPwd2 = accountPwd2;
	}

	public Integer getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(Integer accountLevel) {
		this.accountLevel = accountLevel;
	}

	public String getAccountPhone() {
		return accountPhone;
	}

	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}

	public String getAccountEmail() {
		return accountEmail;
	}

	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}

	public String getAccountUuid() {
		return accountUuid;
	}

	public void setAccountUuid(String accountUuid) {
		this.accountUuid = accountUuid;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}