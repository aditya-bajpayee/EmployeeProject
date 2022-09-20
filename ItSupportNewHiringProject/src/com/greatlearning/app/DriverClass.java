package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredService;

public class DriverClass {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Last Name");
		String fn=scanner.next();
		System.out.println("Enter Last Name");
		String ln=scanner.next();
		Employee e1= new Employee(fn,ln);
		
		CredService cs= new CredService();
		String generateEmail="";
		char[] genPwd=null;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("pls choose your department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("5. Exit");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Technical");
			genPwd=cs.generatePassword();
			break;
		case 2:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Admin");
			genPwd=cs.generatePassword();
			break;
		case 3:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"HumanResource");
			genPwd=cs.generatePassword();
			break;
		case 4:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Legal");
			genPwd=cs.generatePassword();
			break;
		case 5:
			System.exit(0);
			
		default:
			System.out.println("please enter valid option");
		
				
		}
		cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generateEmail,genPwd);
		//System.out.println("Email ID: " +generateEmail);
		//System.out.println("Password: " +genPwd);
		}while(true);
		
	}

}
