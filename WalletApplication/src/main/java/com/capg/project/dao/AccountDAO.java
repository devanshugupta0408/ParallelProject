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

public AccountDetails FundTransfer(long accountNumber, AccountDetails ad) {
	
	System.out.println("Enter amount you want to transfer");
	int transferAmount = sc.nextInt();
	int balance = ad.getBalance();
	int userBalance = ad.getBalance();
	for(AccountDetails fund : list)
	{
		if(fund.getAccountNumber() == accountNumber)
		{
			if(userBalance >= transferAmount)
			{
				fund.setBalance(fund.getBalance() + transferAmount);
				ad.setBalance(userBalance-transferAmount);
				return fund;
			}
			else
				System.out.println("insufficient funds");
			
		}
	}
	
	return null;}

	

public static List<AccountDetails> List() {

	return list;

}
}
