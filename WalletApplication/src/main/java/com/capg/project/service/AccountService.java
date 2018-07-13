package com.capg.project.service;

import java.util.List;

import com.capg.project.bean.AccountDetails;
import com.capg.project.dao.AccountDAO;


public class AccountService implements IAccountService {

	AccountDAO dao = new AccountDAO();

	public boolean createAccount(AccountDetails account) {
		return dao.createAccount(account);
	}


	
	public AccountDetails depositBalance(int deposit,AccountDetails ad) {
		return dao.depositBalance(deposit, ad);
		}
	
	public AccountDetails showBalance(AccountDetails AD) {

		return dao.showBalance(AD);

}

	public AccountDetails FundTransfer() {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountDetails withdrawBalance(int withdraw,AccountDetails ad) {
		return dao.withdrawBalance(withdraw, ad);
	}
	public AccountDetails FundTransfer(long accountNumber, AccountDetails ad) {
		return dao.FundTransfer(accountNumber, ad);
	}
}
