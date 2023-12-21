package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidationToMethod {

	public static void main(String[] args) throws IOException {
		SubData sd = new SubData();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 2; i++) {
			
		System.out.print("Enter lname: " );
		String lName= br.readLine();
		if (lName.equals(lName))  {
			//System.out.println("Invailed");
			break;
		}
		//break;
		//sd.getlName(lName);
		}
		
		
		
	}

}
