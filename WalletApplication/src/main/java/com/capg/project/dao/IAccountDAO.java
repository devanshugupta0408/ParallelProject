package com.capg.project.dao;

import java.util.List;

import com.capg.project.bean.AccountDetails;


public interface IAccountDAO {
	public boolean createAccount(AccountDetails account);
	public AccountDetails deposit(int deposit,AccountDetails ad);
	public List<AccountDetails> showBalance();
}
