/**
 * 
 */
package com.tyhj.travel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tyhj.travel.base.dao.support.SqlParameter;
import com.tyhj.travel.dao.AccountDao;
import com.tyhj.travel.entity.Account;
import com.tyhj.travel.service.AccountService;

/**
 * @author wangyanfei
 * 
 */
@Service("AccountService")
public class AccountServiceImpl implements AccountService{
	@Resource
	AccountDao AccountDao;

	
	public long addAccount(Account Account){
		return AccountDao.create(Account);
	}
	
	@Override
	public Account read(Class<Account> clazz, String sqlId, SqlParameter parameter) {
		// TODO Auto-generated method stub
		return AccountDao.read(parameter);
	}
	
	public List<Account> findAccountAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account findAccount(int updateId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAccount(Account Account) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAccount(Account Account) {
		// TODO Auto-generated method stub
		
	}



}
