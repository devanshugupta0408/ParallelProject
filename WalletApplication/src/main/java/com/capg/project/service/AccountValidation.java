package com.capg.project.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.project.bean.AccountDetails;

public class AccountValidation {
	
	private Pattern pattern;
	private Matcher matcher;

	private static final String username_Pattern = "^[a-z0-9_-]{3,15}$";
	private static final String password_Pattern ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	private static final String email_Pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public boolean validatephoneNumber(String phoneNumber) {
		
		if(phoneNumber.length() == 10)
			return true;
		else
			return false;
		
	}

	
	public boolean validateBalance(int balance) {
		if((balance < 1000) && (balance > 100000))
		return true;
		else
			return false;
	}
	
	public boolean validatecustomerName(String customerName) {
		return false;}
	
		public boolean validatecustomerEmail(String customerEmail)
		{
			
			pattern = Pattern.compile(email_Pattern);
			matcher= pattern.matcher(customerEmail);
			
			return matcher.matches();
			
		}
		public boolean validateusername(String username)
		{
			pattern = Pattern.compile(username_Pattern);
			matcher= pattern.matcher(username);
			
			return matcher.matches();
			
		}	
		public boolean validatepassword(String passowrd)
		{
			pattern = Pattern.compile(password_Pattern);
			matcher= pattern.matcher(passowrd);
			
			return matcher.matches();
			
		}
		public boolean validategender(String gender)
		{
			if(gender.equalsIgnoreCase("Male")|| gender.equalsIgnoreCase("M")|| gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("F")|| gender.equalsIgnoreCase("Others"))
			return true;
			else
				return false;
		}
		
		public boolean validateLogin(String username, String password)
		{
			AccountDetails d = new AccountDetails();
			if((d.getUsername()==username) && (d.getPassword() == password))
			return true;
			else 
				return false;
		
	}
	

}