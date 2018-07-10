package com.capg.project.bean;

import java.time.LocalDate;

public class AccountDetails {

	private String customerName;
	private String customerEmail;
	private String gender;
	private String phoneNumber;
	private int age;
	private LocalDate dob;
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber2) {
		this.accountNumber = accountNumber2;
	}
	@Override
	public String toString() {
		return "AccountDetails [customerName=" + customerName + ", customerEmail=" + customerEmail + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", age=" + age + ", dob=" + dob + ", accountNumber="
				+ accountNumber + ", username=" + username + ", password=" + password + ", balance=" + balance + "]";
	}
	

	
	
}
