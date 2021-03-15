package com.class13;

public class Account {

     String userName;
	 String password;
	 double balance;
	 String accountNumber;
	 boolean isLogedIn;
	
	public void login(String passedUserNameWhenLogging, String passedPasswordWhenLogging) {
		if(userName.equals(passedUserNameWhenLogging)&&password.equals(passedPasswordWhenLogging)) {
			System.out.println("Welcome to BOA your balance is "+balance);
		}else {
			System.out.println("Username or password is incorrect");
		}

	}
	public void printInfo() {
		if(isLogedIn) {
			System.out.println("Your account number is "+accountNumber+" your balance is "+balance);
		}
	}
	


}
