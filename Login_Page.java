package com.Practice;

import java.util.Scanner;

public class Login_Page {
public static void main(String[] args) {
	String passId="jyo@123";
	String userName="jgaikwad";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your UserName");
	String uName=sc.nextLine();
	System.out.println("Enter your password");

	String pword=sc.nextLine();
	if(userName.equals(uName) && passId.equals(pword)) {
		System.out.println("User has logged in successfully ..!!");
	}else {
		System.out.println("Username or password incorrect");
	}

}
}