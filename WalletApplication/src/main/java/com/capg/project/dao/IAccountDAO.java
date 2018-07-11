package com.capg.project.dao;

import com.capg.project.bean.AccountDetails;


public interface IAccountDAO {
	public boolean createAccount(AccountDetails account);
	public AccountDetails deposit(int deposit,AccountDetails ad);
	public AccountDetails showBalance(AccountDetails AD);
}
