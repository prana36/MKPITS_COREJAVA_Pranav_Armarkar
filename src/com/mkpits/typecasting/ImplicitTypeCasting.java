package com.mkpits.typecasting;
// type casting is a method or process that converts a data type into another data type 
//in both ways manually and automatically.

public class ImplicitTypeCasting {
	//Implicit Type Casting (Widening Type Casting)
	//it Converting a lower data type into a higher one
	//It is done automatically. 
    // byte -> short -> char -> int -> long -> float -> double 
	// it can not convert short type into short type 
	// implementation
	public static void main(String[] args) 
	{
		byte a=10;
		System.out.println("byte:- "+a);
		
		//automatically converts the byte type into int type  
		int b=a;
		System.out.println("After convert into int type :- "+b);
		
		//automatically converts the integer type into long type  
		long c=b;
		System.out.println("After convert into long type :- "+c);
		
		//automatically converts the long type into float type  
        float f=c;
        System.out.println("After convert into float type :- "+f);
        
        
	}

}
