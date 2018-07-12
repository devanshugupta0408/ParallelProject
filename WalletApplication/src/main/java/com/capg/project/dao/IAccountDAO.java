package com.capg.project.dao;

import com.capg.project.bean.AccountDetails;


public interface IAccountDAO {
	public boolean createAccount(AccountDetails account);
	public AccountDetails depositBalance(int deposit,AccountDetails ad);
	public AccountDetails showBalance(AccountDetails AD);
	public AccountDetails withdrawBalance(int withdraw,AccountDetails ad);
}
