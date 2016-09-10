package com.tyhj.travel.service;


import com.tyhj.travel.base.dao.support.SqlParameter;
import com.tyhj.travel.entity.Account;

public interface AccountService {

	public Account read(final Class<Account> clazz, final String sqlId, final SqlParameter parameter);
	
	public long addAccount(Account account);
}
