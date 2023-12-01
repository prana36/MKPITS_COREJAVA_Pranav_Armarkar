package com.mkpits.method;

public class CallAllTypeOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnTypeAndArgument data1 = new MethodWithReturnTypeAndArgument();
		MethodWithArgumentAndNoReturnType data2 = new MethodWithArgumentAndNoReturnType();
		StaticMethodDeclaration data3 = new StaticMethodDeclaration();
		NonStaticMethodWithReturnType data4 = new NonStaticMethodWithReturnType();
		
		//data3.getallData();
		data4.main(args);;
        
	}

}
