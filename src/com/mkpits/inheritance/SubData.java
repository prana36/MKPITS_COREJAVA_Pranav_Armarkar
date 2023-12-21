package com.mkpits.inheritance;


public class SubData extends SuperClassData {
	long mob;
	char gender;
	int pinCode;
  
	
	void getDetails() {
	System.out.println("My First Name Is "+fName);
	System.out.println("My Last Name Is "+lName);
	System.out.println("My Email is "+email); 
	System.out.println("My Mobile No. is "+mob);
	System.out.println("My Gender is "+gender);
	System.out.println("My PinCode is "+pinCode);	
	}

	void getMobile(long mob) {
		
	  
		if (mob==mob) {
			
		} else {
			System.out.println("invalid");

		}
		this.mob=mob;
	}
	void getGender(char gender) {
		//System.out.println(gender);
		this.gender=gender;
	}
	
	void getPinCode(int pinCode) {
		
		//System.out.println(pinCode);
		this.pinCode=pinCode;
	}
	
}
