package com.userImpl;

import com.user.User;
import com.user.UserCredentials;

public class UserDetail extends UserCredentials implements User{

	//primitive data type
	long contact_no = 99999999l;
	short pin_code = 4556;
	byte country_code = 91;
	int landline_no = 7894561;
	char gender = 'M';
	boolean fresher = false;
	float graduation_marks = 78.5f;
	double success_rate = 90.5d;
	int counter = 0;
	
	//non-primitive data type
//	String username = "User1";
	String[] skills = {"Java", "HTML", "Bootstrap"};
	
	
	//implicit type casting
	int pin_code2 = pin_code;
	long mobile_no = landline_no;
	double marks = graduation_marks;
	
	//explicit type casting
	int contact_no2 = (int) contact_no;
	float rate = (float) success_rate;
	

	public static void main(String[] args) {
		UserDetail ud2 = new UserDetail();
		ud2.printUserDetails();
		
	}

	@Override
	public void printUserDetails() {
		
//		  System.out.println(contact_no); System.out.println(pin_code);
//		  System.out.println(country_code); System.out.println(landline_no);
//		  System.out.println(gender); System.out.println(fresher);
//		  System.out.println(graduation_marks); System.out.println(success_rate);
		  System.out.println(username); 
		  System.out.println(password);
		 
//		  System.out.println("Implicit Type casting: "); System.out.println(pin_code2);
//		  System.out.println(mobile_no);; System.out.println(marks);
//		  System.out.println("Explicit Type casting: ");
//		  System.out.println(contact_no2); System.out.println(rate);
//		  
//		  while(counter < skills.length) {
//			  System.out.println(skills[counter]); 
//			  counter++; 
//		  }
		 
	}

}
