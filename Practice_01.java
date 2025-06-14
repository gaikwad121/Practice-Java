package com.Practice;

import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
 sum();
 Name();
 Percentage(97, 96, 99, 100, 98);
	}
	// calculate the percentage of sub out of 100
	static void Percentage(int num,int num1,int num2,int num3,int num4) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	 num=sc.nextInt();
	System.out.println("Enter Second number");

	 num1=sc.nextInt();
	System.out.println("Enter Third number");
	 num2=sc.nextInt();
	System.out.println("Enter Fourth number");
	 num3=sc.nextInt();
	System.out.println("Enter fifth number");
	 num4=sc.nextInt();
	 int per=num+num1+num2+num3+num4;
	 per=per/5;
	 System.out.println(per);
	}
// write java program for a sum of 3 number
	
	static void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("Enter Third number");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		System.out.println(sum);
	}
		// write a java code and aks user to Enter his or her name and print it
		
		static void Name() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a name");
			String name=sc.nextLine();
			System.out.println("My name is : "+name);
		}
		// Calculate GPG of 3 subject
		
		
	}

