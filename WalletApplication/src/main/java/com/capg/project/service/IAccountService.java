package com.capg.project.service;

import java.util.List;

import com.capg.project.bean.AccountDetails;

public interface IAccountService {
	public boolean createAccount(AccountDetails account);
	public AccountDetails deposit(int deposit,AccountDetails ad);
	public List<AccountDetails> showBalance();

}
