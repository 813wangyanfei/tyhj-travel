package com.tyhj.travel.base.dao.support;

public enum Order {
	
	Desc("desc"),
	Asc("asc"),
	;
	
	private String code;
	Order(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
