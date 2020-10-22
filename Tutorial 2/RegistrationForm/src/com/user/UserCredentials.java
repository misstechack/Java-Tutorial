package com.user;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCredentials  extends UserPersonalInfo implements Cloneable {
	String username = "";
	String password = "";
	
	
	//constructors
	public UserCredentials() {
		super();
		System.out.println("Empty Constructor");
	}
	public UserCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		System.out.println("Parameterized Constructor");
	}
	
	//initializer blocks
	{
		this.username = "user1";
		System.out.println("Initializer Block 1");
	}
	{
		this.username = "user2";
		this.password = "admin";
		System.out.println("Initializer Block 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserCredentials uc = new UserCredentials("John", "Green");
		uc.printCred();
		UserCredentials uc2 = new UserCredentials();
		uc2.getCred();
	}
	
	//methods
	public void getCred() {
		String username = "admin";
		String password = "admin";
		System.out.println("Username: " + username+", Password: "+password);
	}
	public void printCred() {
		System.out.println("Username: " + username+", Password: "+password);
	}
}
