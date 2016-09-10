package com.tyhj.travel.dao;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.tyhj.travel.base.dao.ReadDao;
import com.tyhj.travel.base.dao.WriteDao;
import com.tyhj.travel.base.dao.support.SqlParameter;
import com.tyhj.travel.entity.Account;

@Repository
public class AccountDao {
	@Resource
	private ReadDao readDao;
	@Resource
	private WriteDao writeDao;
	
	public long create(Account appointment) {
		return writeDao.create(Account.class, "account_create", appointment);
	}

	public long totalCount(SqlParameter parameter) {
		return readDao.count(Account.class, "account_count", parameter);
	}

	public Collection<Account> page(SqlParameter parameter) {
		return readDao.select(Account.class, "account_page", parameter);
	}

	public Account read(SqlParameter parameter) {
		return readDao.read(Account.class, "account_read", parameter);
	}

	public int delete(SqlParameter parameter) {
		return writeDao.delete(Account.class, "account_delete", parameter);
	}

	public int update(SqlParameter parameter) {
		return writeDao.update(Account.class, "account_update", parameter);
	}
	
	public int updatePwd(SqlParameter parameter) {
		return writeDao.update(Account.class, "account_updatePwd", parameter);
	}
	public int account_updatePhone(SqlParameter parameter) {
		return writeDao.update(Account.class, "account_updatePhone", parameter);
	}
	
	
}
