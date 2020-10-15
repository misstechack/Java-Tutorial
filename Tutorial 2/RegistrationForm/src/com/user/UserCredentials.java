package com.user;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCredentials  extends UserPersonalInfo implements Cloneable {
	protected String username = "";
	public String password = "";
	
	
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
//		UserCredentials uc = new UserCredentials("John", "Green");
//		uc.printCred();
//		UserCredentials uc2 = new UserCredentials();
//		uc2.getCred();
		
		try {
			//object creation
			
			//new keyword
			UserCredentials uc = new UserCredentials();
			System.out.println(uc.username);
			
			//clone method
			UserCredentials uc2 = (UserCredentials) uc.clone();
			System.out.println(uc2.username);
			
			//newInstance method
			UserCredentials uc3 = (UserCredentials) Class.forName("com.user.UserCredentials").newInstance();
			System.out.println(uc3.username);
			
			//Date class
			Date d = new Date();
			System.out.println(d);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date d2 = sdf.parse("30-05-2010");
			System.out.println(d2);
			
			uc.getEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	@Override
	public void getEmail() {
		// TODO Auto-generated method stub
		System.out.println("Email id: abc@xyz.com");
	}
}
