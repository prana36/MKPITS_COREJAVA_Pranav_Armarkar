package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	String name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void getName() throws IOException {
    	for (int i = 0; i < 10; i++) {
			System.out.println("Enter name"+br.readLine());
			
		}
    	
	}

}
