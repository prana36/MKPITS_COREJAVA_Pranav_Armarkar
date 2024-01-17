package com.mkpits.genericsandcollection;

public class EqualOrNotEqual {

	public static void main(String[] args) {
		String name1 = new String("Pranav");
		String name2 = new String("Pranav");
		
		if (name1.equals(name2)) // In equals method checking internal contain  
		{
			System.out.println("Both Strings Are Equals ");
			
		} else {
			System.out.println("Both String Are Not Equals");

		}
		
		if (name1==name2) //In equals method checking internal contain as well as memory Adress
		{
			System.out.println("Both Strings Are Equals ");
			
		} else {
			System.out.println("Both String Are Not Equals");

		}

	}

}
