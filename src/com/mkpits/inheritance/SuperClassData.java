package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperClassData {
	
	 String fName,lName,email;
	
	void getfName(String fname){
		
		//System.out.println("My First Name Is "+fname);
		this.fName=fname;
	}
	 
	 void getlName(String lName) throws IOException {
		 //System.out.println(lName);
		
		 this.lName=lName;
//		 if (lName.equals("lName")) {
//			 //System.out.println(" valid");
//			 } else {
//			 System.out.println(" invalid plz Enter lName");
//			 
//			 }
		 
		 
	 }
	  
	 void getemail(String email) {
		// System.out.println(email);
		 this.email=email;
	 }

}
