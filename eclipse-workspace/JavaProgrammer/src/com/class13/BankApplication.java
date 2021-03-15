package com.class13;

public class BankApplication {

	public static void main(String[] args) {
		
		Account ghulamAccount=new Account();
		ghulamAccount.accountNumber="123";
		ghulamAccount.userName="Ghulam123";
		ghulamAccount.password="pass123";
		ghulamAccount.balance=1400;
		ghulamAccount.login("Ghulam123", "pass123");

	}

}
