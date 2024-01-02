package com.mkpits.abstractions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BankRegistration extends DepositeWithdrow {
	
	
	
	
	String name , accountType,mob ,aadhar,email,pass,cPass,b;
	long accountNumber,deposite,withdrow,balance;
	int otp,otp1;
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 
	
	 
	void choice() throws NumberFormatException, IOException
	{
		System.out.println("Welcome To  ना देना ना लेना.. ");
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') 
		{		
		System.out.println("1.Creat Account \n2.Deposite \n3.Withdrow \n4.check Blance \n5. Account Details");
        System.out.print("Enter choice :- ");
        int  choice = Integer.parseInt(br.readLine()); 
       
       switch (choice) {
	case 1: creatAccount();
		
		break;
    case 2: amountDeposite();
		
		break;
    case 3:amountWithdrow();
	
	break;
	
    case 4:balanceInquiry();
		
		break;
		
    case 5:accountDetails();
		
		break;

	default:
		System.out.println("Enter Valid Choice");
		break;
	}
       System.out.println("\n Do You Wish to Continue Y|N");
		ch = (char) br.read();
		br.readLine();
       
		}
	}
	
	void creatAccount() throws IOException {
		System.out.print("Enter Account Holder Name :- ");
		while(true) {
		name = br.readLine();
		if (name.isEmpty()) {
			System.out.print("Please Enter Name :- ");
			continue;
		}
		break;
		}
		
		System.out.print("Enter Mobile No. :- ");
		while(true) {
    	mob=br.readLine();
//		String mob1= String.valueOf(mob);
		if (mob.length()!=10|| mob.isEmpty()||!mob.matches("\\d+")) {
			System.out.print("Please Enter vailed Mobile No. :- ");
			continue;
		}
		break;
		}
		
		System.out.print("Enter Aadhar No. :-");
		
		while(true) {
        aadhar = br.readLine();
        if (!aadhar.matches("\\d+")|| aadhar.isEmpty()|| aadhar.length()!=12) {
        	System.out.print("Please Enter Vailed Aadhar No. :- ");
			continue;
		}
        break;
		}
		
		System.out.print("Enter Account Type (Saving/Current) :- ");
		while(true) {
		accountType = br.readLine();
		 if (accountType.isEmpty()) {
			 System.out.println("Please Enter Account Type ");
			continue;
		}
		 break;
		}
		
		
		System.out.print("Enter Email :- ");
		
		while(true) 
		{
		email = br.readLine();
		
		//Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);    
        //Create instance of matcher   
        Matcher matcher = pattern.matcher(email);  
        if (!matcher.matches()||email.isEmpty()) {
				System.out.print("Email Not Valid Please Enter Valid Email :- ");
				
				continue;
			} 
        break;
		}
	
   
		
        System.out.print("Enter Some Amount :- ");
        while(true) {
        	 String b =br.readLine();
        	if (b.isEmpty()) {
        		System.out.print("please Enter Some Amount :- ");
        		
				continue;
			}
        	this.b=b;
            balance = Long.parseLong(b);
        	break;
        	
        	
        }
        
        
        
        
        
   
         while(true) {
        System.out.print("Enter Password :- ");
        pass=br.readLine();
        
        System.out.print("Enter Conform Password :- ");
        cPass=br.readLine();
        if (pass.equals(cPass)) {
        	System.out.println("Verified");
        	break;
			
		}else {
			System.out.print("Please enter vaild Password \n");
		}
         }
         
         otp = (int)Math.floor(Math.random()*10000);
         System.out.print("Your Otp is :- "+otp);
         this.otp=otp;
         
         System.out.print("Please Enter Otp :- ");
         while(true) {
        	 otp1=Integer.parseInt(br.readLine());
        	 if (otp==otp1) {
        		 System.out.println("Varified");
				break;
			}else {
				System.out.println("Please Enter Vaild Otp :- ");
				continue;
			}
         }
        
       
		accountNumber =(long)Math.floor(Math.random()*10000000);
		 System.out.print("Thank you \nyour Account Number is  :- "+accountNumber);
		
	}

	@Override
	void amountDeposite() throws NumberFormatException, IOException {
		System.out.print("Enter Deposite Amount :- ");
		deposite =Long.parseLong(br.readLine());
		balance += deposite;
		System.out.print("Deposite succesfully Your Balance :- "+balance);
		
	}

	@Override
	void amountWithdrow() throws NumberFormatException, IOException {
		System.out.print("Enter Withdrow Amount :- ");
		withdrow=Long.parseLong(br.readLine());
		balance -= withdrow;
		System.out.print("Withdrow succesfully Your Balance :- "+balance);
		
	}

	@Override
	void balanceInquiry() {
		balance += deposite;
		balance -= withdrow;
		System.out.print("Balance is :- "+balance);
		
	}
	
	void accountDetails() {
		
		System.out.print("Account Holder Name :- "+name);
		System.out.print("Mobile No. :- "+mob);
		System.out.print("Aadhar No. :- "+aadhar);
		System.out.print("Account Type is :- "+accountType);
		System.out.print("Email Id is :- "+email);
		System.out.print("Balance is :- "+balance);
		System.out.print("Account no. is :- "+accountNumber);
		
	}
	
	

}
