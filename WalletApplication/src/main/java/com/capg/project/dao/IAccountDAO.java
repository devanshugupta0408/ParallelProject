package com.capg.project.dao;


import com.capg.project.bean.AccountDetails;


public interface IAccountDAO {
	public boolean createAccount(AccountDetails account);
	public boolean depositBalance(int deposit,AccountDetails ad);
	public void showBalance(AccountDetails AD);
	public boolean withdrawBalance(int withdraw,AccountDetails ad);
	public boolean FundTransfer(long accountNumber, AccountDetails ad);
	public void PrintTransaction(AccountDetails ad);
}
