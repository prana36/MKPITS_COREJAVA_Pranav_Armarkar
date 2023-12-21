package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallingMethod {

	public static void main(String[] args) throws IOException {
		SubData sd = new SubData();
		String s1 = new String();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter fname: " );
		//String fName= br.readLine();
		System.out.println();
		sd.getfName(br.readLine());
		
		System.out.print("Enter lname: " );
		String lName= br.readLine();
		sd.getlName(lName);
		
		System.out.print("Enter email: " );
		String email= br.readLine();
		sd.getemail(email);

		System.out.print("Enter mobile: " );
		long mob=Long.parseLong( br.readLine());
		sd.getMobile(mob);
		
		System.out.print("Enter Gender: " );
		char gender = (char) br.read();
		br.readLine();
          	   	
		sd.getGender(gender);
		
		System.out.print("Enter pinCod: " );
		int pinCode= Integer.parseInt(br.readLine());
		sd.getPinCode(pinCode);
		
		sd.getDetails();
	}

}
