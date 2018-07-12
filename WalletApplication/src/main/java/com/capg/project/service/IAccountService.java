package com.capg.project.service;

import com.capg.project.bean.AccountDetails;

public interface IAccountService {
	public boolean createAccount(AccountDetails account);
	
	public AccountDetails depositBalance(int deposit,AccountDetails ad);
	public AccountDetails showBalance(AccountDetails AD);
	public AccountDetails withdrawBalance(int withdraw,AccountDetails ad);

}
