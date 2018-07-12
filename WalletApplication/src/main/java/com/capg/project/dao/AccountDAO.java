package com.capg.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.project.bean.AccountDetails;




public class AccountDAO implements IAccountDAO {


	boolean flag = false;
	Scanner sc = new Scanner(System.in);
	static List<AccountDetails> list = new ArrayList<AccountDetails>();

	public boolean createAccount(AccountDetails account)

	{
		flag = list.add(account);
		return flag;
	}
	public AccountDetails depositBalance(int deposit,AccountDetails ad)
	{ 

	  ad.setBalance(ad.getBalance() + deposit);
		return ad;
	}
	public static List<AccountDetails> List() {

		return list;

	}
	public AccountDetails showBalance(AccountDetails AD) {
	
		return AD;
	}
	public AccountDetails withdrawBalance(int withdraw,AccountDetails ad) {
	
		int withdrawn = ad.getBalance() - withdraw;
		if (withdrawn >= 0) {
			ad.setBalance(withdrawn);
			return ad;
		
		}
		return null;
	}

public boolean FundTransfer() {
	return flag;}
public AccountDetails withdrawBalance(double withdraw, AccountDetails ad) {
	return ad;
	
}
}
