package com.mkpits.typecasting;

public class ExplicitTypeCasting {
	//Explicit Type Casting
	//it Converting a higher data type into a lower one 
    //It is done manually by the programmer
	//double -> float -> long -> int -> char -> short -> byte
	

	public static void main(String[] args) {
		double d = 23.45;  
		System.out.println("Before conversion: "+d);
		
		//converting double data type into long data type  
		long l = (long)d;  
		System.out.println("After conversion into long type: "+l);
		
		//converting long data type into int data type  
		int i = (int)l; 
		System.out.println("After conversion into int type: "+i); 
		  
		
	}

}
