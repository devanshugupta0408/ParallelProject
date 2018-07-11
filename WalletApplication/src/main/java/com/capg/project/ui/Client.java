package com.capg.project.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



import com.capg.project.bean.AccountDetails;
import com.capg.project.service.AccountService;
import com.capg.project.service.AccountValidation;



public class Client {
	static boolean b;
	public static void main(String[] args) {
		AccountValidation valid = new AccountValidation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AccountService service = new AccountService();

		while(true) {
			AccountDetails account = new AccountDetails();
			
		System.out.println("Payment Wallet Application");
		System.out.println("1. Create account");
		System.out.println("2. Show Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Print Transactions");
		System.out.println("5. Fund Transfer");
		System.out.println("6. Withdraw money");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try {
		switch(i) {
			case 1 : System.out.println("Enter your name");
			
				String customerName = br.readLine();
				account.setCustomerName(customerName);
				
				
				System.out.println("Enter age");
				int age = sc.nextInt();
				
				System.out.println("Mobile Number");
				String phoneNumber = br.readLine();
				boolean isphoneNumber = valid.validatephoneNumber(phoneNumber);
				
				DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.println("Enter your DOB");
				Scanner sc1 = new Scanner(System.in);
				String date1 = sc1.next();
				LocalDate dob = LocalDate.parse(date1,date);
				
				System.out.println("Enter Gender : Male/Female/M/F/Others");
				String gender = br.readLine();
				
				
				long accountNumber = (long) (Math.random() * 100000 + 99999);
				
				
				
				System.out.println("Enter your email id");
				String customerEmail = br.readLine();
				account.setCustomerEmail(customerEmail);
				boolean iscustomerEmail = valid.validatecustomerEmail(customerEmail);
				if(!iscustomerEmail)
					System.out.println("Invalid Input");
				
				System.out.println("Enter username : use aplabets and characters from a-z, 0-9, underscore _, hyphen-");
				String username = br.readLine();
				account.setUsername(username);
				boolean isusername = valid.validateusername(username);
				if(!isusername)
					System.out.println("Invalid Input");
				
				System.out.println("Enter password : use aplabets and characters from a-z, 0-9. \n It should have atleast 1 Upper case character, 1 Lower case character, 1 special character and 1 digit. MIN LENGTH IS 6 MAX LENGTH IS 20 " );
				String password = br.readLine();
				account.setPassword(password);
				boolean ispassword = valid.validatepassword(password);
				if(!ispassword)
					System.out.println("Invalid input");
				
				account.setAge(age);
				account.setGender(gender);
				account.setPhoneNumber(phoneNumber);
				account.setDob(dob);
				account.setAccountNumber(accountNumber);
				
				if(isphoneNumber&&iscustomerEmail&&ispassword&&isusername) {
					b =service.createAccount(account);
					System.out.println("Account Created Successfully");
					System.out.println("Your account number is " + accountNumber);
					
					
				}
				else {
					System.out.println("Invalid");
				}
				break;
			case 2 :
				System.out.println("Enter username1");
				String username1 = br.readLine();
				System.out.println("Enter password1");
				String password1 = br.readLine();
				
				account = valid.validateLogin(username1, password1);
				if(account!=null)
					System.out.println(account.getBalance());
				break;		
				
			case 3: 
			System.out.println("Enter username");
			String username2 = br.readLine();
			System.out.println("Enter password");
			String password2 = br.readLine();
		account  = valid.validateLogin(username2, password2);
			
			if(account!=null)
			{
			
				System.out.println("Enter amount to deposit");
				int balance = sc.nextInt();
			//	if(balance<0)
				//	System.out.println("Invalid Input");
				
			//	else
				service.deposit(balance, account);
			}
			
			break;
			
			case 4 :
				System.out.println("Enter username");
				String username3 = br.readLine();
				System.out.println("Enter password");
				String password3 = br.readLine();
			account  = valid.validateLogin(username3, password3);
				
				if(account!=null)
				{ System.out.println("Enter amount to withdraw");
				int with = sc.nextInt();
				if (service.withdrawBalance(with, account) != null) {
					System.out.println(account);
					System.out.println("♠• Amount Successfuly Withdrawn. •♠");
					break;
				} else if (service.withdrawBalance(with, account) == null) {
					System.err.println("Insufficient Funds!");
					break;
				}

			} else if (account == null) {
				System.err.println("Incorrect Username or Password!");
			}
				break;
			//else
				//System.out.println("Invalid details");
			//System.out.println("Your balance is " + account.getBalance());
			}
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
	}

}
}
