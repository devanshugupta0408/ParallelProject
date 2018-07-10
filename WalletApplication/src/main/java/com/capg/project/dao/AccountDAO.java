package com.capg.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.project.bean.AccountDetails;




public class AccountDAO implements IAccountDAO {


	boolean flag = false;
	Scanner sc = new Scanner(System.in);
	List<AccountDetails> list = new ArrayList<AccountDetails>();

	public boolean createAccount(AccountDetails account)

	{
		flag = list.add(account);
		return flag;
	}
	public AccountDetails deposit(int deposit,AccountDetails ad)

	{ ad.setBalance(ad.getBalance() + deposit);
		return ad;
	}
	
	public List<AccountDetails> showBalance() {
		
		for (AccountDetails ac : list) {
				System.out.println(ac);
			}
			

		return list;
	}

public boolean FundTransfer() {
	return flag;}
public AccountDetails withdrawBalance(double withdraw, AccountDetails ad) {
	return ad;
	
}
}
