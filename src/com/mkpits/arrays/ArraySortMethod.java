package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter range :- ");
		int r=Integer.parseInt(br.readLine());
		
		
		String num[]=new String[r];
		
		for (int i = 0; i < num.length; i++) {
			 num[i]=br.readLine();
			
		}
		for (int i = 0; i < num.length; i++) {
			String string = num[i];
			System.out.println(num[i]);
			
		}
		
		
		System.out.println("After sorting \n");
        
		Arrays.sort(num);
		
		for (String number:num ) {
			System.out.println( number);
		}
	}

}
